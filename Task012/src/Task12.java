import java.util.ArrayDeque;
import java.util.Deque;


public class Task12 {
    public static String removeNumeric(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '{' || c == '['
                    || c == '(' || c == '}'
                    || c == ']' || c == ')') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean isValid(String s) {
        Deque<Character> ch = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '(' || c == '{') {
                ch.push(c);
            } else if (ch.isEmpty()) {
                return false;
            } else {
                char first = ch.peekFirst();
                if (first == '{' || first == '['
                        || first == '(' || c == '}'
                        || c == ']' || c == ')'){
                    ch.pop();
                }
            }
        }
        return ch.isEmpty();
    }

    public static void main(String[] args) {
        String str = "[]a+}(1*3)";
        System.out.println(isValid(removeNumeric(str)));
    }
}