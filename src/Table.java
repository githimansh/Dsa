import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter Number");
        int N = sc.nextInt();


        for(int i =1; i<=10; i++){
            System.out.println(N + " * " + i+ " = " + N*i);
        }
    }
}

//import java.util.Scanner;
//
//public class Table {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Read the input integer
//        int N = scanner.nextInt();
//
//        // Print the first 10 multiples of N
//        for (int i = 1; i <= 10; i++) {
//            int result = N * i;
//            System.out.printf("%d x %d = %d%n", N, i, result);
//        }
//
//    }
//}
