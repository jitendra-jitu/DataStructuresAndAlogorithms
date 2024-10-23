package LinkedList.AddingValues;

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

}

class LinkedList {

    static Node head = null;

    public static void add(int data) {

        Node newNode = new Node(data);

        Node current = head;

        if (head == null) {
            head = newNode;
        } 
        else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

    }

    public void printvalues() {

        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;

        }
    }

}

public class Main {
    public static void main(String[] args) {

        CollectionImplementation list = new CollectionImplementation();
        list.add(3);
        list.add(4);
        list.add(5);

        list.printvalues();

    }
}