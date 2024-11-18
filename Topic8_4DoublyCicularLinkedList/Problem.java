// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;

//     public Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class SinglyLinkedList {
//     Node head;

//     public SinglyLinkedList() {
//         this.head = null;
//     }

//     public void insert(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//         } else {
//             Node temp = head;
//             while (temp.next != null) {
//                 temp = temp.next;
//             }
//             temp.next = newNode;
//         }
//     }

    

//     public void printList() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data);
//             if (temp.next != null) System.out.print(" -> ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
    
//         public Node findMiddle() {
           
//             Node slow =head;
//             Node fast=head;

//             while (fast!=null && fast.next!=null) {
//                 slow=slow.next;
//                 fast=fast.next.next;
//             }

//             return slow;
//         }

        

//         public void reverse() {
//             Node prev = null;
//             Node current = head;
//             Node next = null;
        
//             while (current != null) {

//             //storing next al;ue...
//               next=current.next;
              

//               //reversing the pointer
//               current.next=prev;

//               //increasing the prev && current..
//               prev=current;
//               current=next;
            

//             }
        
//             head = prev;
//         }
        
//     }
    
//     class Problem {
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             String str = sc.nextLine();
//             String[] values = str.split("->");
    
//             SinglyLinkedList list = new SinglyLinkedList();
    
//             for (String value : values) {
//                 list.insert(Integer.parseInt(value));
//             }
    
//             Node middle = list.findMiddle();
//         if (middle != null) {
//             System.out.println("Middle node: " + middle.data);
//         } else {
//             System.out.println("The list is empty.");
//         }


//         System.out.println("Reversing the list...");
//         list.reverse();
//         list.printList();
//     }
// }
