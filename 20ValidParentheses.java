import java.util.*;

public class ValidParentheses {
  public static void main(String[] args) {
    String s = "()";
    System.out.println(isValid(s));
  }

  public static boolean isValid(String s) {
    if (s == null || s.isEmpty())
        return true;

    Map<Character, Character> map = new HashMap<>();
    map.put('(', ')');
    map.put('{', '}');
    map.put('[', ']');

    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {

        if (c == '[' || c == '(' || c == '{')
            stack.push(c);
        else {
            if (stack.isEmpty() || map.get(stack.peek()) != c)
                return false;
            stack.pop();
        }
    }

    return stack.isEmpty();
}

}