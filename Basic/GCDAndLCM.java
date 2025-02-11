import java.util.*;
public class GCDAndLCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int firstNumber = scn.nextInt();
        int secondNumber = scn.nextInt();
        printGCDAndLCM(firstNumber,secondNumber);
        scn.close();
    }
    public static void printGCDAndLCM(int firstNumber, int secondNumber){
        int originalFirstNumber = firstNumber;
        int originalSecondNumber = secondNumber;
        while(secondNumber % firstNumber !=0){
            int remainder = secondNumber % firstNumber;
            secondNumber = firstNumber;
            firstNumber = remainder;
        }
        int gcd = firstNumber;
        int lcm = (originalFirstNumber * originalSecondNumber)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
