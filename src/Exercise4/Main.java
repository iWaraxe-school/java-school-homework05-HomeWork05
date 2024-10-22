package Exercise4;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Enqueue 5 elements
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");
        queue.add("Element 4");
        queue.add("Element 5");
        System.out.println("Initial queue: " + queue);

        // Dequeue 2 elements
        queue.poll();
        queue.poll();
        System.out.println("Queue after dequeuing 2 elements: " + queue);

        // Enqueue 3 more elements
        queue.add("Element 6");
        queue.add("Element 7");
        queue.add("Element 8");
        System.out.println("Queue after enqueueing 3 more elements: " + queue);
    }
}
