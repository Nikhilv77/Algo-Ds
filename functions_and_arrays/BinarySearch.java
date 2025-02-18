package functions_and_arrays;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int key = scn.nextInt();
        Arrays.sort(arr);
        System.out.println(binarySearch(arr, key));
        scn.close();
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int answer = -1;
        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                answer = mid;
                break;
            }
        }
        return answer;
    }
}
