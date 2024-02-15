////import java.util.Scanner;
//public class SortEvenAndOdd {
//    static void printArray(int arr[]){
//        for(int i =0; i< arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println();
//    }
//    static void swapInArray(int arr[], int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    static void sortevenandodd(int arr[]){
//        int n = arr.length;
//        int left = 0, right = n-1;
//        while(left<right){
//            if(arr[left] % 2 ==1 && arr[right] % 2 == 0){
//                swapInArray(arr, left, right);
//                left ++;
//                right--;
//            }
//            if(arr[left] % 2 != 0){
//                left++;
//            }
//            if(arr[right] % 2==0){
//                right--;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("enter the size of the array ");
////        int n = sc.nextInt();
////
////        int arr[] = new int [n];
////        System.out.println("Enter "+ n + " element: ");
////
////        for(int i = 0; i<arr.length; i++){
////            arr[i] = sc.nextInt();
////        }
////        System.out.print("original array : ");
////        printArray(arr);
//       int arr[]= {3, 5, 4,6 ,7 ,8,9};
//        sortevenandodd(arr);
////        printArray(arr);
//
//        System.out.print("sorted array : " );
//        printArray(arr);
//
//    }
//}
public class SortEvenAndOdd {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swapInArray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortevenandodd(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swapInArray(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 != 0) {
                left++;
            }
            if (arr[right] % 2 == 0) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        // Uncomment the following code if you want to take input from the user
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        */

        int arr[] = {3, 5, 4, 6, 7, 8, 9};
        sortevenandodd(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
