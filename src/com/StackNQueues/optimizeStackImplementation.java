//package com.StackNQueues;
//import java.util.*;
//public class optimizeStackImplementation {
//    /* Basic structure of a node of a doubly linked list. This doubly linked list will be used to create a stack. */
//    class Node {
//        Node prev;
//        int data;
//        Node next;
//        Node(int d) {
//            data = d;
//        }
//    }
//
//    /* This is the basic structure of a stack that will reference to two nodes which are 'head' and the 'mid' */
//
//    class StackNode {
//        Node head;
//        Node mid;
//        int count;
//    }
//    /* The method will create an object of class StackNode and create a new stack */
//
//    StackNode implementStackUsingLinkedlist() {
//        StackNode stack = new StackNode();
//        stack.count = 0;
//        return stack;
//    }
//
//    void push(StackNode node, int new_data) {
//            //Write your code here
//        node.head.data=new_data;
//        node.head=node.head.next;
//    }
//
//    int pop(StackNode stack) {
//        //write your code here
//        stack.head=
//    }
//    int middleElement(StackNode stack) {
//
//        //write your code here
//    }
//
//
//    public static void main(String args[]) {
//        optimizeStackImplementation obj = new optimizeStackImplementation();
//        StackNode stack = obj.implementStackUsingLinkedlist();
//        Scanner in = new Scanner(System.in);
//        int n = in .nextInt();
//        for (int i = 0; i < n; i++) {
//            obj.push(stack, in .nextInt());
//
//        }
//        System.out.println(obj.pop(stack) + "");
//        System.out.println(obj.middleElement(stack) + "");
//    }
//}
