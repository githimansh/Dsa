//import java.util.Scanner;

import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
//        int p = 0;
//        if ( num % 2 ==0){
//          System.out.println("Even");
//        } else{
//            System.out.println("Odd");
//        }
        String ans;
       ans = (num % 2 == 0) ? "even" : "odd";
        System.out.println(ans);
    }
}

