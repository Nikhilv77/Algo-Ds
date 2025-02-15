package Patterns;
import java.util.*;
public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int star = n;
        int space = 0;
        for(int i = 1; i<=n; i++){
          for(int j = 1; j<=space; j++){
            System.out.print("\t");
          }
          for(int k = 1; k<=star; k++){
            if(i>1 && i<=n/2 && k>1 && k<star){
                System.out.print("\t");
            }else{
                System.out.print("*\t");
            }
          }
          if(i<=n/2){
            star-=2;
            space++;
          }else{
            star +=2;
            space--;
          }
          System.out.println();
        }
        scn.close();
    }
}
