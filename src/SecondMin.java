import java.util.Scanner;
public class SecondMin {
    static int min(int arr[]) {
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Min) {
                Min = arr[i];
            }
        }
        return Min;
    }
    static int secondmin (int arr []){
       int Min = min(arr);
       int n = arr.length;
       for(int i = 0; i<n; i++){
           if(arr[i]==Min){
               arr[i]= Integer.MAX_VALUE;
           }
       }
       int secondmin = min(arr);
       return secondmin;
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
        System.out.println("Second Min is "+secondmin(arr ));
    }
}
