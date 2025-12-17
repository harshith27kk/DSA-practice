package Learning;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = num.nextInt();
        System.out.print("Enter b number: ");
        int b = num.nextInt();
        System.out.print("Enter c number: ");
        int c = num.nextInt();
        //find the largest of 3 numbers

//        if(a>b && a>c){
//            System.out.println(a + " is greater number");
//        } else if(b>a && b>c){
//            System.out.println(b + " is greater number");
//        } else {
//            System.out.println(c + " is greater");
//        }

//        int max = a;
//        if(b>max){
//            max = b;
//        } else if(c>max) {
//            max = c;
//        }

        int max  = Math.max(c, Math.max(a,b));
        System.out.println("maximmun nuber is " + max);

    }
}
