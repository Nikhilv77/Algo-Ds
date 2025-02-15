package functions_and_arrays;
import java.util.*;
public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int base = scn.nextInt();
        scn.close();
        System.out.println(convertedNumber(number,base));
    }
    public static int convertedNumber(int number, int base){
        int convertedNumber = 0;
        int powerCount = 0;
        while(number != 0){
            int remainder = number % base;
            number = number / base;
            convertedNumber = convertedNumber + (remainder *(int)Math.pow(10,powerCount));
            powerCount++;
        }
        return convertedNumber;
    }
}
