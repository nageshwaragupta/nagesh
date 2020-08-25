//package com.GraphAlgos;
//import java.util.*;
//
//class Edge {
//    public String n1;
//    public String n2;
//
//    public Edge(String n1, String n2) {
//        this.n1 = n1;
//        this.n2 = n2;
//    }
//}
//class Graph {
//    Map<String, LinkedList<Edge>> graph = new HashMap<>();
//
//    /*
//     * Method to add a given node to the graph
//     * @param node
//     */
//    public void addNode(String node) {
//        this.graph.put(node, new LinkedList<>());
//    }
//
//    /*
//     * Method to add a node between two given nodes
//     * @param n1
//     * @param n2
//     */
//    public void addEdge(String n1, String n2) {
//        if (!this.graph.containsKey(n1)) {
//            addNode(n1);
//        }
//        if (!this.graph.containsKey(n2)) {
//            addNode(n2);
//        }
//        Edge edge = new Edge(n1, n2);
//        this.graph.get(n1).add(edge);
//
//        edge = new Edge(n2, n1);
//        this.graph.get(n2).add(edge);
//    }
//
//    /*
//     * Method to get all the nodes in the graph
//     * @return
//     */
//    public Set<String> getAllNodes() {
//        return this.graph.keySet();
//    }
//
//    /*
//     * Method to get all the edges connecting with the given node
//     * @param node
//     * @return
//     */
//    public LinkedList<Edge> getAllEdges(String node) {
//        return this.graph.get(node);
//    }
//
//    /*
//     * Method to check whether the given two nodes are adjacent (neighbours) to each other or not
//     * @param node1
//     * @param node2
//     * @return
//     */
//    public boolean areAdjacent(String node1, String node2) {
//        // write your code here
////        System.out.println(graph.get(node1).element().n2+"=="+node2);
////        System.out.println(graph.get(node2).element().n2+"=="+node1);
////        System.out.println(graph.get(node1).element().n2);
////        System.out.println(graph.get(node1).element().n1);
//
////        System.out.println(graph.get(node2).element().n2);
////        System.out.println(graph.get(node2).element().n1);
//        if(graph.get(node1).element().n2.equals(node2)) {
//            return true;
//        }
//        if(graph.get(node2).element().n2.equals(node1)) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }
//}
//    public class NeighbouringCities {
//        static Graph graph = new Graph();
//
//        /**
//         * Method to get different pair of the cities from user input
//         *
//         * @param scanner
//         */
//        public static void readMap(Scanner scanner) {
//
//            // getting the pair of nodes from the input until an empty line is found
//            while (true) {
//
//                // read the current line of input
//                String line = scanner.nextLine();
//                // break the loop when the line is empty
//                if (line.equals("")) {
//                    break;
//                }
//
//                readLine(line);
//            }
//        }
//
//        /*
//         * Method to read a line consisting of a pair of cities separated by comma
//         * @param line
//         */
//        public static void readLine(String line) {
//            String[] nodes = line.split(",");
//            String n1 = nodes[0];
//            String n2 = nodes[1];
//
//            // add an edge between the two cities
//            graph.addEdge(n1, n2);
//        }
//
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//
//            readMap(sc);
//
//            // getting input from the user for the two cities between which the adjacency is to be found
//            String node1 = sc.next();
//            String node2 = sc.next();
//            Boolean adjacency = graph.areAdjacent(node1, node2);
//
//            if (adjacency) {
//                System.out.println("True");
//            } else {
//                System.out.println("False");
//            }
//        }
//    }