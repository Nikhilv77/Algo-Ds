package Patterns;
import java.util.*;
public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int star = 1; 
        int space = n/2;
        for(int i = 1; i<=n; i++){
            if(i==n/2+1){
               for(int j = 1; j<=n; j++){
                System.out.print("*\t");
               }
            }else{
                for(int j = 1; j<=space; j++){
                    System.out.print("\t");
                   }
                   for(int k = 1; k<=star; k++){
                    System.out.print("*\t");
                   }
            }
           if(i<=n/2){
            star++;
           }else{
            star--;
           }
           System.out.println();
        }
        scn.close();
    }
}
