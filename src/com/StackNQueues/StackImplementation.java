package com.StackNQueues;

import java.util.Scanner;

public class StackImplementation {
    Node head;
    private class Node {
        int value;
        Node next;
    }
    public  StackImplementation() {
        this.head= null;
    }
    public void push(int value) {
        Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = oldHead;
    }
    public int pop() {
        if (head == null) {
            System.out.println("The stack is empty");
        }
        int value = head.value;
        head = head.next;
        return value;
    }
    public  int middlemost() {
        int count=0;
        Node temp=head;
        while(temp!=null) {
            ++count;
            temp=temp.next;
        }
        count=count/2;
        temp=head;
        while (temp!=null && count>0) {
            pop();
            count--;
            temp=temp.next;
        }
        return temp.value;
    }
    public static void main(String args[]) {
        Scanner obj= new Scanner(System.in);
        StackImplementation a= new StackImplementation();
        int n=obj.nextInt();
        for (int i=0; i<n;i++) {
            a.push(obj.nextInt());
        }
        System.out.println(a.pop());
        System.out.println(a.middlemost());
     }
}
