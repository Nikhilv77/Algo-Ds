import java.util.*;

class IsANumberPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        boolean answer = isPrime(number);
        System.out.println(answer);
        scn.close();
    }

    public static boolean isPrime(int number) {
        if(number<1){
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}