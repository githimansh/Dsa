package Strings;

public class Kpm1 {
    class Solution {
        // Function to check if two strings are rotations of each other or not.
        public static boolean areRotations(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            }
            String text = s1 + s1; // should be s1 + s1
            return kmpSearch(text, s2);
        }

        public static boolean kmpSearch(String txt, String pat) {
            int n = txt.length(), m = pat.length();
            int[] lps = computeLps(pat);

            int i = 0, j = 0;

            while (i < n) {
                if (txt.charAt(i) == pat.charAt(j)) {
                    i++;
                    j++;
                    if (j == m) {
                        return true;
                    }
                } else {
                    if (j != 0) {
                        j = lps[j - 1];
                    } else {
                        i++;
                    }
                }
            }
            return false;
        }

        private static int[] computeLps(String pat) {
            int m = pat.length();
            int[] lps = new int[m];
            int len = 0;
            int i = 1; // missing 'int' keyword in your code

            while (i < m) {
                if (pat.charAt(i) == pat.charAt(len)) {
                    len++;
                    lps[i++] = len;
                } else {
                    if (len != 0) {
                        len = lps[len - 1];
                    } else {
                        lps[i++] = 0;
                    }
                }
            }
            return lps;
        }
    }

}
