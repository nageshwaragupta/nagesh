package com.SortingAlgos;
import java.util.*;
public class KthMaximumElement {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        /* Get the input array size */
        int arraySize = in.nextInt();

        int array[] = new int[arraySize];
        /* Get the input array elements from input */
        for (int i = 0; i < arraySize; i++) {
            array[i] = in.nextInt();
        }

        int k = in.nextInt();
        // Write your code here
        Arrays.sort(array);
        System.out.println(array[arraySize-k]);
    }
}
