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

    public  static Node construct(Integer[] arr, int l, int h){
        if(l > h) return null;
        int mid = (l + h)/2;
        int data = arr[mid];
        Node left = construct(arr, l, mid-1);
        Node right = construct(arr, mid + 1, h);
        return new Node(data, left, right);
    }

    public static void display(Node root) {
        if (root == null) return;
        String res = "" + (root.left == null?".": root.left.data);
        res += " <- " + root.data + " -> ";
        res += (root.right == null ?".": root.right.data);
        System.out.println(res);
        display(root.left);
        display(root.right);
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values = "12 25 37 39 50 62 75 87".split(" ");
        Integer[] arr = new Integer[values.length];
        for (int i = 0; i < values.length; i++) {
            if (!values[i].equals("n")) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        Node root = construct(arr, 0, arr.length - 1);
        display(root);
    }

}