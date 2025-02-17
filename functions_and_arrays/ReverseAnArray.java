package functions_and_arrays;
import java.util.*;
public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        reverseArray(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        scn.close();
    }
    public static void reverseArray(int[] arr){
        int i = 0; 
        int j = arr.length-1;
        while(i != j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
