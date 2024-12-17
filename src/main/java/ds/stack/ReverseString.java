package ds.stack;


public class ReverseString {

    public static void main(String[] args) {
        ReverseString rw = new ReverseString();
        System.out.println(rw.reverseString("HelloWorld"));
    }

    public String reverseString(String string) {

        Stack stack = new Stack(string.length());

        for (int x = 0; x < string.length(); x++) {
            char c = string.charAt(x);
            stack.push(c);
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            char c = stack.pop();
            result.append(c);
        }

        return result.toString();
    }
}
