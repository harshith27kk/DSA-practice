package Learning.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ToString {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
       int [] arr = new int[3];
       arr[0] = 10;
       arr[1] = 30;
       arr[2] = 43;
//        System.out.println(Arrays.toString(arr));

        for(int i: arr){
            System.out.println(Arrays.toString(arr));
        }
    }
}
