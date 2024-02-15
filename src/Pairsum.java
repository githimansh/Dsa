import java.util.Scanner;
public class Pairsum {
    static int pairSum(int arr[], int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for(int z = j+1; z<n; z++) {
                    if (arr[i] + arr[j] + arr[z]== target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter " + n + " elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("target Sum : ");
        int target = sc.nextInt();

        System.out.println( pairSum(arr, target));
    }
}
