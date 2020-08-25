package com.session30;
import java.util.*;
public class MinimumNumberOfOperations {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        minimumNumberOfOperations(str1, str2);
    }
    // Method to find the minimum number of operations to be performed
    // on the first string to transform it into the second string
    static void minimumNumberOfOperations(String str1, String str2) {
        // Write your code here
        StringBuffer newstr =  new StringBuffer();
        StringBuffer oldstr = new StringBuffer();
        oldstr.append(str1);
        int a=oldstr.length()-1;
        int b=0;
        while (!str2.equals(newstr.toString())) {
            newstr.delete(0,newstr.length());
            newstr.append(oldstr.charAt(a));
            newstr.append(oldstr.substring(0, a));
            b++;
            newstr.trimToSize();
//        System.out.println(newstr.delete(0,newstr.length()-1));
            oldstr.delete(0,oldstr.length());
            oldstr.append(newstr);
        }
        System.out.println(b);
    }
}
