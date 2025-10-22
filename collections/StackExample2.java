package collections;

import java.util.Stack;

public class StackExample2 {

    public static void main(String[] args) {

        //undo
        Stack<String> exalidraw = new Stack<>();
        exalidraw.push("A");
        exalidraw.push("B");
        exalidraw.push("C");

        //undo button
        exalidraw.pop();
        exalidraw.isEmpty();

    }
}
