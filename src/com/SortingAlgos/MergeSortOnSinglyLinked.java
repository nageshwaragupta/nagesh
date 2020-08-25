package com.SortingAlgos;
import java.util.*;
public class MergeSortOnSinglyLinked {
    //initializing the head of the class
    Node head = null;
    // a generic class to create new nodes
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    //method to reach the middle node of a singly linked list
    Node findMiddle(Node h) {
        //Base case
        if (h == null)
            return h;
        Node fastptr = h.next;
        Node slowptr = h;

        while (fastptr != null) {
            fastptr = fastptr.next;
            if (fastptr != null) {
                slowptr = slowptr.next;
                fastptr = fastptr.next;
            }
        }
        return slowptr;
    }
    Node mergeSort(Node h) {
        // Write your code here
        Node temp = h;
            while (temp != null) {
                if (temp.data > temp.next.data) {
                    Node tempa = temp;
                    temp = temp.next;
                    temp.next = tempa;
                }
                temp = temp.next;
            }
            return mergeSort(h.next);
        }


    // code to insert nodes in a linked list
    public void push(int new_data) {
        Node temp = head;
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }
    //method to print the linked list
    void print() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MergeSortOnSinglyLinked obj = new MergeSortOnSinglyLinked();
        int no = in .nextInt();
        for (int i = 0; i < no; i++) {
            int element = in .nextInt();
            obj.push(element);
        }
        obj.head = obj.mergeSort(obj.head);
        obj.print();
    }
}
