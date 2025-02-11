import java.util.*;
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        printPrimeFactorization(number);
        scn.close();
    }
    public static void printPrimeFactorization(int number){
        for(int i = 2; i*i<=number; i++){
        while(number % i ==0){
            number = number / i;
            System.out.println(i);
        }
     
        }
        if(number!=1){
            System.out.println(number);
        }
    }
}
