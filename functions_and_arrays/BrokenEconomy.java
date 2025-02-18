package functions_and_arrays;
import java.util.*;
public class BrokenEconomy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int key = scn.nextInt();
        int[] answer = getCeilAndFloor(arr,key);
        for(int val : answer){
            System.out.println(val);
        }
        scn.close();
    }
    public static int[] getCeilAndFloor(int[] arr, int key){
        int[] ans = new int[2];
        ans[0] = Integer.MIN_VALUE;
        ans[1] = Integer.MAX_VALUE;

        int low = 0; 
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] < key){
              low = mid + 1;
              ans[0] = arr[mid];
            }else if(arr[mid] > key){
              high = mid - 1;
              ans[1] = arr[mid];
            }else{
                ans[0] = arr[mid];
                ans[1] = arr[mid];
                break;
            }
        }
        return ans;
    }
}
