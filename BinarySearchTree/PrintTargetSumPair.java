import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static class Node {

        int data;

        Node left;

        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {

        Node node;

        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }

                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }

                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static void travelAndFill(Node node, ArrayList<Integer> arrayList) {
        if (node == null) return;
        travelAndFill(node.left, arrayList);
        arrayList.add(node.data);
        travelAndFill(node.right, arrayList);

    }

    public static void travelAndPrint(Node root, Node node, int target) {
        if (node == null) return;
        travelAndPrint(root, node.left, target);
        int complement = target - node.data;
        if (node.data < complement) {
            if (find(root, complement)) {
                System.out.println(node.data + " " + complement);
            }
        }
        travelAndPrint(root, node.right, target);
    }

    public static boolean find(Node node, int target) {
        if (node == null) return false;
        if (node.data > target) {
            return find(node.left, target);
        } else if (node.data < target) {
            return find(node.right, target);
        }
        return true;
    }

    public static void iterativePairFind(Node node, int target){
        Stack<Pair> ls = new Stack<>();
        Stack<Pair> rs = new Stack<>();

        ls.push(new Pair(node, 0));
        rs.push(new Pair(node, 0));

        Node left = getNextFromNormalInorder(ls);
        Node right = getNextFromReverseInorder(rs);

        while(left.data < right.data){
            int val = left.data + right.data;
            if(val < target){
                left = getNextFromNormalInorder(ls);
            }else if(val > target){
                right = getNextFromReverseInorder(rs);
            }else{
                System.out.println(left.data + " " + right.data);
                left = getNextFromNormalInorder(ls);
                right = getNextFromReverseInorder(rs);
            }
        }

    }

    private static Node getNextFromReverseInorder(Stack<Pair> rs) {
        while (rs.size() > 0){
            Pair top = rs.peek();
            if(top.state == 0){
                top.state++;
                if(top.node.right != null){
                    rs.push(new Pair(top.node.right, 0));
                }
            }else if(top.state == 1){
                Node r = top.node;
                top.state++;
                if(top.node.left != null){
                    rs.push(new Pair(top.node.left, 0));
                }
                return r;
            }else{
                rs.pop();
            }
        }
        return null;
    }

    private static Node getNextFromNormalInorder(Stack<Pair> ls) {
        while (ls.size() > 0){
            Pair top = ls.peek();
            if(top.state == 0){
                top.state++;
                if(top.node.left != null){
                    ls.push(new Pair(top.node.left, 0));
                }
            }else if(top.state == 1){
                Node n = top.node;
                top.state++;
                if(top.node.right != null){
                    ls.push(new Pair(top.node.right, 0));
                }
                return n;
            }else{
                ls.pop();
            }
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (!values[i].equals("n")) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        int target = Integer.parseInt(br.readLine());

        Node root = construct(arr);

        //method 1
//        travelAndPrint(root, root, target);

        // method 2
        /*
        ArrayList<Integer> list = new ArrayList<>();
        travelAndFill(root, list);

        int i = 0, j = list.size() - 1;
        while(i < j){
            int curSum = list.get(i) + list.get(j);
            if(curSum > target){
                j--;
            }else if(curSum < target){
                i++;
            }else{
                System.out.println(list.get(i) + " " + list.get(j));
                i++;
                j--;
            }
        }*/

        //method 3 --> best approach with time complexity of O(n) and space of O(h)
        iterativePairFind(root, target);
    }

}