package com.GreedyAlgos;
import java.util.*;
public class WholeKnapsack {
    static int knapSackProblem(int W, int weight[], int value[], int n){
        //write your code here
        int[][] table = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i==0 || w==0) {
                    table[i][w] = 0;
                }
                else if (weight[i-1] <= w) {
                    table[i][w] = Math.max(table[i-1][w], table[i-1][w - weight[i-1]] + value[i-1]);
                }
                else {
                    table[i][w] = table[i-1][w];
                }
            }
        }
        return table[n][W];
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int W=scanner.nextInt();
        int[] value=new int[n];
        int[] weight=new int[n];
        for(int i=0;i<n;i++){
            value[i]=scanner.nextInt();
        }

        for(int i=0;i<n;i++){
            weight[i]=scanner.nextInt();
        }
        System.out.println(knapSackProblem(W,weight,value,n));
    }
}
