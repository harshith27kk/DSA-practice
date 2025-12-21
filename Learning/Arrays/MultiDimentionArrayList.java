package Learning.Arrays;

import java.util.ArrayList;
import java.util.Random;

public class MultiDimentionArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mul = new ArrayList<>();
        Random ran = new Random();
        int randnumber = ran.nextInt();

        for(int i = 0; i<3; i++){
            mul.add(new ArrayList<>());
        }

        for(int i = 0; i<3; i++){
            for(int j = 1; j<=3; j++){
                mul.get(i).add(randnumber);
            }
        }
        System.out.println(mul);
    }
}
