package two_dimensional_arrays;
import java.util.*;

public class ExitPointOfMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int[] exitPoint = getExitPointOfMatrix(arr);
        System.out.println(exitPoint[0] + ", " + exitPoint[1]);
        scn.close();
    }
    
    public static int[] getExitPointOfMatrix(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        
        int i = 0, j = 0;
        // direction: 0 = east, 1 = south, 2 = west, 3 = north
        int direction = 0;
        
        while (i >= 0 && i < n && j >= 0 && j < m) {
            // Update direction based on the current cell's value
            direction = (direction + arr[i][j]) % 4;
            
            // Move one step in the current direction
            if (direction == 0) { // east
                j++;
            } else if (direction == 1) { // south
                i++;
            } else if (direction == 2) { // west
                j--;
            } else if (direction == 3) { // north
                i--;
            }
        }
        
        // Adjust to the last valid position (inside the matrix)
        if (i < 0) {
            i++;
        } else if (i >= n) {
            i--;
        }
        
        if (j < 0) {
            j++;
        } else if (j >= m) {
            j--;
        }
        
        return new int[]{i, j};
    }
}
