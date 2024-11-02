import java.util.LinkedList;
import java.util.Queue;

public class InbulitClass {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println("Queue after enqueues: " + queue);

        System.out.println("Peek: " + queue.peek());

        queue.poll();
        queue.poll();
        System.out.println("Queue after dequeues: " + queue);

        System.out.println("Is the queue empty? " + queue.isEmpty());

        queue.offer(50);
        queue.offer(60);
        System.out.println("Queue after adding more elements: " + queue);

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.poll());
        }

        System.out.println("Queue after emptying: " + queue);
    }
}
