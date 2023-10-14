import java.util.Scanner;
public class Differnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st number");
        int num_1 = sc.nextInt();

        System.out.println("enter 2nd number");
        int num_2 = sc.nextInt();

        int difference = num_1 - num_2;

        System.out.println("Difference:"  + difference);
    }
}
