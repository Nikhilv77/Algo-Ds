package two_dimensional_arrays;
import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr1 = new int[n][m];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[0].length; j++){
                arr1[i][j] = scn.nextInt();
            }
        }
        int o = scn.nextInt();
        int p = scn.nextInt();
        int[][] arr2 = new int[o][p];
        for(int i = 0; i<arr2.length; i++){
            for(int j = 0; j<arr2[0].length; j++){
                arr2[i][j] = scn.nextInt();
            }
        }
        int[][] multipliedArray = getMatrixMultiplication(arr1, arr2);
        for(int i = 0; i<multipliedArray.length; i++){
            for(int j = 0; j<multipliedArray[0].length; j++){
              System.out.print(multipliedArray[i][j] + "\t");
            }
            System.out.println();
        }
        scn.close();
    }
    public static int[][] getMatrixMultiplication(int[][] arr1, int[][] arr2){
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;
        if(c1 != r2){
            System.out.println("These matrix can not be multiplied because of wrong format");
            return new int[0][0];
        }
        int[][] resultMatrix = new int[r1][c2];
        for(int i = 0; i<resultMatrix.length; i++){
            for(int j = 0; j<resultMatrix[0].length; j++){
                int cellVal = 0;
                for(int k = 0; k<arr2.length; k++){
                 cellVal += arr1[i][k] * arr2[k][j];
                }
                resultMatrix[i][j] = cellVal;
            }
        }
        return resultMatrix;
    }
}
