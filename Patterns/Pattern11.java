package Patterns;
import java.util.*;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int increment = 1;
        for(int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
             System.out.print((increment++) + "\t");
            }
            System.out.println();
        }
        scn.close();
    }
}
