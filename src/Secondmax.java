
import java.util.Scanner;
public class Secondmax {
    static int max(int arr[]){
        int mx= Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++ ){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int secondmax(int arr[]){
        int mx = max(arr);
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i]==mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax = max(arr);
        return secondmax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the Array ");
        int n = sc.nextInt();

        int arr[] = new int [n];
        System.out.println("Enter "+n+" elements");

        for(int i =0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Second Max is "+secondmax(arr ));
    }
}
