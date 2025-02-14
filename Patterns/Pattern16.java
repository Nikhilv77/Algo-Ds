package Patterns;
import java.util.*;
public class Pattern16{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = 1;
        int space = (n*2)-3;
        for(int i = 1; i<=n; i++){
            int val = 1;
            for(int j = 1; j<=star; j++){
                System.out.print(val++ + "\t");
            }
            if(i == n){
                val--;
            }
            for(int k = 1; k<=space; k++){
                System.out.print("\t");
            }
            for(int l = 1; l<=star; l++){
                if(i == n && l == star){
                    System.out.print( "\t");
                }else{
                    System.out.print(val-1 + "\t");
                }
                val--;
            }
            star++;
            space -=2;
            System.out.println();
        }
        scn.close();
    }
}