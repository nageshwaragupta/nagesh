package com.StackNQueues;
import java.util.*;
public class ImplementQueueUsingStack {
    static class ImplementQueue{
    Stack<Integer> stack = new Stack<Integer>();

    //The basic push and pop method of a stack are used to create enqueue and dequeue function of a queue
    public void enQueue(int newData){
    stack.push(newData);
        //Write your code here
    }

    // Function to deQueue an item from queue

    public void deQueue() {
//Write your code here

        if (!stack.isEmpty()) {
            System.out.println(stack.firstElement());
            stack.removeElementAt(stack.indexOf(stack.firstElement()));
        } else {
            System.out.println("no elements left");
        }
    }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ImplementQueue obj = new ImplementQueue();
        int n=in.nextInt();
        for(int i=0;i<n;i++) {
            obj.enQueue(in.nextInt());

        }
        obj.deQueue();
        obj.deQueue();
        obj.deQueue();
    }
 }

