import java.util.Scanner;
public class RotateThematrix {
    static void printMatrix(int matrix[][]){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void transposeInPlace(int arr[][], int r , int c ){
        for(int i = 0; i < c; i++){
            for(int j = i; j < r; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static void rverseArray(int arr[]){
        int i =0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void Rotate (int matrix[][], int n){
        transposeInPlace(matrix, n, n);
        for(int i = 0; i<n; i++){
            rverseArray(matrix[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of row and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int matrix[][] = new int [r][c];
        int totalElement = r*c;
        System.out.println("enter" + totalElement + " value ");

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix : ");
        printMatrix(matrix);

        Rotate(matrix, r);

        System.out.println("Rotation of matrix: ");
        printMatrix(matrix);
    }
}
