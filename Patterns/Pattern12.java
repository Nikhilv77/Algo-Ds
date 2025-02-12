package Patterns;
import java.util.*;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int increment = 1;
        for(int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
             System.out.print((fibonacci(increment++)) + "\t");
            }
            System.out.println();
        }
        scn.close();
    }
    public static int fibonacci(int n){
        if(n == 1) return 0;
        if(n == 2) return 1;
        int a = 0; 
        int b = 1;
        for(int i = 2; i<n; i++){
            int c = a+b; 
            a=b;
            b=c;
        }
        return b;
    }
}
