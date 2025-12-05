package com.harshith.main.java;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class Calculator {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.println("Enter a num1");
        int num1 = n1.nextInt();
        Scanner n2 = new Scanner(System.in);
        System.out.println("Enter a num2");
        int num2 = n2.nextInt();
        Scanner op = new Scanner(System.in);
        System.out.println("Enter a operator");
        String operator = op.next();
        int result = 0;
        label:
        while(true){
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "x":
                    System.out.println("bye");
                    break label;
            }
            break;
        }
        System.out.println(result);

    }
}
