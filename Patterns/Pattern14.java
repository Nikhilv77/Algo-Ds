package Patterns;
import java.util.*;
public class Pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i<=10; i++){
           System.out.println(n + " x " + i + " = " + (n*i));
        }
        scn.close();
    }
}
