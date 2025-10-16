
public class Linkedlist{

public static class Node{
    int data;
    Node next;

    Node(int dataa){
        this.data=dataa;
    }
    // public static void printt(Node head){
    //     while(head != null){
    //         System.out.println(head.data);
    //         head=head.next;
    //     }
    // }


    public static void printtrecur(Node head){
        if(head == null){
            return;
        }
        System.out.println(head.data);
        printtrecur(head.next);
        }
    

}
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(5);
        Node d=new Node(6);
        Node e=new Node(8);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(c.next.data);
        // System.out.println(d.next.data);
        // System.out.println(e.data);
        // Node temp=a;
        // while(temp != null){
        //     System.out.println(temp.data);
        //     temp=temp.next;
        //}

       Node.printtrecur(a);
    }
}