package functions_and_arrays;
import java.util.*;
public class AnybaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int base = scn.nextInt();
        scn.close();
        System.out.println(convertedNumber(number,base));
    }
    public static int convertedNumber(int number, int base){
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
}
