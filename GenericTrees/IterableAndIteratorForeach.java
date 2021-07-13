import java.io.*;
import java.util.*;

public class Main {
    static class GenericTree implements Iterable<Integer>{
        Node root;

        public GenericTree(Node root) {
            this.root = root;
        }

        @Override
        public Iterator<Integer> iterator() {
            Iterator<Integer> obj = new GTPreOrderIterator(root);
            return obj;
        }
    }

    static class GTPreOrderIterator implements Iterator{

        Stack<Pair> st;
        Integer nextVal;

        public GTPreOrderIterator(Node root) {
            st = new Stack<>();
            st.push(new Pair(root, -1));
            next();
        }

        @Override
        public boolean hasNext() { // weather next value is availab;e
            if(nextVal == null) return false;
            return true;
        }

        @Override
        public Object next() { // points to the next value
            Integer curValue = nextVal;

            //move nextVal forward, if not possible sets it to null
            nextVal = null;
            while(st.size() > 0){
                Pair top = st.peek();
                if(top.state == -1){
                    nextVal = top.node.data;
                    top.state++;
                    break;
                }else if(top.state < top.node.children.size()){
                    int idx = top.state;
                    top.state++;
                    Node child = top.node.children.get(idx);
                    st.push(new Pair(child, -1));
                }else{
                    st.pop();
                }

            }

            return curValue;
        }
    }

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    private static class Pair{
        Node node;
        int state;

        public Pair() {
        }

        public Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    public static void IterativePreandPostOrder(Node node) {
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> post = new ArrayList<>();

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(node, -1));
        while(st.size() > 0){
            Pair top = st.peek();
            if(top.state == -1){
                pre.add(top.node.data);
                top.state++;
            }else if(top.state < top.node.children.size()){
                int idx = top.state;
                top.state++;
                Node child = top.node.children.get(idx);
                st.push(new Pair(child, -1));
            }else{
                post.add(top.node.data);
                st.pop();
            }

        }
        pre.forEach(v -> System.out.print(v + " "));
        System.out.println();
        post.forEach(v -> System.out.print(v + " "));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 24;
        int[] arr = new int[n];
        String[] values = "10 20 -50 -1 60 -1 -1 30 70 -1 -80 110 -1 -120 -1 -1 90 -1 -1 40 -100 -1 -1 -1".split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        GenericTree genericTree = new GenericTree(root);


        for(int val: genericTree){
            System.out.print(val + " ");
        }

       /* Iterator<Integer> itr = new GTPreOrderIterator(root);
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
    }

}