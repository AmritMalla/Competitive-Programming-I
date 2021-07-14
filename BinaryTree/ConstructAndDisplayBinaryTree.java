import java.util.Stack;

public class Main {

    static class Node {

        int data;

        Node right;

        Node left;

        public Node(int data, Node right, Node left) {
            this.data = data;
            this.right = right;
            this.left = left;
        }

        public Node(int data) {
            this.data = data;
        }
    }

    static class Pair {

        Node node;

        int state;

        public Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0]);
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));

        int index = 1;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                if (arr[index] == null) {
                    index++;
                    top.state++;
                } else {
                    Node t = new Node(arr[index]);
                    top.node.left = t;
                    index++;
                    top.state++;
                    st.push(new Pair(t, 1));
                }
            } else if (top.state == 2) {
                if (arr[index] == null) {
                    index++;
                    top.state++;
                } else {
                    Node t = new Node(arr[index]);
                    top.node.right = t;
                    index++;
                    top.state++;
                    st.push(new Pair(t, 1));
                }
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static Node construct1(Integer[] arr) {
        Node root = new Node(arr[0]);
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));

        int index = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                index++;
                top.state++;
                if (arr[index] != null) {
                    Node leftNode = new Node(arr[index]);
                    top.node.left = leftNode;
                    st.push(new Pair(leftNode, 1));
                }
            } else if (top.state == 2) {
                index++;
                top.state++;
                if (arr[index] != null) {
                    Node rightNode = new Node(arr[index]);
                    top.node.right = rightNode;
                    st.push(new Pair(rightNode, 1));
                }
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node root) {
        if (root == null) return;
        /*
        if(root.left == null && root.right == null){
            System.out.println(". <- " + root.data + " -> .");
        }else if(root.left == null){
            System.out.println(". <- " + root.data + " -> "+ root.right.data);
        }else if(root.right == null){
            System.out.println(root.left.data + " <- " + root.data + "-> .");
        }else{
            System.out.println(root.left.data + " <- " + root.data + "-> "+ root.right.data);
        }
         */

         //better approach
        String res = "" + (root.left == null?".": root.left.data);
        res += " <- " + root.data + " -> ";
        res += (root.right == null ?".": root.right.data);
        System.out.println(res);
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) throws Exception {
        Integer[] arr = new Integer[]{50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Node root = construct1(arr);

        display(root);

    }

}