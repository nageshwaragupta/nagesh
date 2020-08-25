package com.PriorityQueues;
import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class CheckIfTheGivenArrayIsHeap {
    public static boolean  isHeap(int[] arr,  int n){
        //Write your code here
        //Check if the array element is less than it's child element in the array,
        //and if they are less return false else return true
        boolean result= isHeap(arr,0,n );
        return result;
    }
    static boolean isHeap(int arr[], int i, int n) {
        // If a leaf node
        if (i > (n-4) / 2) {
            return true;
        }
        // If an internal node and is greater than its children, and
        // same is recursively true for the children
        if (arr[i] >= arr[2 * i + 1] && arr[i] >= arr[2 * i + 2]
                && isHeap(arr, 2 * i + 1, n) && isHeap(arr, 2 * i + 2, n)) {
            return true;
        }
        return false;
    }
    public static int[] getArrayInput(int size, Scanner scanner) {
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int arr[] = getArrayInput(sizeArray1, scanner);
        int n = arr.length;
        String x = isHeap(arr, n)? "Yes": "No";

        System.out.println(x);
    }

}
