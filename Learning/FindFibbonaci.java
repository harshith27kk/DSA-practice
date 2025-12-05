package com.harshith.main.java;

import java.util.Scanner;

public class FindFibbonaci {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a nth fibonacci number to print:");
        int n = number.nextInt();
//        if(n<1){
//            System.out.println("enter positive number >=1");
//        }

        int a = 0;
        int b = 1;
        int result = 0;
        if(n == 0) {
            System.out.println(a);
            return;
        } else if(n== 1){
            System.out.println(b);
            return;
        }
        for(int i = 2; i<=n;i++){
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println(b);
    }
}
