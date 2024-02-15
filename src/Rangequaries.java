import java.util.Scanner;
public class Rangequaries {
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

        int arr[] = new int[n+1];
        System.out.println("enter " + n + " element");

        for(int i = 1; i <=n; i++){
            arr[i] = sc.nextInt();
        }
        int [] prefSum = makeprefixsumOfArray(arr);

        System.out.println("enter no. of queries: ");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.println("Enter Range: ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l-1];

            System.out.println("Sum " +ans );
        }
    }
}
