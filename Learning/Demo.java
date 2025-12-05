package com.harshith.main.java;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = print.nextInt();
        int number2 = print.nextInt();
        int sum = number + number2;
        System.out.println("sum is " + sum);
    }
}
