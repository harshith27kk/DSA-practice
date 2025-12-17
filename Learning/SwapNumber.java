package Learning;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num1,num2;
        num1 = n.nextInt();
        num2 = n.nextInt();
        swap(num1, num2);
    }
    static void swap(int n1, int n2){
        int temp = n1;
        n1 = n2;
        n2 =temp;
        System.out.println("n1 is "+n1 + " n2 is " + n2);
    }
}
