package com.PrefixInfixPostfix;

import java.util.Scanner;
import java.util.Stack;

public class EvaluationOfPostfixExpression {
    public static void main(String arg[]) {
        Stack<Integer> s = new Stack<Integer>();
        Scanner in = new Scanner(System.in);
        EvaluationOfPostfixExpression a = new EvaluationOfPostfixExpression();
        String exp = in.nextLine();
        //Write your code here
        double answer= a.evaluvatePostfix(exp);
        System.out.println(answer);
    }
    public double evaluvatePostfix(String someexp) {
        Stack<Double> temp = new Stack<>();
        for(int i=0;i<someexp.length();i++) {
            char c= someexp.charAt(i);
            double var=(int)c;
            if(var>=48 && var<=57) {
                temp.push(var-48);
            } else {
                double operand1=temp.pop();
                double operand2=temp.pop();
                double result=evaluvate(operand1,operand2,c);
                temp.push(result);
            }
        } return temp.pop();
    }
    public double evaluvate(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+' :
                return operand1+operand2;
            case '-':
                return operand2-operand1;
            case '*' :
                return operand1*operand2;
            case '/' :
                return operand2/operand1;
            default:
                return -1.0;
        }
    }
}