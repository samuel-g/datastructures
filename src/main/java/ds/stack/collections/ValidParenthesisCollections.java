package ds.stack.collections;

import java.util.Stack;

/*
Use Stack class from collections framework
 */
public class ValidParenthesisCollections {

    public static void main(String[] args) {
        ValidParenthesisCollections vp = new ValidParenthesisCollections();
        String[] testCases = {
                "()", // true
                "([])", // true
                "([)]", // false
                "(([]))", // true
                "[", // false
                "" , // true
                "()[]{}"
        };

        // Automated validation
        for (String testCase : testCases) {
            boolean result = vp.isValid(testCase);
            System.out.printf("Input: %s -> Result: %s%n", testCase, result);
        }
    }

    public boolean isValid(String string) {
        if (string.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }

}
