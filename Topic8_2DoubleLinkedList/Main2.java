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

    public void InsertBegin(int data) {
        Node newNode = new Node(data);

        if (start == null) {
            start = newNode;
        } else {
            start.previous = newNode;
            newNode.next = start;
            start = newNode;
        }
    }

    public void InsertEnd(int data) {
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

    public void InsertMiddle(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position...");
            return;
        }
        
        Node newNode = new Node(data);
        if (position == 0) {
            InsertBegin(data);
            return;
        }

        Node current = start;
        for (int i = 1; i < position; i++) {
            if (current == null || current.next == null) {
                System.out.println("Position out of range...");
                return;
            }
            current = current.next;
        }

        newNode.previous = current;
        newNode.next = current.next;

        if (current.next != null) {
            current.next.previous = newNode;
        }
        current.next = newNode;
    }

    public void DeleteBegin() {
        if (start == null) {
            System.out.println("List is empty...");
        } else if (start.next == null) {
            start = null;
        } else {
            start = start.next;
            start.previous = null;
        }
    }

    public void DeleteLast() {
        if (start == null) {
            System.out.println("List is empty...");
        } else if (start.next == null) {
            start = null;
        } else {
            Node current = start;
            while (current.next != null) {
                current = current.next;
            }
            current.previous.next = null;
        }
    }

    public void deleteAtPosition(int position) {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 0) {
            DeleteBegin();
            return;
        }

        Node current = start;
        for (int i = 0; i < position; i++) {
            if (current.next == null) {
                System.out.println("Position out of bounds...");
                return;
            }
            current = current.next;
        }

        current.previous.next = current.next;
        if (current.next != null) {
            current.next.previous = current.previous;
        }
    }

    public void printValues() {
        Node current = start;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" <-> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}

public class Main2 {

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        System.out.println("Creating initial list with values 1, 2, and 3:");
        doubleLinkedList.create(1);
        doubleLinkedList.create(2);
        doubleLinkedList.create(3);
        doubleLinkedList.printValues();

        System.out.println("\nInserting 4 and 5 at the beginning:");
        doubleLinkedList.InsertBegin(4);
        doubleLinkedList.InsertBegin(5);
        doubleLinkedList.printValues();

        System.out.println("\nInserting 10 at position 2 and 20 at position 3:");
        doubleLinkedList.InsertMiddle(10, 2);
        doubleLinkedList.InsertMiddle(20, 3);
        doubleLinkedList.printValues();

        System.out.println("\nInserting 4 and 5 at the end:");
        doubleLinkedList.InsertEnd(4);
        doubleLinkedList.InsertEnd(5);
        doubleLinkedList.printValues();

        System.out.println("\nDeleting two elements from the beginning:");
        doubleLinkedList.DeleteBegin();
        doubleLinkedList.DeleteBegin();
        doubleLinkedList.printValues();

        System.out.println("\nDeleting two elements from the end:");
        doubleLinkedList.DeleteLast();
        doubleLinkedList.DeleteLast();
        doubleLinkedList.printValues();

        System.out.println("\nDeleting elements at position 2 twice:");
        doubleLinkedList.deleteAtPosition(2);
        doubleLinkedList.deleteAtPosition(2);
        doubleLinkedList.printValues();
    }
}
