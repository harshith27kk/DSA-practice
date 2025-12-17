package Learning;

import java.util.Scanner;

public class SampleFunction {

//    public static int findSum(int num1, int num2){
//        return num1 + num2;
//    }
//
//    public static void main(String[] args) {
//        for(int i=0; i<5; i++){
//            Scanner n = new Scanner(System.in);
//            int num1 = n.nextInt();
//            int num2 = n.nextInt();
//            System.out.println("sum of "+ i + " is "+ findSum(num1,num2));
//        }
//    }
public static void main(String[] args) {
    String result = myname("harshith");
    System.out.println(result);


}
static String myname(String name){
    return  "hello " + name;
}
}
