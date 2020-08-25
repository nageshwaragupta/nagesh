package com.DynamicProgramming;
import java.util.Scanner;
public class SumOfThreePrecedingNums {
    static int fib(int n) {
        /* Declare an array to store Fibonacci numbers */
        int[] sumOfThree = new int[n+1];
        /* Assign the 0th, 1st, and 2nd numbers of the Fibonacci series to 0, 1, and 2 respectively */
        sumOfThree[0]=0;
        sumOfThree[1]=1;
        sumOfThree[2]=2;
        /* Add the previous three numbers in the series, and store them */
        for (int i=3;i<n;i++) {
            sumOfThree[i]=sumOfThree[i-1]+sumOfThree[i-2]+sumOfThree[i-3];
        }
        /* Return the nth element in the series */
        return sumOfThree[n-1];
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        // Enter the number n
        int n = scan.nextInt();
        System.out.println(fib(n));
        scan.close();
    }
}
