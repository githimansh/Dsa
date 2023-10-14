import java.util.Scanner;
public class multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number ");
        int num_1 = sc.nextInt();

        System.out.println("Enter 2nd no");
        int num_2 = sc.nextInt();

        int multiple = num_1 * num_2;

        System.out.println("multiple:" + multiple);
    }
}
