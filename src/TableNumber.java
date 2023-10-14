import java.util.Scanner;
public class TableNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num");
        int num = sc.nextInt();

        System.out.println("Enter Range");
        int Range = sc.nextInt();

        int i;

        for(i=1; i<=Range; i++){
            System.out.println(num+"*"+i+"=" +num*i);

        }
    }
}
