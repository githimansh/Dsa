import java.util.Scanner;
public class PrefixSum {
    static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static int [] makeprefixsumOfArray (int arr[]){
        for(int i =1; i<arr.length; i++){
            arr[i]+= arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter "+ n + " Element");

        for(int i = 0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Input Array: ");
        printArray(arr);

        makeprefixsumOfArray(arr);

        System.out.println("Array After making prefix sum:");
        printArray(arr);

    }
}
