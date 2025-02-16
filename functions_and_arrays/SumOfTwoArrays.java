package functions_and_arrays;
import java.util.*;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }
        
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        int[] ans = getSumOfArrays(arr1, arr2);

        int idx = 0;
        while (idx < ans.length && ans[idx] == 0) {
            idx++; 
        }
        if (idx == ans.length) {
            System.out.println(0);
        } else {
            while (idx < ans.length) {
                System.out.print(ans[idx] + " ");
                idx++;
            }
        }

        scn.close();
    }

    public static int[] getSumOfArrays(int[] arr1, int[] arr2) {
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] result = new int[maxLength + 1]; 

        int i = arr1.length - 1; 
        int j = arr2.length - 1; 
        int k = result.length - 1; 
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? arr1[i] : 0;
            int digit2 = (j >= 0) ? arr2[j] : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result[k] = sum % 10;

            i--;
            j--;
            k--;
        }
        return result;
    }
}
