package functions_and_arrays;
import java.util.*;
public class SubsetsOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        printSubsets(arr);
        scn.close();
    }
    public static void printSubsets(int[] arr){
       int limit = (int)Math.pow(2,arr.length);
       for(int i = 0; i<limit; i++){
        String set = "";
        int temp = i;
        for(int j = arr.length-1; j>=0; j--){
         int remainder = temp % 2;
         temp = temp / 2;
         if(remainder == 0){
         set =  "-\t" + set;
         }else{
            set=arr[j] + "\t" + set;
         }
        }
        System.out.println(set);
       }
}
}
