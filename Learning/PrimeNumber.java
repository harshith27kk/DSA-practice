package Learning;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        isPrime(number);
    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c <= Math.sqrt(n)){
            if(n%c == 0){
                System.out.println("its not a prime number");
                return false;
            }
            c++;

        }
        System.out.println("its a prime number");
        return true;
    }
}
