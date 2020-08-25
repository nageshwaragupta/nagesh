package com.DynamicProgramming;

import java.util.Scanner;

public class FibonacciSeriesDP {
    static int findNthTerm(int n) {
        //write your code here
        int[] fibonacci = new int[n+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        if (n < 2) {
            if (n == 1) {
                return fibonacci[1];
            } else {
                return fibonacci[0];
            }
        } else {
            for (int i = 2; i < n+1; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        return fibonacci[n];
    }

    public static void main (String args[]){
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        System.out.println(findNthTerm(n));
    }
}
