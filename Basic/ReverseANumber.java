import java.util.*;
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        while(number != 0){
            int remainder = number % 10;
            System.out.println(remainder);
            number = number / 10;
        }
        scn.close();
    }

}
