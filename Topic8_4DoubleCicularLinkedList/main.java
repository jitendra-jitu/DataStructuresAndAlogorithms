class Node{
    int data;
    Node previous;
    Node next;

    public Node(int data){
        this.data=data;
        this.previous=null;
        this.next=null;
    }
}

class DoublyCircularLinkedList{

    Node start=null;

    public void create(int data){

        Node newNode=new Node(data);

        if(start==null){
            start=newNode;
            start.next=start;
            start.previous=start;
        }
        else{
            Node currNode=start;
            
            while (currNode.next!=start) {
                currNode=currNode.next;
            }
            newNode.previous=currNode;
            currNode.next=newNode;
            newNode.next=start;
            start.previous=newNode;
        }
    }


    public void printValues() {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        Node cuNode = start;
        do {
            System.out.print(" <- "+cuNode.data + " -> ");
            cuNode = cuNode.next;
        } while (cuNode != start);
        System.out.println();
    }

}


class main{
    public static void main(String[] args) {


        DoublyCircularLinkedList doublyCircularLinkedList=new DoublyCircularLinkedList();

        doublyCircularLinkedList.create(1);
        doublyCircularLinkedList.create(2);
        doublyCircularLinkedList.create(3);
        doublyCircularLinkedList.create(4);

        doublyCircularLinkedList.printValues();
        
    }
}