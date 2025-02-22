package two_dimensional_arrays;
import java.util.*;
public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        printSpiralTraversal(arr);
        scn.close();
    }
    public static void printSpiralTraversal(int[][] arr){
        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length-1;
        int maxCol = arr[0].length-1;
        int currentElement = 0;
        int totalElements = arr.length * arr[0].length;
        while(currentElement < totalElements){
            // left wall
         for(int i = minRow,j = minCol; i<=maxRow && currentElement < totalElements; i++){
           System.out.println(arr[i][j]);
           currentElement++;
         }
         minCol++;
  
           // bottom wall
         for(int i = maxRow, j = minCol; j<=maxCol && currentElement < totalElements; j++){
            System.out.println(arr[i][j]);
            currentElement++;
         }
         maxRow--;
  
        //right wall
        for(int i = maxRow, j = maxCol; i>=minRow && currentElement < totalElements; i--){
            System.out.println(arr[i][j]);
            currentElement++;
        }
        maxCol--;
 
        // top wall
        for(int i = minRow, j= maxCol; j>=minCol && currentElement < totalElements; j--){
            System.out.println(arr[i][j]);
            currentElement++;
        }
        minRow++;
    }
    }
}
