package Learning;

import java.util.Scanner;

public class LearnSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a fruit name");
        String fruit = input.next();

//        if(fruit.equals("Mango")){
//            System.out.println("I love mangos");
//        } else if(fruit.equals("Apple")){
//            System.out.println("I like apples");
//        }

        switch (fruit) {
            case ("Mango") -> System.out.println("I love mangoes");
            case ("Apple") -> System.out.println("I like apples");
            default -> System.out.println("I dont like " + fruit + " fruit");
        }
    }
}
