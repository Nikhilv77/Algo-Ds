import java.util.*;

public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        printDigits(number);
        scn.close();
    }
    public static void printDigits(int number){
        int count = getCount(number);
        int divider = (int)Math.pow(10,count-1);
        while(number != 0){
            int remainder = number % divider;
            int firstDigit = number / divider;
            System.out.println(firstDigit);
            number = remainder;
            divider = divider / 10;
        }
    }
    public static int getCount(int number){
        int count = 0;
        while(number != 0){
            number = number / 10;
            count++;
        }
        return count;
    }
}
