package com.HashFunctionsTablesMapping;

public class SearchingEmailsInUnsortedArray {
    public static void main(String[] args)
    {
        String[] emails = {"chandler.bing@xyz.com","ross.geller@xyz.com","rachel.greene@xyz.com","joey.tribbiani@xyz.com","monica.geller@xyz.com","phoebe.buffay@xyz.com","sheldon.copper@xyz.com","marie.george@xyz.com"};

        String NewEmail="monica.geller@xyz.com";
        int result=-1;
        // Write your code here
        for(int i=0;i<emails.length;i++) {
            if(emails[i].equals(NewEmail)) {
                result=i;
            }
        }
        System.out.print(result);
    }
}

