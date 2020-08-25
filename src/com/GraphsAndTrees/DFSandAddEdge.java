package com.GraphsAndTrees;

import java.util.*;

public class DFSandAddEdge {
    int vertex;
    ArrayList<ArrayList<Integer>> list;
    boolean[] visited;
    Stack<Integer> stk= new Stack<>();
    Queue<Integer> queue = new LinkedList<>();

    public DFSandAddEdge(int vertex) {
        this.vertex=vertex;
        this.list= new ArrayList<ArrayList<Integer>>(vertex);
        for (int i=0;i<vertex;i++) {
            this.list.add(new ArrayList<>());
        }
        this.visited= new boolean[vertex];
        Arrays.fill(visited,false);
    }


    public static void main(String[] args) {
        DFSandAddEdge obj= new DFSandAddEdge(5);
        obj.addadjacencylist(0,1);
        obj.addadjacencylist(0,4);
        obj.addadjacencylist(1,2);
        obj.addadjacencylist(1,3);
        obj.addadjacencylist(1,4);
        obj.addadjacencylist(2,3);
        obj.addadjacencylist(3,4);
        obj.printGraph();
//        obj.BFS(0);
        obj.DFS(0);
    }
    public void addadjacencylist(int source, int destination) {
        list.get(source).add(destination);
        list.get(destination).add(source);
    }
    public void printGraph() {
        for(int i=0;i<list.size();i++){
            System.out.print("List of adjacent vertices for  " + i + " is " );
            for(int j=0;j<list.get(i).size();j++) {
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public void DFS (int v) {
        stk.push(v);
        visited[v]=true;
        System.out.print(stk.peek()+" ");
        for (int i=0;i<list.get(v).size();i++) {
            if (!visited[list.get(v).get(i)]) {
                DFS(list.get(v).get(i));
            }
        }
        stk.pop();
        if (stk.empty()) {
            return;
        }
//            System.out.print(stk.peek()+" ");
    }
    public void BFS(int v) {
        queue.add(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            int var = queue.poll();
            System.out.print(var + " ");
            for (int i = 0; i < list.get(var).size(); i++) {
                int x = list.get(var).get(i);
                if (!visited[x]) {
                    visited[x] = true;
                    queue.add(x);
                }
            }
        }
    }
}
