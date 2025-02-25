package linearSearch;

public class Question9 {
    public static void main(String[] args) {
       int [][] arr = {
               {24, 56, 78, 32},
               {43, 44, 98, 99},
               {12, 55, 2},
               {24, 87},
       };
        System.out.println(max(arr));
    }
    static int max(int[][] arr ) {
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
