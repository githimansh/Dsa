import java.util.Scanner;
public class SumOfMatrice {

    static void printMatrixes(int arr[][]){
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void Sum(int a[][], int r1, int c1, int b[][], int r2, int c2){
        if(r1 != r2 || c1 !=c2){
            System.out.println("Wrong Input - Addition not possible");
            return;
        }
        int sum[][] = new int [r1][c1];

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of the matrixes 1 and 2: ");
        printMatrixes(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of rows and columns of matrix 1 : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int [r1][c1];
        System.out.println("enter Matrix value ");

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter no. of row and columns of Matrix 2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("enter martix value : ");

        for(int i =  0; i < r2; i++){
            for(int j = 0; j < c2; j++ ){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.print(" Matrix 1: ");
        printMatrixes(a);

        System.out.print(" Matrix 2:  ");
        printMatrixes(b);

        Sum(a, r1, c1, b, r2, c2);
    }
}
