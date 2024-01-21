import java.util.*;

public class longestStrChain1048 {
    // first sort the array by increasing length
    // take the longest string, remove each letter,
    // then see if there is a match with the resulting string

    public int longestStrChain(String[] words) {
        Map<String, Integer> dp = new HashMap<>();
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        int res = 0;
        for (String word : words) {
            int best = 0;
            for (int i = 0; i < word.length(); ++i) {
                String prev = word.substring(0, i) + word.substring(i + 1); // remove each letter of the word
                best = Math.max(best, dp.getOrDefault(prev, 0) + 1); 
                
                // get prev value + 1, if no prev found, get 1
            }
            dp.put(word, best);
            res = Math.max(res, best);
        }
        return res;
    }

}
