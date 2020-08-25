package com.SortingAlgos;
import java.util.Arrays;
import java.util.Scanner;
public class MergeTwoArrays {
    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int sizeArray2 = scanner.nextInt();
        int sortedArray1[] = getArrayInput(sizeArray1, scanner);
        int sortedArray2[] = getArrayInput(sizeArray2, scanner);

        int descendingMerge[] = mergeBothInDescendingOrder(sortedArray1, sortedArray2);

        //Write your code here
        for (int i = 0; i < descendingMerge.length; i++) {
            System.out.println(descendingMerge[i]);
        }
    }

    public static int[] getArrayInput(int size, Scanner scanner) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int[] mergeBothInDescendingOrder(int[] array1, int[] array2) {
        int size1 = array1.length;
        int size2 = array2.length;
        int merged = size1 + size2;
        int[] mergedarr = new int[merged];
        int i = 0, j = 0, k = 0;
        while (i < size1 && j < size2) {
            if (array1[i] < array2[j]) {
                mergedarr[k++] = array1[i++];
            } else {
                mergedarr[k++] = array2[j++];
            }
        }
        while (i < size1) {
            mergedarr[k++] = array1[i++];
        }
        while (j < size2) {
            mergedarr[k++] = array2[j++];
        }
        return mergedarr;
    }
}