package Arrays;

public class question7 {

    static void swap(int a, int b){

        System.out.println("Original value before swap");
        System.out.println("a: " +a);
        System.out.println("b: " +b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("values after swap");
        System.out.println("a: " +a);
        System.out.println("b:" +b);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int[] arr = {4, 7, 3, 6, 8};
        swap(a,b);
    }
}
