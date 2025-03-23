package Pattern;

public class Pattern6 {
    public static void main(String[] args) {
  pattern6(5);
    }
    static void pattern6(int n){
        for(int row = 1; row <= n; row++){
            int noOfSpaces = n - row;
            for(int s = 1; s <= noOfSpaces; s++ ){
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
