package Chapter20.Queue;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class DequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();

        deque.add(4);
        deque.add(1);
        deque.add(3);
        System.out.println(deque);

        deque.addFirst(2);
        System.out.println(deque);

        deque.addLast(5);
        System.out.println(deque);

        System.out.println(deque.peek());
        System.out.println(deque);

        System.out.println(deque.poll());
        System.out.println(deque);

        System.out.println(deque.remove());
        System.out.println(deque);
    }
}
