package com.SortingAlgos;
import java.util.*;
public class MergeSortCalls {
static  int count=0;
    public static int getResult(int[] A) {
        return mergeSort(A, 0, A.length - 1);
    }

    public static int mergeSort(int[] numbers, int first, int last) {
        // first denotes the starting index of the "numbers" array
        // last denotes the ending index of the "numbers" array

        if (first < last) {

            int mid = first + ((last - first) / 2);
            if((last - first + 1) % 2 != 0) mid--;

            mergeSort(numbers, first, mid);
            mergeSort(numbers, mid + 1, last);
            Merge(numbers, first, mid, last);
        }
        //Complete this function
        return count;
    }

    /// .......
    // Write the Merge function here which uses the merge sort to sort the array in decreasing order...
    /// .......
    public static void Merge(int[] numbers, int start, int mid, int last) {
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

            if (left[i] <= right[j]) {
                numbers[k] = left[i];

                i++;
            } else {
                numbers[k] = right[j];
                j++;

            }
            k++;
        }
        while (i < size1) {
            numbers[k] = left[i];
            i++;
            k++;
        }
        while (j < size2) {
            numbers[k] = right[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N;
        N=scan.nextInt();
        int[] A = new int[N];
        for(int j=0;j<N;j++){
            A[j]=scan.nextInt();
        }
        int result;
        result = getResult(A);
        System.out.print(result);
        return ;
    }
}
