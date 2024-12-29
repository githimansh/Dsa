public class solution {

    public static boolean isRotatedByTwo(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // Check if str2 is a rotated version of str1 by 2 places in either direction
        return (str1.substring(2) + str1.substring(0, 2)).equals(str2) ||
                (str1.substring(str1.length() - 2) + str1.substring(0, str1.length() - 2)).equals(str2);
    }

    public static void main(String[] args) {
        String str1 = "SampleString";
        String str2 = "mpleStringSa";

        if (isRotatedByTwo(str1, str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");}
 }
}
