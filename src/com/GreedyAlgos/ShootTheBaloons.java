package com.GreedyAlgos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ShootTheBaloons {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=scanner.nextInt();
            arr[i][1]=scanner.nextInt();
        }
        System.out.println(minimumArrows(arr));
    }
    private static int minimumArrows(int[][] balloons) {
        Arrays.sort(balloons, Comparator.comparingInt(a -> a[1]));

        int lastArrowedBalloonEnd = -1;
        int arrowCount = 0;
        for (int i = 0; i < balloons.length; i++) {

            // find balloon that won't get burst using last arrow
            if (balloons[i][0] > lastArrowedBalloonEnd) {
                arrowCount++;
                lastArrowedBalloonEnd = balloons[i][1];
            }
        }
        return arrowCount;
    }
}
