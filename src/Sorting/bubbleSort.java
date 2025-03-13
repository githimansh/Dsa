package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // Run the steps n-1 times
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            // For each step, the largest item will move to the correct position
            for (int j = 1; j < arr.length - i; j++) {
                // Swap if the current item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps occurred, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
