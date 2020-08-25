package com.StackNQueues;
import java.util.*;
public class SplitCircularList {
    static Node head;
    static Node h1, h2;
    static class Node {
        int data;
        Node next, prev;
        Node(int d) {
            data = d;
            next = prev = null;
        }
    }

    void divide() {
        //Write your code here
        Node slow_ptr = head;
        Node fast_ptr = head;

        if (head == null) {
            return;
        }

        /* If there are odd nodes in the circular list then
         fast_ptr->next becomes head and for even nodes
         fast_ptr->next->next becomes head */
        while (fast_ptr.next != head
                && fast_ptr.next.next != head) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }

        /* If there are even elements in list then move fast_ptr */
        if (fast_ptr.next.next == head) {
            fast_ptr = fast_ptr.next;
        }

        /* Set the head pointer of first half */
        h1 = head;

        /* Set the head pointer of second half */
        if (head.next != head) {
            h2 = slow_ptr.next;
        }
        /* Make second half circular */
        fast_ptr.next = slow_ptr.next;

        /* Make first half circular */
        slow_ptr.next = head;

    }
    public void push(int new_data) {
        Node temp = head;
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            new_node.next = head;
        }
        else {
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = head;
        }
    }
    void print(Node temp) {
        Node node = temp;
        if (temp != null) {
            do {
                System.out.print(node.data + " ");
                node = node.next;
            } while (node != temp);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SplitCircularList list = new SplitCircularList();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            list.push(in.nextInt());
        }
        list.divide();
        list.print(h1);
        list.print(h2);
    }
}
