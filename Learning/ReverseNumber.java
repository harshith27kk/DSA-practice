package com.harshith.main.java;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter a number to reverse");
        String number = n.next();
        String rev = "";

        for( int i = number.length()-1; i>=0; i--){
            rev += (number.charAt(i));
        }
        if(rev.equals(number)){
            System.out.println("the given number or string is palindrom");
        }else{
            System.out.println("the given number or string is not palindrom");
        }
        System.out.println("rever is " + rev);

//        long rev = 0;
//        long rem = 0;
//
//        while(number > 0){
//            rem = number%10;
//            rev = rev*10+rem;
//            number = number/10;
//        }
//        System.out.println("reversed number is " + rev);
    }
}
