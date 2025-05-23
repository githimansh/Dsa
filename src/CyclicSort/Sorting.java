package CyclicSort;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
      int[] arr = {5, 3, 1, 2, 6, 8, 9, 7, 4, 10, 13, 11, 12};
      sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
