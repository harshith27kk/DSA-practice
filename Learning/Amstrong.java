package Learning;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
//        int number = n.nextInt();
        for(int i = 1; i <= 10000; i++){
            if(isAmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isAmstrong(int n){
        int rem = 0;
        int sum = 0;
        int qube = 0;
        int number = n;
        while(n>0){
            rem = n%10;
            sum += rem*rem*rem;
            n = n/10;
        }
        return number == sum;
//        if(number != sum){
//            System.out.println("its a not amstrong number");
//            return false;
//        }else{
//            System.out.println("its a amstroong number");
//            return true;
//        }
    }
}
