package com.session30;

import java.util.Scanner;

public class NumberIsPowerOfTwo {
    static void powerOfTwo(String str) {
        // Write your code here
        int n =Integer.parseInt(str);
        if (n < 2) {
            System.out.println("false");
            return;
        }
        while (n > 1) {
            if (n % 2 != 0) {
                System.out.println("false");
                return;
            }
            n = n / 2;
        }
        System.out.println("true");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        powerOfTwo(str);
    }
}
