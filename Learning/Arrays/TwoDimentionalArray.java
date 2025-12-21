package Learning.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimentionalArray {
    public static void main(String[] args) {
//       int[][] arr =  {{1,2,3},{4,5,6},{7,8,9}};
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(arr[0][0]);
        for (int[] ints : arr) {
                System.out.println(Arrays.toString(ints));
        }

    }
}
