

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class SingleCircularLinkedList{

    Node start=null;

    public void create(int data){
        
        Node newNode =new Node(data);

        if(start==null){
            start=newNode;
            start.next=newNode;
        }
        else{
            Node currNode=start;
            while(currNode.next!=start){
                currNode=currNode.next;
            }
            currNode.next=newNode;
            newNode.next=start;
        }
    }

    public void InsertBegin(int data){

        Node newNode=new Node(data);

        if(start==null){
            start = newNode;
            newNode.next = start;
        }
        else{
            Node curNode=start;
            while(curNode.next!=start){
                curNode=curNode.next;
            }
            newNode.next=start;
            curNode.next=newNode;
            start=newNode;

            
        }
    }


    public void InsertEnd(int data){

        Node newNode=new Node(data);

        if(start==null){
            start = newNode;
            newNode.next = start;
        }
        else{
            Node curNode=start;
            while(curNode.next!=start){
                curNode=curNode.next;
            }
            curNode.next=newNode;
            newNode.next=start;
            
        }
    }


    public void InsertAtMiddle(int data,int position){

        Node newNode=new Node(data);
        
        if(start==null){
            System.out.println("list is empty....");
            return;
        }

        if(position==0){
            InsertBegin(data);
            return;
        }
       
        Node curNode = start;
        int count = 1; 
        while (count < position && curNode.next != start) {
            curNode = curNode.next;
            count++;
        }

        if (count < position && curNode.next == start) {
            System.out.println(" out of bounds....1.");
            return;
        }

        newNode.next = curNode.next;
        curNode.next = newNode;
    }



    public void DeleteStart(){

        if(start==null){
            System.out.println("List is empty..");
        }
        else{
            Node currentNode=start;
            while(currentNode.next!=start){
                currentNode=currentNode.next;
            }
            start=start.next;
            currentNode.next=start;
        
        }
    }


    public void DeleteEnd() {
        if (start == null) {
            System.out.println("List is empty.");
        } else if (start.next == start) {
            start = null;
        } else {
            Node currentNode = start;
            while (currentNode.next.next != start) {
                currentNode = currentNode.next;
            }
            currentNode.next = start;
        }
    }


    public void DeleteAtMiddle(int position) {

        if (start == null) {
            System.out.println("List is empty.");
            return;
        } 

        if (position==1) {
            DeleteStart();
            return;
        } 

        Node currNode=start;
        int count=0;

        for(int i=0;i<position-1;i++){
            if(currNode.next==null){
                System.out.println("position out of range....");
            }
            currNode=currNode.next;
        }

        currNode.next=currNode.next.next;

    }


    public int count() {
        if (start == null) {
            return 0;
        } else {
            int count = 1;
            Node currentNode = start;
            while (currentNode.next != start) {
                currentNode = currentNode.next;
                count++;
            }
            return count;
        }
    }



    public void SearchData(int data) {

        if (start == null) {
            System.out.println("List is empty.....");
            return;
        }
    
        Node currNode = start;
    
        do {
            if (currNode.data == data) {
                System.out.println( data + " found.");
                return;
            }
            currNode = currNode.next;
        } while (currNode != start);
    
        System.out.println( data + " not found.");
    }


    public void printValues(){
        if(start==null){
            System.out.println("List is empty");          
        }
        else{
            Node curNode=start;
            do{
                System.out.print(curNode.data+" -> ");
                curNode=curNode.next;
            }
            while(curNode.next!=start);
            System.out.print(curNode.data);
        }
    }

}

public class Main {

    public static void main(String[] args) {
        
        SingleCircularLinkedList circularLinkedList=new SingleCircularLinkedList();

        circularLinkedList.create(1);
        circularLinkedList.create(2);
        circularLinkedList.create(3);
        circularLinkedList.create(4);
        circularLinkedList.printValues();
        System.out.println();

        circularLinkedList.InsertBegin(0);
        circularLinkedList.InsertBegin(0);
        circularLinkedList.printValues();
        System.out.println();

        circularLinkedList.InsertEnd(5);
        circularLinkedList.InsertEnd(6);
        circularLinkedList.printValues();
        System.out.println();

        circularLinkedList.InsertAtMiddle(100, 5);
        circularLinkedList.InsertAtMiddle(100, 5);
        circularLinkedList.printValues();
        System.out.println();

        circularLinkedList.DeleteStart();
        circularLinkedList.DeleteStart();
        circularLinkedList.printValues();
        System.out.println();


        circularLinkedList.DeleteEnd();
        circularLinkedList.DeleteEnd();
        circularLinkedList.printValues();
        System.out.println();


        circularLinkedList.DeleteAtMiddle(3);
        circularLinkedList.DeleteAtMiddle(3);
        circularLinkedList.printValues();
        System.out.println();


        System.out.print("count:");
        System.out.println(circularLinkedList.count());


        circularLinkedList.SearchData(1);
        circularLinkedList.SearchData(2);   
    }
}
