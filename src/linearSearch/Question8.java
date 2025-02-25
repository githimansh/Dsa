package linearSearch;

import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
        int [][] arr = {
                { 23, 54, 67, 8},
                {18, 35, 3, 51},
                {78, 99, 34, 56},
                {18, 23}
        };
        int target = 3;
        int [] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for(int row =0; row < arr.length; row++ ){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
