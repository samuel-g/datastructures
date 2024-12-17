package ds.stack;

public class Stack {

    char[] stack;
    int top;
    int size;

    public Stack(int size){
        stack = new char[size];
        this.size = size;
        top = -1;
    }

    public void push(char c){
        if(isFull()){
            throw new StackOverflowError("Stack is Full");
        }
        stack[++top] = c;
    }

    public char pop() {
        if(isEmpty()){
            throw new StackOverflowError("Stack is Empty");
        }
        return stack[top--];
    }

    public char peek() {
        if(isEmpty()){
            throw new StackOverflowError("Stack is Empty");
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size - 1;
    }


    public static void main(String[] args) {
        ReverseString rw = new ReverseString();
        System.out.println(rw.reverseString("HelloWorld"));
    }
}
