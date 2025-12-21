package Learning.Arrays;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        Random rand = new Random();
        int randNumber = rand.nextInt();
        for(int i = 1; i<5; i++){
            number.add(randNumber);
        }
        number.addFirst(27);
        number.addLast(28);
        System.out.println(number.get(0));
        System.out.println(number);
    }
}
