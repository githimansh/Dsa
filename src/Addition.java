import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no");
        int num_1 = sc.nextInt();

        System.out.println("enter 2nd no");
        int num_2 = sc.nextInt();

       System.out.println( "sum:" + (num_1 + num_2));

       System.out.println( "Difference" + (num_1 - num_2));

       System.out.println("Multiple" + (num_1* num_2));

       System.out.println("Divide" + ( num_1 / num_2));

    }
}
