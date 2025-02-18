package functions_and_arrays;

import java.util.*;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int key = scn.nextInt();
        int firstIndex = getFirstIndex(arr, key);
        int lastIndex = getLastIndex(arr, key);
        System.out.println(firstIndex);
        System.out.println(lastIndex);
        scn.close();
    }

    public static int getFirstIndex(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int potentialFirstIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                potentialFirstIndex = mid;
                high = mid - 1;
            }
        }
        return potentialFirstIndex;
    }

    public static int getLastIndex(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int potentialLastIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                potentialLastIndex = mid;
                low = mid + 1;
            }
        }
        return potentialLastIndex;
    }
}
