package functions_and_arrays;
import java.util.*;
public class DifferenceOfTwoArrays {
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
        int[] ans = getDifferenceOfTwoArrays(arr1, arr2);
        int idx = 0;
        while(idx<ans.length){
            if(ans[idx] == 0){
                idx++;
            }else{
                break;
            }
        }
        while(idx<ans.length){
            System.out.print(ans[idx] + " ");
            idx++;
        }
        scn.close();
    }
    public static int[] getDifferenceOfTwoArrays(int[] arr1, int[] arr2){
        int[] result = new int[arr2.length];
        int i = arr1.length-1; 
        int j = arr2.length-1;
        int k = result.length-1;
        int borrow = 0;
        while(j>=0){
            int a1val = (i>=0)?arr1[i]:0;
           int digit = 0;
           if(arr2[j]-borrow < a1val){
            digit = (arr2[j] + 10 - borrow) - a1val;
            borrow = 1;
           }else{
            digit = (arr2[j] - borrow) - a1val;
            borrow = 0;
           }
           result[k] = digit;
           i--;
           j--;
           k--;
        }
        return result;
    }
}
