package com.GraphsAndTrees;

import java.util.*;

public class topologicalSort {
    int vertex;
    ArrayList<ArrayList<Integer>> list;
    boolean[] visited;
    Stack<Integer> stk= new Stack<>();
    Queue<Integer> queue = new LinkedList<>();

    public topologicalSort(int vertex) {
        this.vertex=vertex;
        this.list= new ArrayList<ArrayList<Integer>>(vertex);
        for (int i=0;i<vertex;i++) {
            this.list.add(new ArrayList<>());
        }
        this.visited= new boolean[vertex];
        Arrays.fill(visited,false);
    }
    public static void main(String[] args) {
        topologicalSort obj = new topologicalSort(5);
        obj.addadjacencylist(0,1);
        obj.addadjacencylist(0,4);
        obj.addadjacencylist(1,2);
        obj.addadjacencylist(1,3);
        obj.addadjacencylist(1,4);
        obj.addadjacencylist(2,3);
        obj.addadjacencylist(4,3);
        obj.topological(0);
        while (!obj.stk.empty()) {
            System.out.print(obj.stk.pop()+" ");
        }
    }
    public void addadjacencylist(int source, int destination) {
        list.get(source).add(destination);
//        list.get(destination).add(source);
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
    public void topological (int v) {
        visited[v]=true;
        for (int i=0;i<list.get(v).size();i++) {
            if (!visited[list.get(v).get(i)]) {
                topological(list.get(v).get(i));
            }
        }
        stk.push(v);
    }
}
