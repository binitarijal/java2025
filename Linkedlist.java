public class Linkedlist {
class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

Node head = null;

 void insertAtBeginning(int val) {
    Node newNode = new Node(val);
    newNode.next = head;
    head = newNode;
}
public static void main(String[] args) {
    Linkedlist list = new Linkedlist();
    list.insertAtBeginning(10);
    list.insertAtBeginning(20);
    list.insertAtBeginning(30);

    Node current = list.head;
    while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("null");
}
}