package Patterns;
import java.util.*;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int space = 1;
    int star = n/2+1;
    for(int i = 1; i<=n; i++){
        for(int j = 1; j<=star; j++){
        System.out.print("*\t");
        }
        for(int k = 1; k<=space; k++){
            System.out.print("\t");
        }
        for(int l = 1; l<=star; l++){
            System.out.print("*\t");
        }
        if(i<=n/2){
            star -=1;
            space +=2;
        }else{
            star +=1;
            space -=2;
        }
        System.out.println();
    }
    scn.close();
    }
}
