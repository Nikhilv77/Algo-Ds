package Patterns;
import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = 0;
        int star = n;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<space; j++){
                System.out.print("\t");
            }
            for(int k = 0; k<star; k++){
                System.out.print("*\t");
            }
            System.out.println();
            space++;
            star--;
        }
        scn.close();
    }
}
