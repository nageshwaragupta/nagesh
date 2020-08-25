package com.HashFunctionsTablesMapping;
import java.util.*;
import java.util.Scanner;

public class AirlineBoardingPassProblem {
    public static void main(String[] args)
    {
        Hashtable<Integer,String> boardingPass= new Hashtable<Integer,String>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int i:arr)
        {
            //Check whether the pass already exists in the hash table or not. If it doesn’t, add it to the table; otherwise, print the duplicate pass number.
            if(!boardingPass.containsKey(i)) {
                boardingPass.put(i,"Checked");
            }else  {
                System.out.print(i);
            }
        }
    }
}
