package com.GraphsAndTrees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class treeNode {
    int data;
    treeNode left;
    treeNode right;

    treeNode(int value) {
        data = value;
        left = null;
        right = null;
    }
}

public class SumBinarySearchTree {
    treeNode rootNode;

    public int CheckForSum(treeNode root, int targetSum) {
        //write your code here
    if(root==null) {
        return 0;
    }
    treeNode temp=root;
    while (temp.right!=null && temp.left!=null) {
        if(targetSum==(temp.data+temp.left.data)) {
            return 1;
        } else if (targetSum==(temp.data+temp.right.data)) {
            return 1;
        } else {
            CheckForSum(root.left,targetSum);
            CheckForSum(root.right,targetSum);
        }
    }
    return 0;
    }

    public static void main(String args[]) {
        SumBinarySearchTree BST = new SumBinarySearchTree();

        Scanner in = new Scanner(System.in);

        //number of elements
        int n = in.nextInt(), element;

        //queue used to create a binary search tree
        Queue<treeNode> q = new LinkedList<treeNode>();

        // creating a new binary search tree.
        BST.rootNode = new treeNode(in.nextInt());
        q.add(BST.rootNode);
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
        int targetSum;
        targetSum = in.nextInt();

        //if you find the elements whose sum is equal to the target sum then print true
        if (BST.CheckForSum(BST.rootNode, targetSum) != 0) {
            System.out.println("true");
        }

        // otherwise print false
        else {
            System.out.println("false");
        }
    }
}
