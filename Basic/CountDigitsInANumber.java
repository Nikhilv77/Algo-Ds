import java.util.Scanner;
public class CountDigitsInANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int ans = countDigitsOfANumber(number);
        System.out.println(ans);
        scn.close();
    }
    public static int countDigitsOfANumber(int number){
        int count = 0;
        while(number != 0){
        number = number / 10;
        count++;
        }
        return count;
    }
}
