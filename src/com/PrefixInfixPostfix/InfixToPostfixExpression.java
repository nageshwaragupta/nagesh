package com.PrefixInfixPostfix;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfixExpression {
    public static void main(String[] args) {
        InfixToPostfixExpression obj = new InfixToPostfixExpression();
        Scanner in= new Scanner(System.in);
        String exp = in.nextLine();
        String postfixexprsn = obj.convertfunction(exp);
        System.out.println(postfixexprsn);
    }
    public String convertfunction(String someexp) {
        Stack<Character> var = new Stack<>();
        StringBuffer postfix = new StringBuffer();
        for (int i=0;i<someexp.length();i++) {
            char c = someexp.charAt(i);
            if (c == ' ') {
                continue;
            }
            int temp = (int)c;
            //operand
            if (temp >= 48 && temp <=57) {
                postfix.append(c);
            }
            //opening brace
            else if (c == '(') {
                var.push(c);
            }
            //closing brace
            else if (c == ')') {
                while (var.peek() != '(') {
                    postfix.append(var.pop());
                }
                var.pop();
            }
            // operator
            else {
                while (!var.isEmpty() && precedence(c) <= precedence(var.peek()) && var.peek() != '(') {
                    postfix.append(var.pop());
                }
                var.push(c);
            }
        }
        //end of the infix string.
        while(!var.isEmpty()) {
            postfix.append(var.pop());
        }
//        System.out.println(postfix);
        return postfix.toString();
//        return postfix;
    }

    public int precedence(char x) {
        switch (x) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
//        default:
//            return -1;
        }
        return -1;
    }

}
