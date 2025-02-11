import java.util.*;

public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int ans = inverseNumber(number);
        System.out.print(ans);
        scn.close();
    }

    public static int inverseNumber(int number) {
        int invsersedNumber = 0;
        int index = 1;
        while(number != 0){
            int remainder = number % 10;
            int power = (int)Math.pow(10,remainder-1);
            invsersedNumber+=power*index;
            index++;
            number /=10;
        }
        return invsersedNumber;
    }

}
