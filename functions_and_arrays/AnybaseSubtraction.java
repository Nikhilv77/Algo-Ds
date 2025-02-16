package functions_and_arrays;
import java.util.*;
public class AnybaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        System.out.println(getSubtraction(base, n1, n2));
        scn.close();
    }
    public static int getSubtraction(int base, int n1, int n2){
        int result = 0;
        int flag = 0;
        int power = 1;
        while(n1 != 0 || n2 != 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            d2 -=flag;
            n1 = n1 / 10;
            n2 = n2 / 10;
            if(d2 < d1){
                d2 +=base;
                flag = 1;
            }
            int minus = d2 - d1;
            result+= minus * power;
            power *= 10;
        }
        return result;
    }
}
