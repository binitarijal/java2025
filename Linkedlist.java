public class Linkedlist {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        
        }
    }
public static void main(String[] args) {
    Node a=    new Node(10);
    Node b=    new Node(20);
    Node c=    new Node(30);
    Node d=    new Node(40);

    a.next=b;
    b.next=c;
    c.next=d;
    d.next=null;
    System.out.println(a.data);
    System.out.println(b.data);
    System.out.println(c.data);
    System.out.println(d.data);

}
}