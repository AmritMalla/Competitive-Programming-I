import java.io.*;
import java.util.*;

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

    static  class BSTNode{
        boolean isbst;
        int max;
        int min;
        int size;

        public BSTNode(boolean isbst, int max, int min, int size) {
            this.isbst = isbst;
            this.max = max;
            this.min = min;
            this.size = size;
        }
    }
    static int largestBSTSize;
    static Node bstNode;
    public static BSTNode findLargestBST(Node node){
        if(node == null){
            return new BSTNode(true, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        }

        BSTNode left = findLargestBST(node.left);
        BSTNode right = findLargestBST(node.right);

        boolean isStillBST = (node.data > left.max) && (node.data < right.min) && left.isbst && right.isbst;
        int size = left.size + right.size + 1;
        if(isStillBST){
            if(largestBSTSize < size ){
                largestBSTSize = size;
                bstNode = node;
            }
        }
        int max = Math.max(right.max, node.data);
        int min = Math.min(left.min, node.data);
        return new BSTNode(isStillBST, max, min, size);

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        Node root = construct(arr);

        findLargestBST(root);
        System.out.println(bstNode.data + "@" + largestBSTSize);

    }

}