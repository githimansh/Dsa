import java.util.Scanner;

public class MultipleOf5And7 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
        int num = 1;

        while(true){
            if((num % 5 ==0) && (num % 7 == 0)){
                System.out.println("ans" + num);
                break;
            }
            num++;
        }
    }
}
