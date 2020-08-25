package com.StackNQueues;
import java.util.*;
public class SortTheQueue {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        sort(queue);
    }

    // Method to sort the queue
    static void sort(Queue<Integer> queue) {
        // Write your code here
        int[] arr= new int[queue.size()];
        int a=queue.size();
        for (int i=0;i<a;i++) {
            arr[i]=queue.poll();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
