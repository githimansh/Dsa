import java.util.Scanner;
public class Loop {
    public static new void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1; i<=3; i++){
            for( int j=1; j<=3; j++){
                System.out.println(+j);
            }
        }
    }
}
