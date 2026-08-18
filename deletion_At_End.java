class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class deletion_At_End{
    static Node deletionAtEnd(Node head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    static void printll(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        Node head=new Node(10);
        head.next=new  Node(20);
        head.next.next=new Node(30);
        head=deletionAtEnd(head);
        printll(head);
        
    }
}
