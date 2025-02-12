package Patterns;
import java.util.*;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int outerSpace = n/2;
        int innerSpace = -1;
        for(int i = 1; i<=n; i++){
            if(i==1 || i==n){
                for(int j = 1; j<=outerSpace; j++){
                    System.out.print("\t");
                }
                System.out.print("*\t");
                outerSpace -=1;
                innerSpace +=2;
            }else{
               
                for(int k = 1; k<=outerSpace; k++){
                    System.out.print("\t");
                }
                System.out.print("*\t");
                for(int k = 1; k<=innerSpace; k++){
                    System.out.print("\t");
                }
                System.out.print("*\t");

                if(i<=n/2){
                    outerSpace -=1;
                    innerSpace +=2;
                  }else{
                    outerSpace +=1;
                    innerSpace -=2;
                  }
            }
            System.out.println();
        }
        scn.close();
    }
}
