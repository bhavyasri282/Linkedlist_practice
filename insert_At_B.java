class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class insert_At_B{
    static void printll(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    static Node  insertAtBeginning(int x,Node head){
        Node newNode=new Node(x);
        newNode.next=head;
        head=newNode;
        return head;
    }
    public static void main(String args[]){
        Node head=new Node(10);
        head.next=new  Node(20);
        head.next.next=new Node(30);
        System.out.println("Before  insert at beginning");
        printll(head);
        System.out.println("After inserton");
        head=insertAtBeginning(5,head);
        printll(head);
    }
}
