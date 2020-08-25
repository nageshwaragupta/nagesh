package com.SortingAlgos;
import java.util.Arrays;
import java.util.Scanner;
public class MergeSortInDescendingOrder {
    public static int[] sort(int[] randomNumbers) {
        return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    }

    public static int[] mergeSort(int[] numbers, int first, int last) {
        // first denotes the starting index of the "numbers" array
        // last denotes the ending index of the "numbers" array
        if (first<last) {
            int mid= (first+last)/2;

           mergeSort(numbers, first, mid);
            mergeSort(numbers, mid+1,last);
            Merge(numbers,first,mid,last);
        }
        //Complete this function
        return  numbers;
    }

    /// .......
    // Write the Merge function here which uses the merge sort to sort the array in decreasing order...
    /// .......
    public static void Merge (int[] numbers,int start, int mid, int last) {

        int size1 = mid + 1 - start;
        int size2 = last - mid;
        int[] left = new int[size1];
        int[] right = new int[size2];
        for (int i = 0; i < size1; i++) {
            left[i] = numbers[start + i];
        }
        for (int i = 0; i < size2; i++) {
            right[i] = numbers[mid + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = start;
        while (i < size1 && j < size2) {
            if (left[i] >= right[j]) {
                numbers[k] = left[i];
                i++;
            } else {
                numbers[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<size1) {
            numbers[k]=left[i];
            i++;
            k++;
        }
        while (j<size2 ) {
            numbers[k]=right[j];
            j++;
            k++;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.nextInt();
        }
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
