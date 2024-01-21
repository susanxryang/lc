public class LongestPalindromicSubstring {
  public static void main(String[] args) {
    String s = "bb";
    System.out.println(longestPalindrome(s));
  }

  // public static String longestPalindrome(String s) {
  // if (s == null || s.length() == 0) {
  // return "";
  // }
  // int start = 0;
  // int length = 1; /// to be updated later
  // int n = s.length();

  // boolean[][] isPalindrome = new boolean[n][n];
  // for (int i = 0; i < n - 1; i++) {
  // isPalindrome[i][i] = true;
  // }
  // for (int i = 0; i < n - 1; i++) {
  // System.out.println(s.charAt(i));
  // System.out.println(s.charAt(i + 1));

  // if (s.charAt(i) == s.charAt(i + 1)) {
  // isPalindrome[i][i + 1] = true;
  // start = i;
  // length = 2;
  // }
  // }

  // for (int i = 3; i <= n; i++) { // length of current substring
  // for (int j = 0; j + i - 1 < n; j++) { // start
  // if(s.charAt(j) == s.charAt(j + i - 1) && isPalindrome[j+1][j + i - 2]){
  // isPalindrome[j][j + i - 1] = true;
  // start = j;
  // length = i;
  // }
  // }
  // }
  // return s.substring(start, start + length);
  // }

  public static String longestPalindrome(String s) {
    if (s == null || s.length() < 1)
      return "";
    int start = 0, end = 0;
    for (int i = 0; i < s.length(); i++) {
      int len1 = expandAroundCenter(s, i, i); // racecar
      int len2 = expandAroundCenter(s, i, i + 1); // aabbaa
      int len = Math.max(len1, len2);
      System.out.println(len);
      if (len > end - start) { // setting new max
        start = i - (len - 1) / 2; // current index - 
        end = i + len / 2;
      }
    }
    return s.substring(start, end + 1);
  }

  private static int expandAroundCenter(String s, int left, int right) {
    int L = left, R = right;
    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) { // chracters keep being the same, keep expanding
      L--;
      R++;
    }
    // higher - lower
    System.out.println("right:" + R);
    System.out.println("left:" + L);
    return R - L - 1; // aabbaa -> 6, racecar -> 7, bb -> 2
  }

}
