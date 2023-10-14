import java.util.Scanner;
public class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans =0;
        int a =n;
        while(n>0){
            ans = ans*10 + n%10;
            n/=10;
        }
        System.out.println("reverse of the digit is " +ans);

    }
}
