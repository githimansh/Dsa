package Arrays;

public class question6 {

 static void swap(int a, int b){
     System.out.println("Original values before swap");
     System.out.println("a: " +a);
     System.out.println("b: " +b);

     int temp = a;
     a = b;
     b = temp;

     System.out.println("values after swap");
     System.out.println("a: " +a);
     System.out.println("b: " +b);
 }

    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        int[] arr = {2, 4, 5, 8, 9};
        swap(a, b);
    }
}
