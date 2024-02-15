import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int x, s=0, r, c;
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        c = x;
        while(x>0)
        {
            r = x % 10;
            s = (s*10) + r;
            x = x/10;
        }
        if(c == s){
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not Palindrome Number");
        }
    }
}
