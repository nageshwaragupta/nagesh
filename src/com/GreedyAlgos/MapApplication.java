package com.GreedyAlgos;
import java.io.*;
import java.util.*;
import java.lang.Math;
public class MapApplication {
    static int  min=Integer.MAX_VALUE;
    public static int minimumAscentDescent(int n,int m,int[][] arr){
        minimumAscentDescent(0, 0, arr, 0);
        return min;
    }
    public static void minimumAscentDescent(int i,int j,int[][] arr,int val){
        //    System.out.println(val+"Val");
        if(val<min && i==arr.length-1 && j==arr[0].length-1 ) {
            //  System.out.println(i +"  "+ j);
            min=val;
            return;
        }

        if(i+1<arr.length)
            minimumAscentDescent(i+1,j,arr,val+Math.abs(arr[i+1][j]-arr[i][j]));
        if((j+1)<arr[0].length)
            minimumAscentDescent(i,j+1,arr,val+Math.abs(arr[i][j+1]-arr[i][j]));
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        n=scan.nextInt();
        int m;
        m=scan.nextInt();
        int[][]  arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        int result;
        result = minimumAscentDescent(n,m,arr);
        System.out.print(result);
        return ;
    }
}
