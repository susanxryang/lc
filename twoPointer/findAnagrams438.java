import java.util.*;

public class findAnagrams438 {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.print(findAnagrams(s, p) + " ");
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        if (p.length() > s.length())
            return res; // Base Condition
        int N = s.length(); // Array1 of s
        int M = p.length(); // Array2 of p
        int[] count = freq(p);

        // run through all letters in s and

        int[] currentCount = freq(s.substring(0, M));

        if (areSame(count, currentCount)) // areSame function
            res.add(0);

        int i;
        for (i = M; i < N; i++) { // going from 3 to 9 in above example
            currentCount[s.charAt(i - M) - 'a']--; // blue pointer, decrement frequency
            currentCount[s.charAt(i) - 'a']++; // red pointer, increment frequency
            if (areSame(count, currentCount)) { // now check, both array are same
                res.add(i - M + 1); // if we find similar add their index in our list
            }
        }
        return res;
    }

    private static boolean areSame(int[] x, int[] y) {
        for (int i = 0; i < 26; i++) {
            if (x[i] != y[i]) // compare all the frequency & doesnn't find any di-similar frequency return
                              // true otherwise false
                return false;
        }

        return true;
    }

    private static int[] freq(String s) {
        int[] count = new int[26]; // create array of size 26
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // update acc. to it's frequency
        }

        return count; // and return count
    }
}
