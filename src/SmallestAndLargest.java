import java.util.Arrays;
import java.util.Scanner;
public class SmallestAndLargest {
    static int [] smallestAndlargest( int arr[]){
        Arrays.sort(arr);
        int ans[] = {arr[0], arr[arr.length-1]};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();

        int arr[] = new int [n];
        System.out.println("enter " + n + "element ");

        for(int i=0;i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
//        System.out.println(smallestAndlargest(arr));
        int ans [] = smallestAndlargest(arr);
        System.out.println("Smallest: " +ans[0]);
        System.out.println("largest : " +ans[1]);

    }
}
