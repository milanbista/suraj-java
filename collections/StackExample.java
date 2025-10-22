package collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        //stack
        //lifo == last in first out
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(100);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.search(5));
    }
}
