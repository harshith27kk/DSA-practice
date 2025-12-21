package Learning.Arrays;

import java.util.Arrays;

public class ArrayPassingFunction {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,56};
        System.out.println(Arrays.toString(arr));
                changeInt(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void changeInt(int[] arr){
         arr[1] = 27;
    }
}
