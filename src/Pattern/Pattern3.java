package Pattern;

public class Pattern3 {
    public static void main(String[] args) {
      pattern3(6);
    }
    static void pattern3(int n){
        for(int row = 1; row <=n; row++){
            for(int col = n; col >= row; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
