//package com.GreedyAlgos;
//import java.util.*;
//public class FractionalKnapsackProblem {
//    static double fractionalKnapsack(int capacity_is,int[] v,int[] w){
//        double max_value=0.0;
//        //write your code here
//        return max_value;
//        Collections.sort(items, (a, b) -> {
//            if (b.getValuePerWeight() > a.getValuePerWeight())
//                return 1;
//            else if (b.getValuePerWeight() < a.getValuePerWeight())
//                return -1;
//            else
//                return 0;
//        });
//
//        double totalValue = 0;
//        double remainingCapacity = capacity;
//        for (Item item : items) {
//
//            // when we can take an item as a whole
//            if (item.getWeight() < remainingCapacity) {
//                System.out.println("Take item " + item.getName() + " of " + item.getWeight() + "kg");
//                remainingCapacity -= item.getWeight();
//                totalValue += item.getValue();
//            }
//            // item has to be taken in fractions
//            else {
//                System.out.println("Take item " + item.getName() + " of " + remainingCapacity + "kg");
//                totalValue += remainingCapacity * item.getValuePerWeight();
//                break;
//            }
//        }
//        return totalValue;
//    }
//    public static void main(String args[]){
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int capacity=scanner.nextInt();
//        int[] value=new int[n];
//        int[] weight=new int[n];
//        for(int i=0;i<n;i++){
//            value[i]=scanner.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            weight[i]=scanner.nextInt();
//        }
//        double max_value=fractionalKnapsack(capacity,value,weight);
//        System.out.println(max_value);
//    }
//
//}
