package com.GraphsAndTrees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
//class treeNode {
//    int data;
//    treeNode left;
//    treeNode right;
//
//    treeNode(int value) {
//        data = value;
//        left = null;
//        right = null;
//    }
//}
public class KthSmallestInBST {
    //function which returns the kth smallest element in the binary search tree
    public int kthsmallest(treeNode node, int k) {
        //write your code here
        Stack<treeNode> stack = new Stack<treeNode>();

        treeNode p = node;
        int result = 0;

        while(!stack.isEmpty() || p!=null){
            if(p!=null){
                stack.push(p);
                p = p.left;
            }else{
                treeNode t = stack.pop();
                k--;
                if(k==0)
                    result = t.data;
                p = t.right;
            }
        }

        return result;
    }

    public static void main(String arg[]) {

        KthSmallestInBST tree = new KthSmallestInBST();

        //root node of the binary search tree
        treeNode rootNode;

        Scanner in = new Scanner(System.in);

        //number of elements
        int n = in.nextInt(), element;

        //queue used to create a binary search tree
        Queue<treeNode> q = new LinkedList<treeNode>();

        // creating a new binary search tree.
        rootNode = new treeNode(in.nextInt());
        q.add(rootNode);
        treeNode cur = null;
        for (int i = 1; i < n; i++) {

            cur = q.remove();

            //Note: if the element is -1 then the node is null
            element = in.nextInt();
            if (element != -1) {
                cur.left = new treeNode(element);
                q.add(cur.left);
            }
            i++;
            //Note: if the element is -1 then the node is null
            element = in.nextInt();
            if (element != -1) {
                cur.right = new treeNode(element);
                q.add(cur.right);
            }
        }

        // take value of k to get the kth smallest element in the BST
        int k = in.nextInt();

        //printing the kth smallest element in the BST
        System.out.println(tree.kthsmallest(rootNode, k));

    }
}
