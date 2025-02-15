package functions_and_arrays;
import java.util.*;
public class AnybaseAddition {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int base = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        System.out.println(getAddition(base,n1,n2));
        scn.close();
    }
    public static int getAddition(int base, int n1, int n2){
        int c = 0;
        int result = 0;
        int count = 0;
        while(n1 != 0 || n2!= 0 || c != 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int sum = c + d1 + d2;
            c = sum / base;
            sum = sum % base;
            result += ((int)Math.pow(10,count)) * sum;
            count++;
        }
       
        return result;
    }
}
