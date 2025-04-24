package Strings;
import java.util.ArrayList;

public class Kpm {

    class Solution {
        public void constructLps(String pat, int[] lps) {
            int len = 0;
            lps[0] = 0;
            int i = 1;

            while (i < pat.length()) {
                if (pat.charAt(i) == pat.charAt(len)) { // Fixed: chartAt → charAt
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
        }

        public ArrayList<Integer> search(String pat, String txt) {
            ArrayList<Integer> result = new ArrayList<>();
            int n = txt.length();
            int m = pat.length();

            int[] lps = new int[m];
            constructLps(pat, lps);

            int i = 0;
            int j = 0;

            while (i < n) {
                if (txt.charAt(i) == pat.charAt(j)) { // Fixed: chjarAt → charAt
                    i++;
                    j++;

                    if (j == m) {
                        result.add(i - j);
                        j = lps[j - 1];
                    }
                } else {
                    if (j != 0) {
                        j = lps[j - 1];
                    } else {
                        i++;
                    }
                }
            }
            return result;
        }
    }

}
