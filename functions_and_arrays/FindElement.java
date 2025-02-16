package functions_and_arrays;
import java.util.*;
public class FindElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int element = scn.nextInt();
        System.out.println(getElement(arr,element));
        scn.close();
    }
    public static int getElement(int[] arr, int element){
        int answer = -1;
        for(int i = 0; i<arr.length; i++){
          if(arr[i] == element){
            answer = i;
            break;
          }
        }
        return answer;
    }
}
