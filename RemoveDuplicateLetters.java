public class RemoveDuplicateLetters {
  public static void main(String[] args) {
    String s = "bcabc";
    System.out.println(removeDeplicateLetters(s));
  }

  public static String removeDeplicateLetters(String s){
    StringBuilder sb = new StringBuilder();
    int[] count = new int[26];
    boolean[] used = new boolean[26];

    char[] chs = s.toCharArray();
    for (char c : chs) { // count each character appear times
      count[c - 'a']++;
    }

    for (char c : chs) {
      count[c - 'a']--; // use the current character
      if (used[c - 'a']) { // if already used
        continue;
      }
      // the last one added is greter than current char and there are more of this character left
      // then delete and replace the one added
      while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c && count[sb.charAt(sb.length() - 1) - 'a'] > 0) {
        // delete and mark as unused
        used[sb.charAt(sb.length() - 1) - 'a'] = false;
        sb.deleteCharAt(sb.length() - 1);
      }
      sb.append(c);
      used[c - 'a'] = true;
    }
    return sb.toString();
  }

}
