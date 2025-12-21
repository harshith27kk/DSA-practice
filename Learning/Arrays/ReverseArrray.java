package Learning.Arrays;

import java.util.Arrays;

public class ReverseArrray {
    public static void main(String[] args) {
        int[] num = {39,44,1,55,23,23};
        revArray(num);
        System.out.println(Arrays.toString(num));
    }

    static void revArray(int[] num){
       int start = 0;
       int end = num.length-1;
       while(start < end){
          swap(num,start,end);
          start++;
          end--;
       }
    }

    static void swap(int[] num, int a, int b){
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }
}
