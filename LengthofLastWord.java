public class  LengthofLastWord {
  public static void main(String[] args) {
    String s = " ";
    System.out.println(lengthOfLastWord(s));
  }

  public static int lengthOfLastWord(String s) {
    String[] sArr = s.split(" ");
    if (s == null || s.length() < 1 || sArr.length == 0)
      return 0;
    String last = sArr[sArr.length - 1];

    return last.length();
  }


}
