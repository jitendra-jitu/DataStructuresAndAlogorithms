package Topic10_Queue;

class Queue {
    private int rear;
    private int front;
    private int size;
    private final int capacity;
    private final int[] queue;

    public Queue() {
        rear = -1;
        front = 0;
        size = 0;
        capacity = 4;
        queue = new int[capacity];
    }

    public String enqueue(int data) {
        if (isFull()) {
            return "Queue Overflow: Cannot enqueue " + data;
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = data;
            size++;
            return "Enqueued: " + data;
        }
    }

    public String dequeue() {
        if (isEmpty()) {
            return "Queue Underflow: Cannot dequeue";
        } else {
            int data = queue[front];
            front = (front + 1) % capacity;
            size--;
            return "Dequeued: " + data;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.. cannot access peek value");
            return -1;
        } else {
            return queue[rear];
        }
    }

    public void printValues() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println(queue.dequeue());

        System.out.println(queue.enqueue(10));
        System.out.println(queue.enqueue(20));
        System.out.println(queue.enqueue(30));
        System.out.println(queue.enqueue(40));
        queue.printValues();

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.printValues();

        System.out.println(queue.enqueue(50));
        System.out.println(queue.enqueue(60));
        queue.printValues();

        System.out.println(queue.enqueue(70));
        queue.printValues();
    }
}
