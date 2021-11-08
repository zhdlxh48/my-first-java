package Chapter20.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(4);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(5);

        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
