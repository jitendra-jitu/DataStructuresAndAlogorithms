// package Topic8_2DoubleLinkedList;

class Node {
    int data;
    Node previous;
    Node next;

    public Node(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}

class DoubleLinkedList {
    Node start = null;

    public void create(int data) {
        Node newNode = new Node(data);
        if (start == null) {
            start = newNode;
        } else {
            Node current = start;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.previous = current;
        }
    }

    public void deleteNode(int value) {
        Node current = start;
        while (current != null && current.data != value) {
            current = current.next;
        }
        if (current != null) {
            if (current == start) {
                start = current.next;
                if (start != null) {
                    start.previous = null;
                }
            } else {
                if (current.previous != null) {
                    current.previous.next = current.next;
                }
                if (current.next != null) {
                    current.next.previous = current.previous;
                }
            }
        }
    }

    public void printValues() {
        Node current = start;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class ProblemStatement {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        int[] values = {10, 20, 30, 40, 50};
        int deleteValue = 30;

        for (int value : values) {
            doubleLinkedList.create(value);
        }

        doubleLinkedList.deleteNode(deleteValue);
        doubleLinkedList.printValues();
    }
}
