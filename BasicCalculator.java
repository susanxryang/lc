public class BasicCalculator {
  public static void main(String[] args) {
    String s = "3+2*2";
    System.out.println(calculate(s));
  }

  public static int calculate(String s) {
    int len = s.length();
    Stack<Integer> stack = new Stack();
    int res = 0;
    int num = 0;
    char sign = '+';

    for (int i = 0; i < len; i++) {
      if (Character.isDigit(s.charAt(i))) {
        num = s.charAt(i) - '0';
        while (i + 1 < len && Character.isDigit(s.charAt(i + 1))) {
          num = 10 * num + (s.charAt(i + 1) - '0');
          i++;
        }
      }

      if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == len - 1) {
        if (sign == '+') {
          stack.push(num);
        }
        if (sign == '-') {
          stack.push(-num);
        }
        if (sign == '*') {
          stack.push(stack.pop() * num);
        }
        if (sign == '/') {
          stack.push(stack.pop() / num);
        }
        sign = s.charAt(i);
        num = 0;
      }
    }

    for (int i : stack) {
      res += i;
    }

    return res;
  }

}