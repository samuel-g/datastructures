package ds.stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();
        System.out.println(vp.isValid("()")); //true
        System.out.println(vp.isValid("([])")); //true
        System.out.println(vp.isValid("([)]")); //false
        System.out.println(vp.isValid("(([]))")); //true
        System.out.println(vp.isValid("[")); //false
        System.out.println(vp.isValid("")); //false
    }

    public boolean isValid(String string) {
        if (string.isEmpty()) {
            return true;
        }
        Stack stack = new Stack(string.length());
        for (int i = 0; i < string.length(); i++) {
            if ((string.charAt(i) == '(') || (string.charAt(i) == '[')) {
                stack.push(string.charAt(i));
            } else {
                if (isMatchingPair(stack.pop(), string.charAt(i))) {
                    return true;
                }
            }
        }
        return false;

    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']');
    }

}
