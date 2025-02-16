package functions_and_arrays;

import java.util.*;

public class AnybaseMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int ans = getProduct(base, n1, n2);
        System.out.println(ans);
        scn.close();
    }

    public static int getProduct(int base, int n1, int n2) {
        int result = 0;
        int power = 1;
        while (n2 != 0){
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int singleProduct = getSingleProduct(base, n1, d2);
            result = getAddition(base, result, singleProduct * power);
            power = power * 10;
        }
        return result;
    }

    public static int getSingleProduct(int base, int n1, int d2) {
        int c = 0;
        int p = 1;
        int result = 0;
        while (n1 != 0 || c != 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int digit = (d1 * d2) + c;
            c = digit / base;
            digit = digit % base;
            result += digit * p;
            p = p * 10;
        }
        return result;
    }

    public static int getAddition(int base, int n1, int n2) {
        int result = 0;
        int c = 0;
        int p = 1;
        while (n1 != 0 || n2 != 0 || c != 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int digit = d1 + d2 + c;
            c = digit / base;
            digit = digit % base;
            result += digit * p;
            p = p * 10;
        }
        return result;
    }
}
