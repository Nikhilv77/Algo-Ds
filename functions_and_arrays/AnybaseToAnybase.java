package functions_and_arrays;
import java.util.*;
public class AnybaseToAnybase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int currentBase = scn.nextInt();
        int desiredBase = scn.nextInt();
        int anybaseToDecimal = getAnybaseToDecimal(number,currentBase);
        int decimalToAnybase = getDecimalToAnybase(anybaseToDecimal,desiredBase);
        System.out.println(decimalToAnybase);
        scn.close();
    }
    public static int getAnybaseToDecimal(int number, int base){
        int result = 0;
        int powerCount = 0;
        while(number != 0){
            int remainder = number % 10;
            number = number / 10;
            result = result + (remainder * (int)Math.pow(base,powerCount));
            powerCount++;
        }
        return result;
    }
    public static int getDecimalToAnybase(int number, int base){
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
