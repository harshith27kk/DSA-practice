package Learning.Arrays;

import java.util.Arrays;

public class SwapNumber {
    public static void main(String[] args) {
        int[] num = {2,5,33};
        swap(num,1,2);
        System.out.println(Arrays.toString(num));
    }
    static void swap(int[] num, int a, int b){
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }
}
