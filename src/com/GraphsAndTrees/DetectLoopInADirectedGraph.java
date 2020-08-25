package com.GraphsAndTrees;
import java.util.*;

public class DetectLoopInADirectedGraph {
    //integer variable to store the number of nodes in the graph
    public int noOfNodes;

    //integer variable to store the number of edges in the graph
    public int noOfEdges;

    //Adjacency list which is used to represent the graph
    public static LinkedList<Integer> adjacencyList[];

    // create a stack
    Stack<Integer> newstk = new Stack<>();

    // array for marking visited
    boolean[] visited= new boolean[noOfNodes];

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        DetectLoopInADirectedGraph obj = new DetectLoopInADirectedGraph();

        // Get the number of nodes from the input.
        obj.noOfNodes = in.nextInt();

        // Get the number of edges from the input.
        obj.noOfEdges = in.nextInt();

        // adjacency list that represents the graph
        obj.adjacencyList = new LinkedList[obj.noOfNodes];
        for (int i = 0; i < obj.noOfNodes; ++i) {
            obj.adjacencyList[i] = new LinkedList();
        }

        // Adding edges to the graph
        for (int i = 0; i < obj.noOfEdges; ++i) {
            obj.adjacencyList[in.nextInt()].add(in.nextInt());
        }

        // Write your code here.
        System.out.println(obj.detectloop(in.nextInt()));
    }
    public boolean detectloop (int vertex) {
        newstk.push(vertex);
        visited[vertex]= true;
        for (int i=0;i<adjacencyList[vertex].size();i++) {
            if(!visited[(adjacencyList[vertex].get(i))])
                detectloop(adjacencyList[vertex].get(i));
        }
        newstk.pop();
        if(newstk.contains(vertex))
            return true;
        else
            return false;
    }
}
