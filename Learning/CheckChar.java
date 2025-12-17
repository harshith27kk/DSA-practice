package Learning;

import java.util.Scanner;

public class CheckChar {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        char letter = c.next().trim().charAt(0);
//        if(Character.isUpperCase(letter)){
//            System.out.println("uppercase");
//        } else {
//            System.out.println("lower");
//        }
        if(letter >= 'a' && letter <='z')
        {
            System.out.println("lower");
        } else {
            System.out.println("upper");
        }
    }
}
