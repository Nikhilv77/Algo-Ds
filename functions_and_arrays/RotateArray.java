package functions_and_arrays;
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        rotateArray(arr, k);
        for(int val : arr){
            System.out.print(val + " ");
        }
        scn.close();
    }
    public static void rotateArray(int[] arr, int k){
        if(arr.length == 0)
        return;

        k = k % arr.length;
        if(k < 0){
            k = k + arr.length;
        }
        int i = 0;
        while(i<arr.length-k){
            i++;
        }
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }
    public static void reverse(int[] arr, int i, int j){
        int low = i;
        int high = j;
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
