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

class DoublyCircularLinkedList {
    Node start = null;

    public void create(int data) {
        Node newNode = new Node(data);

        if (start == null) {
            start = newNode;
            start.next = start;
            start.previous = start;
        } else {
            Node currNode = start;
            while (currNode.next != start) {
                currNode = currNode.next;
            }
            newNode.previous = currNode;
            currNode.next = newNode;
            newNode.next = start;
            start.previous = newNode;
        }
    }

    public void insertBegin(int data) {
        Node newNode = new Node(data);

        if (start == null) {
            start = newNode;
            start.next = start;
            start.previous = start;
        } else {
            Node lastNode = start.previous;
            newNode.next = start;
            newNode.previous = lastNode;
            lastNode.next = newNode;
            start.previous = newNode;
            start = newNode;
        }
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (start == null) {
            start = newNode;
            start.next = start;
            start.previous = start;
        } else {
            Node lastNode = start.previous;
            newNode.previous = lastNode;
            lastNode.next = newNode;
            newNode.next = start;
            start.previous = newNode;
        }
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            insertBegin(data);
            return;
        }

        if (start == null) {
            System.out.println("List is empty!!");
            return;
        }

        Node currentNode = start;
        int i = 0;

        while (currentNode.next != start && i < position - 1) {
            currentNode = currentNode.next;
            i++;
        }

        if (i < position - 1) {
            System.out.println("Position out of bounds!");
            return;
        }

        newNode.previous = currentNode;
        newNode.next = currentNode.next;

        if (currentNode.next != start) {
            currentNode.next.previous = newNode;
        } else {
            start.previous = newNode;
        }

        currentNode.next = newNode;
    }

    public void DeleteBegin() {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        if (start.next == start) {
            start = null;
            return;
        }

        start.previous.next = start.next;
        start.next.previous = start.previous;
        start = start.next;
    }

    public void DeleteEnd() {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        if (start.next == start) {
            start = null;
            return;
        }

        Node lastNode = start.previous;
        Node secondLastNode = lastNode.previous;

        secondLastNode.next = start;
        start.previous = secondLastNode;
    }

    public void DeleteAtPosition(int position) {
        if (position == 0) {
            DeleteBegin();
            return;
        }

        if (start == null) {
            System.out.println("List is empty!!");
            return;
        }

        Node currentNode = start;
        int i = 0;

        while (currentNode.next != start && i < position - 1) {
            currentNode = currentNode.next;
            i++;
        }

        if (i < position - 1 || currentNode.next == start) {
            System.out.println("Position out of bounds...");
            return;
        }

        Node nodeToDelete = currentNode.next;
        Node nextNode = nodeToDelete.next;

        currentNode.next = nextNode;
        nextNode.previous = currentNode;

        if (nodeToDelete == start.previous) {
            start.previous = currentNode;
        }
    }

    public void search(int data) {
        int pos = 1;
        Node current = start;
        if (current == null) {
            System.out.println("List is empty");
        } else {
            do {
                if (current.data == data) {
                    System.out.println("The element is at position: " + pos);
                    return;
                }
                current = current.next;
                pos++;
            } while (current != start);
            System.out.println("Element not found");
        }
    }

    public void printValues() {
        if (start == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currentNode = start;
        do {
            System.out.print(currentNode.data + " <-> ");
            currentNode = currentNode.next;
        } while (currentNode != start);
        System.out.println("(circular)");
    }

    public void removeDuplicates() {
        if (start == null) {
            return;
        }

        Node current = start;
        do {
            Node runner = current.next;

            while (runner != start) {
                if (current.data == runner.data) {
                    current.next = runner.next;
                    runner.next.previous = current;

                    if (runner == start.previous) {
                        start.previous = current;
                    }
                    runner = runner.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        } while (current != start);
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

        System.out.println("Creating the list:");
        list.create(1);
        list.create(2);
        list.create(3);
        list.create(3);
        list.create(3);
        list.create(3);
        list.create(4);
        list.create(4);
        list.printValues();
        System.out.println();

        System.out.println("Inserting at the Beginning:");
        list.insertBegin(0);
        list.insertBegin(-1);
        list.printValues();
        System.out.println();

        System.out.println("Inserting at the End:");
        list.insertEnd(5);
        list.insertEnd(6);
        list.printValues();
        System.out.println();

        System.out.println("Inserting at a Specific Position (Position 3):");
        list.insertAtPosition(100, 6);
        list.printValues();
        System.out.println();

        System.out.println("Deleting from the Beginning:");
        list.DeleteBegin();
        list.DeleteBegin();
        list.printValues();
        System.out.println();

        System.out.println("Deleting from the End:");
        list.DeleteEnd();
        list.DeleteEnd();
        list.printValues();
        System.out.println();

        System.out.println("Deleting from a Specific Position (Position 2):");
        list.DeleteAtPosition(2);
        list.printValues();
        System.out.println();

        System.out.println("Removing Duplicates:");
        list.removeDuplicates();
        list.printValues();
        System.out.println();
    }
}
