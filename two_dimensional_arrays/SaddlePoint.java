package two_dimensional_arrays;

import java.util.*;

public class SaddlePoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int saddlePoint = getSaddlePoint(arr);
        if (saddlePoint == Integer.MIN_VALUE) {
            System.out.println("Invalid input");
        } else {
            System.out.println(saddlePoint);
        }

        scn.close();
    }

    public static int getSaddlePoint(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = getMinInRow(arr, i);
            if (isMaxInCol(arr, i, j)) {
                return arr[i][j];
            }
        }
        return Integer.MIN_VALUE;
    }

    public static int getMinInRow(int[][] arr, int index) {
        int min = 0;
        for (int j = 1; j < arr[0].length; j++) {
            if (arr[index][j] < arr[index][min]) {
                min = j;
            }
        }
        return min;
    }

    public static boolean isMaxInCol(int[][] arr, int row, int col) {
        int max = arr[row][col];
        for (int i = 0, j = col; i < arr.length; i++) {
            if (arr[i][j] > max) {
                return false;
            }
        }
        return true;
    }
}
