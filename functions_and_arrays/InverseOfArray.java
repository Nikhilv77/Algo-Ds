package functions_and_arrays;
import java.util.*;
public class InverseOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int[] inverse = inverseArray(arr);
        for(int i = 0; i<inverse.length; i++){
            System.out.print(inverse[i] + " ");
        }
        scn.close();
    }
    public static int[] inverseArray(int[] arr){
        int[] inverse = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            int val = arr[i];
            inverse[val] = i;
        }
        return inverse;
    }
}
