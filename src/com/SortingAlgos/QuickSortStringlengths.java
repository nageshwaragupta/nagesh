package com.SortingAlgos;
import java.util.Scanner;
public class QuickSortStringlengths {
    public static void quickSort(String array[], int left, int right) {
        if (left < right) {
            int position = partition(array, left, right);
            quickSort(array, left, position-1);
            quickSort(array, position, right);
        }

    }
    //Write your code here
    public static int partition(String[] arr,int start, int last) {
    int pivot=arr[(start+last)/2].length();
        while(start<=last) {
            while ((arr[start].length())<pivot) {
                start++;
            }
            while(arr[last].length()>pivot) {
                last--;
            }
            if(start<=last) {
                String temp=arr[start];
                arr[start]=arr[last];
                arr[last]=temp;
                start++;
                last--;
            }
        }
        return start;
    }
    public static  void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int n= obj.nextInt();
        String[] names = new String[n];
        for (int i=0;i<n;i++) {
            names[i]=obj.next();
        }
        quickSort(names,0,names.length-1);
        for (int i=0;i<n;i++) {
            System.out.println(names[i]);
        }
    }
}
