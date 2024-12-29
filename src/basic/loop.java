package basic;

import java.util.Scanner;

public class loop {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int age = sc.nextInt();

            if (age <= 12) {
                System.out.print("child");
            } else if (age > 12 && age < 18) {
                System.out.print("teenager");
            } else {
                System.out.print("adult");
            }
        }
    }


