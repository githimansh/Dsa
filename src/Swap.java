import java.util.Scanner;
public class Swap {
    static void swap(int a, int b){
        System.out.println("Original values before swap");
        System.out.println("a ;" +a);
        System.out.println("b: " +b);

//        int temp= a;
//        a = b;
//        b = temp;
        a= a+b;
        b = a-b;
        a = a-b;

        System.out.println("Values after swap");
        System.out.println("a: " +a );
        System.out.println("b : " +b );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 9;
        int b = 3;
        int arr[]= {1, 2, 3, 4, 5};
        swap(a, b);
    }
}
