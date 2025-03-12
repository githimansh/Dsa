package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i = 0; i < arr.length -1; i++){
            swapped = false;
            //for each step, max item will come at the last respective index
            for(int j = 1; j < arr.length -1; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j -1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
