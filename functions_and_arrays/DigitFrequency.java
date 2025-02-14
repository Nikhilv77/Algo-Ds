package functions_and_arrays;
import java.util.*;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int digit = scn.nextInt();
        int frequency = getFrequency(n, digit);
        System.out.println(frequency);
        scn.close();
    }
    public static int getFrequency(int n, int digit){
        int frequency = 0;
        while(n != 0){
            int lastDigit = n % 10;
            if(lastDigit==digit){
                frequency++;
            }
            n = n/10;
        }
        if(frequency == 0){
            return -1;
        }else{
            return frequency;
        }
    }
}
