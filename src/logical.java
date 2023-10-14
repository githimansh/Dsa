public class logical {
    public static void main(String[] args) {
        int p = 20 , q = 10 , r = 7;
        System.out.println((p>q) && (p<r ));
        System.out.println((p>q) && (p>r));

        System.out.println((p>q) || (p>r));
        System.out.println((p<q) || (p<r));

        System.out.println( !(p>q));
        System.out.println(! (p>r));

    }
}
