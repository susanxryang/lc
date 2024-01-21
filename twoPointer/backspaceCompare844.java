import java.util.Stack;

public class backspaceCompare844 {
    public static void main(String[] args) {
        String s = "ab##", t = "c#d#";
        // System.out.printlin(backspaceCompare(s, t));
        System.out.println(makeStack("y#f#o##f"));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = makeStack(s);
        Stack<Character> tStack = makeStack(t);
        if (sStack.size() != tStack.size()) {
            return false;
        }
        while (sStack.empty() == false) {
            // If the top elements of both stacks
            // are same
            if (sStack.peek() == tStack.peek()) {
                // Pop top of both stacks
                sStack.pop();
                tStack.pop();
            } else {
                // Otherwise, set flag to false
                return false;
            }
        }
        return true;
    }

    public static Stack<Character> makeStack(String s) {
        Stack<Character> sStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            if (s.charAt(i) == '#') {
                if (!sStack.empty()) {
                    sStack.pop();
                }
            } else {
                sStack.push(s.charAt(i));
            }
        }
        return sStack;
    }
}
