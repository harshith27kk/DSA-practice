package Learning.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] str = new String[3];
        for(int i = 0; i< str.length;i++){
            if(i == 1){
                str[i] = "harshith";
                continue;
            }
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
