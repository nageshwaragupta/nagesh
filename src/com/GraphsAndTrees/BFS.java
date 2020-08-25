package com.GraphsAndTrees;
import java.util.*;
public class BFS {
    // Integer variable to store the number of nodes in the graph
    public int noOfNodes;

    // Integer variable to store the number of edges in the graph
    public int noOfEdges;

    // Adjacency list which is used to represent the graph
    public LinkedList<Integer> adjacencyList[];

    // Source node for the breadth-first traversal
    public int source;

    static Queue<Integer> queue = new LinkedList<>();
    boolean[] visited;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        BFS obj = new BFS();
        // Get the number of nodes from the input
        obj.noOfNodes = in.nextInt();

        // Get the number of edges from the input
        obj.noOfEdges = in.nextInt();

        obj.adjacencyList = new LinkedList[obj.noOfNodes];

        for (int i = 0; i < obj.noOfNodes; ++i) {
            obj.adjacencyList[i] = new LinkedList();
        }

        // Adding edges to the graph
        for (int i = 0; i < obj.noOfEdges; ++i) {
            obj.adjacencyList[in.nextInt()].add(in.nextInt());
        }
        obj.visited=new boolean[obj.noOfNodes];
        // Get the source node from input
        obj.source = in.nextInt();

        // Write your code here
        obj.BFStraversal(obj.source);

    }
    public void BFStraversal(int v) {
        queue.add(v);
        visited[v]=true;
        while(!queue.isEmpty()) {
            int var=queue.poll();
            System.out.print(var+" ");
            for(int i=0;i<adjacencyList[var].size();i++) {
                int x=adjacencyList[var].get(i);
                if(!visited[x]) {
                    visited[x]=true;
                    queue.add(x);
                }
            }
        }
    }
    }
