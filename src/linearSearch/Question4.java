package linearSearch;

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        String name = "Himanshu";
        char target = 's';
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search1(String str, char target) {
        if(str.length() == 0){
            return false;
        }
        for ( char ch: str.toCharArray()) {
            if(ch == target) {
                return true;
            }
        }
        return false;
    }
}
