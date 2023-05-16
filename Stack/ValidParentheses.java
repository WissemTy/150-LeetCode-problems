import java.util.Stack;

public class ValidParentheses {
    public static boolean isValidParentheses(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "([)]";
        String s2 = "()[]{}";
        String s3 = "{[]}";
        String s4 = "([}}])";
        System.out.println(isValidParentheses(s1));
        System.out.println(isValidParentheses(s2));
        System.out.println(isValidParentheses(s3));
        System.out.println(isValidParentheses(s4));

    }
}