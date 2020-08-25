package com.session30;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main (String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for (int i=0; i<n; i++) {
            System.out.println(fibonacciSeries(i));
        }
    }

    public static int fibonacciSeries(int number) {
        //write your code here
       if(number<=1) {
           if(number==1){
               return 1;
           }else{
               return 0;
           }
       }
       return fibonacciSeries(number-1)+fibonacciSeries(number-2);
    }
}
