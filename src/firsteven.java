import java.util.Scanner;

public class firsteven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of even numbers to print
        int num = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(num);
            num += 2;
        }
    }
}
