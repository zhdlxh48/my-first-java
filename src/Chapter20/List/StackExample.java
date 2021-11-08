package Chapter20.List;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(10);
        stack.push(25);
        stack.push(50);
        stack.push(100);

        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nPop: " + stack.pop());
        System.out.println("Peek: " + stack.peek() + "\n");

        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek() + "\n");

        iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
