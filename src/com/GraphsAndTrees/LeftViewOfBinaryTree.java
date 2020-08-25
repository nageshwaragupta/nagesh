package com.GraphsAndTrees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//class representing Structure of node in the binary tree
//class treeNode {
//    int data;
//    treeNode left;
//    treeNode right;
//
//    public treeNode(int element) {
//        data = element;
//        left = null;
//        right = null;
//    }
//}

//class used to print the left view of a binary tree
public class LeftViewOfBinaryTree {
    static treeNode rootNode;

    public static void main(String args[]) {
        //creating a binary tree
        LeftViewOfBinaryTree tree = new LeftViewOfBinaryTree();

        //root node of the binary tree
        treeNode rootNode;

        Scanner in = new Scanner(System.in);

        //number of elements
        int n = in.nextInt(), element;

        //queue used to create a binary tree
        Queue<treeNode> q = new LinkedList<treeNode>();
        // creating a new binary tree.
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
            element = in.nextInt();
            //Note: if the element is -1 then the node is null
            if (element != -1) {
                cur.right = new treeNode(element);
                q.add(cur.right);
            }
        }

        //write your code here
        leftviewtree(rootNode,1);

    }
    static int max=0;
    public static void leftviewtree(treeNode rootNode, int level) {
        if(rootNode==null) {
            return;
        }
        if(level>max) {
            max=level;
            System.out.println(rootNode.data);
        }
            leftviewtree(rootNode.left,level+1);
            leftviewtree(rootNode.right,level+1);
    }
}
