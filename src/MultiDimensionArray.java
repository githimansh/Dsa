public class MultiDimensionArray {

    static void printArray(int[][]arr){

        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][]arr2 = {
                { 1, 2, 3},
                 { 6, 7, 3},
        {8, 4, 2},
        };
        printArray(arr2);
    }
}
