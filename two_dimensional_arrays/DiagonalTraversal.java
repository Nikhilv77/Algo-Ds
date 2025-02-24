package two_dimensional_arrays;
import java.util.*;
public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        printDiagonalTraversal(arr);
        scn.close();
    }
    public static void printDiagonalTraversal(int[][] arr){
        for(int i = 0; i < arr.length; i++){
           for(int temp = 0, j = i; j < arr[0].length; j++,temp++){
             System.out.println(arr[temp][j]);
           }
        }
    }
}
