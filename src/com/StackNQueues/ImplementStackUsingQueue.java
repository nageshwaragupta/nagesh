package com.StackNQueues;

import java.util.*;

public class ImplementStackUsingQueue {
    /*implementing queue using linked list */
    Queue <Integer> queue = new LinkedList <Integer> ();

    /* Push operation of stack using queue*/
    void push(int new_data) {
        //Write your code here
        queue.add(new_data);
    }

    /*Removes the top element of the stack*/

    int pop() {
        //Write your code here
        int a = 1;
        int n=queue.size();
        Queue<Integer> temp= new LinkedList<>();
        for(int i=1;i<=n;i++) {
            if(i!=n) {
                temp.add(queue.remove());
            } else {
                a = queue.remove();
            }
        }
        queue.addAll(temp);
        return a;
    }
    /* Returns true if Stack is empty else false */
    boolean isEmpty() {
        return queue.isEmpty();
    }


    /*Returns the element at the top of the stack */
    int top() {
        //Write your code here
        int a=0;
        int n=queue.size();
        Queue<Integer> temp= new LinkedList<>();
        for(int i=1;i<=n;i++) {
            if(i==n) {
                a=queue.peek();
                temp.add(queue.remove());
            } else {
                temp.add(queue.remove());
            }
        }
        queue.addAll(temp);
        return a;
    }


    public static void main(String[] args) {
        ImplementStackUsingQueue obj = new ImplementStackUsingQueue();
        Scanner in = new Scanner(System.in);
        /*Enter the number of elements you want to add in the stack */

        int n = in.nextInt();

        /*Enter the elements of the stack */
        for (int i = 0; i < n; i++) {
            obj.push(in.nextInt());
        }
        if(obj.queue.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else if (obj.queue.peek() == null) {
            System.out.println("The stack is empty");
        } else {
            System.out.println(obj.top());
            obj.pop();
            System.out.println(obj.top());
        }
    }
}
