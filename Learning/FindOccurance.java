package com.harshith.main.java;

import java.util.Scanner;

public class FindOccurance {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter a number");
        int number = n.nextInt();

        int series = 92928882;
        int count = 0;
        while(series > 0){
            int rem = series%10;
            if(rem == number){
                count++;
            }
            series = series/10;
        }
        System.out.println(number + " occurred " + count + " times");
}}
