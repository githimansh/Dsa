import java.util.Scanner;

public class SumOfStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        float sum = 0;
        while(num != -2){
            sum+= num;
            num = sc.nextFloat();

        }
        System.out.println(sum);
    }
}
