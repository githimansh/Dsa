package Strings;

public class minChar {
    // User function Template for Java

    class Solution {
        public static int minChar(String s) {
            String reverse = new StringBuilder(s).reverse().toString(); // fixed typo 'toStirng'
            String concat = s + "$" + reverse; // fixed typo 'contact' to 'concat'
            int[] lps = computeLps(concat); // use correct variable 'concat'
            return s.length() - lps[concat.length() - 1];
        }

        private static int[] computeLps(String concat) {
            int n = concat.length();
            int[] lps = new int[n];
            int len = 0;
            int i = 1;

            while (i < n) {
                if (concat.charAt(i) == concat.charAt(len)) {
                    len++;
                    lps[i] = len;
                    i++;
                } else {
                    if (len != 0) {
                        len = lps[len - 1];
                    } else {
                        lps[i] = 0;
                        i++;
                    }
                }
            }
            return lps;
        }
    }

}
