package com.GraphsAndTrees;

public class BinaryLeftView {
    public static  class Node {
        int data;
        Node left, right;
        public  Node(int k) {
            data=k;
            right=null;
            left=null;
        }
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left= new Node(2);
        root.right = new Node(3);
        root.left.right= new Node(5);
        root.right.left= new Node(6);
        root.left.right.left= new Node(7);
        printLeft(root,0);
    }
    public static Node printLeft (Node root, int position) {
        if(root==null) {
            System.out.println(root.data);
            return root;
        }
        System.out.println(root.left.data);
        return printLeft(root.left, 2*position+1);

    }
}
