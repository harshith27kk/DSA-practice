package Learning.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindMaxItem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[5];
        for(int r = 0; r<num.length; r++){
            num[r]  =  in.nextInt();
        }

        System.out.println(Arrays.toString(num));
        System.out.println( findMax(num));
    }
    static int findMax(int[] num){
//        int[] max = Arrays.stream(num).sorted().toArray();
//        System.out.println(Arrays.toString(max));
//        return max[max.length-1];

        int max = num[0];
        for(int i= 1; i<num.length;i++){
           if(num[i]> max){
               max = num[i];
           }
        }
return max;
    }
}
