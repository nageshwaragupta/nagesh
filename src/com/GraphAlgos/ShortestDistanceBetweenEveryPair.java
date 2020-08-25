package com.GraphAlgos;
import java.lang.*;
import java.util.Scanner;
public class ShortestDistanceBetweenEveryPair {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Get the number of nodes in the graph, from input
        int N = in.nextInt();

        int nodeX, nodeZ, interNodeY;

        // Adjacency matrix used to represent the graph
        int adjacencyMatrix[][] = new int[N][N];
        for (nodeX = 0; nodeX < N; nodeX++) {
            for (nodeZ = 0; nodeZ < N; nodeZ++) {
                adjacencyMatrix[nodeX][nodeZ] = in.nextInt();
            }
        }
        // Write your code here.
        for (int k = 0; k < N; k++) {
            // Pick all vertices as source one by one
            for (int i = 0; i < N; i++) {
                // Pick all vertices as destination for the
                // above picked source
                for (int j = 0; j < N; j++) {
                    // If vertex k is on the shortest path from
                    // i to j, then update the value of dist[i][j]
                    if (adjacencyMatrix[i][k] + adjacencyMatrix[k][j] < adjacencyMatrix[i][j])
                        adjacencyMatrix[i][j] = adjacencyMatrix[i][k] + adjacencyMatrix[k][j];
                }
            }
        }
        for (nodeX = 0; nodeX < N; nodeX++) {
            for (nodeZ = 0; nodeZ < N; nodeZ++) {
                System.out.print(adjacencyMatrix[nodeX][nodeZ] + " ");
            }
            System.out.println();
        }
    }
}
