package Topic8_LinkedList;

// import java.util.LinkedList;

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head = null;


    // public void create(int data){

    //     Node newNode = new Node(data);

    //     if(head==null){
    //         head=newNode;
    //     }
    //     else{
    //         Node current =head;
    //         while (head.next!=null) { 
    //             current=current.next;
    //         }
    //         current.next=newNode;
    //     }

    // }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void FirstAdd(int data){

        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;

    }

    public void MiddleAdd(int data, int position) {
        Node newNode = new Node(data);
        Node current = head;
    
      
        if (position == 1 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }

        for (int i = 1; i < position - 1; i++) {
            if (current == null || current.next == null) {
                System.out.println("Position out of bounds");
                return;
            }
            current = current.next;
        }
    

        newNode.next = current.next;
        current.next = newNode;
        
    }
    

    public void deleteNode(int data) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If the node to be deleted is the head
        if (head.data == data) {
            head = head.next;  // Move the head to the next node
            return;
        }

        Node current = head;
        // Traverse the list to find the node before the one to be deleted
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        // If the node to be deleted is found
        if (current.next != null) {
            current.next = current.next.next;  // Skip the node to delete it
        } else {
            System.out.println("Node with data " + data + " not found.");
        }
    }

    public void printValues() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
    }




}

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Adding 3,4,5");
        list.printValues();
        System.out.println();

        System.out.println("Adding 6 at  first position");
        list.FirstAdd(6);
        list.printValues();
        System.out.println();

        System.out.println("Deleting Node value-4");
        list.deleteNode(4);
        list.printValues();
        System.out.println();


        System.out.println("inserting 4  Node at position 2");
        list.MiddleAdd(4, 2);
        list.printValues();
        System.out.println();

    }
}


// javap
// parseInt
