package com.DynamicProgramming;

import java.util.Scanner;

public class FibonacciUsingMemoization {
    static int[] fibo = new int[100];
    private  static  void initial() {
        for (int i=0;i<100;i++) {
            fibo[i]=-1;
        }
    }
    static int findNthTerm(int n){
        //write your code here
        if(fibo[n]==-1) {
            if(n==0) {
                return fibo[0]=0;
            } else if (n==1) {
                return fibo[1]=1;
            }
        else {
            fibo[n]=findNthTerm(n-1)+findNthTerm(n-2);
        }
    }
        return fibo[n];
}
    public static void main (String[] args){
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        initial();
        System.out.println(findNthTerm(n));
    }
}
