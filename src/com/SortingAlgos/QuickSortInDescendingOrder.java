package com.SortingAlgos;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSortInDescendingOrder {

    public void  quickSort (int[] A, int start, int last) {
        if(start>=last) {
            return;
        }
            int pivot=A[(start+last)/2];
            int p = partition(A, start, last,pivot);
            quickSort(A, start, p - 1);
            quickSort(A, p, last);

    }
    public int partition(int[] A, int start, int last, int pivot) {
//        Random r= new Random();

        while(start<=last) {
            while (A[start]>pivot) {
                start++;
            }
            while(A[last]<pivot) {
                last--;
            }
            if(start<=last) {
                int temp=A[start];
                A[start]=A[last];
                A[last]=temp;
                start++;
                last--;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        QuickSortInDescendingOrder a= new QuickSortInDescendingOrder();
        int numberOfElements=obj.nextInt();
        int[] A=new int[numberOfElements];
        for(int i=0;i<numberOfElements;i++) {
            A[i]=obj.nextInt();
        }
        a.quickSort(A,0,numberOfElements-1);
        for (int i=0;i<numberOfElements;i++) {
            System.out.print( A[i]+" ");
        }
    }
}
