package com.GraphsAndTrees;
import java.util.*;
public class DetectLoopInUndirectedGraph {
    // Number of nodes in the graph
    public int noOfNodes;

    // Adjacency list which is used to represent the graph
    public LinkedList<Integer> adjList[];

    // Integer variable which is used to store the number of edges in the graph
    public int noOfEdges;
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        DetectLoopInUndirectedGraph obj = new DetectLoopInUndirectedGraph();

        // Get the number of nodes from the input
        obj.noOfNodes = in.nextInt();

        // Get the number of edges from the input
        obj.noOfEdges = in.nextInt();

        obj.adjList = new LinkedList[obj.noOfNodes];

        for (int i = 0; i < obj.noOfNodes; ++i) {
            obj.adjList[i] = new LinkedList();
        }
        // Adding edges to the graph
        for (int i = 0; i < obj.noOfEdges; ++i) {
            int x, y;
            x=in.nextInt();
            y = in.nextInt();
            obj.adjList[x].add(y);
            obj.adjList[y].add(x);
        }

        boolean visted[] = new boolean[obj.noOfNodes];
        boolean recur[] = new boolean[obj.noOfNodes];
        for (int i = 0; i < obj.noOfEdges; i++) {
            if (detectionOfCycle(visted, recur, i, obj.adjList) == true) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
        // Write your code here.
        public static boolean detectionOfCycle(boolean[] visited, boolean rec[], int i, LinkedList<Integer>[] adjacencyList) {
            if (rec[i]) return true;
            if (visited[i]) return false;
            visited[i] = true;
            rec[i] = true;

            for (int j : adjacencyList[i]) {
                //  System.out.println(j);
                if (detectionOfCycle(visited, rec, j, adjacencyList))
                    return true;

            }
            rec[i] = false;
            return false;
    }
}
