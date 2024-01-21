public class ReverseString {
  public static void main(String[] args) {
    char[] s = new char[] { "h","e","l","l","o" };
    reverseString(arr);
    // System.out.println(arr);
  }

  public static void reverseString(char[] s) {
    // int find_zero = 0;
    int front = 0;
    int back = s.length - 1;
    while(front < back){
      // continue 
      char temp = s[front];
      s[front] = s[back];
      s[back] = temp;
      front ++;
      back --;
    }
  }
}