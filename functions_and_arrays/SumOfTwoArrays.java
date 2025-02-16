package functions_and_arrays;
import java.util.*;
public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i<arr2.length; i++){
            arr2[i] = scn.nextInt();
        }
        int[] ans = getSumOfArrays(arr1, arr2);
        for(int val : ans){
            System.out.print(val + " ");
        }
        scn.close();
    }
    public static int[] getSumOfArrays(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length>=arr2.length?arr1.length:arr2.length];
        int i = 0; 
        int j = 0;
        int k = 0;
        int c = 0;
        while(i<arr1.length && j<arr2.length){
           int digit = arr1[i] + arr2[j];
           result[k] = (digit%10) + c;
           c = digit / 10;
           i++;
           j++;
           k++;
        }
        while(i<arr1.length){
            result[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            result[k] = arr2[j];
            j++;
            k++;
        }
        if(c != 0){
            result[result.length-1]+= c;
        }
        return result;
    }
}
