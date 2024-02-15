import java.util.Scanner;
public class FirstRepeatingNumber {
    static int firstrepeatinnumber(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the Array ");
        int n = sc.nextInt();

        int arr[] = new int [n];
        System.out.println("enter "+n+ "elements ");

        for(int i =0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("First Repeating Number is " +firstrepeatinnumber(arr));

    }
}
