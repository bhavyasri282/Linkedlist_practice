class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class delete_atbeginning{
    static Node deleteAtbeginning(Node head){
        if(head==null){
            return null;
        }
        head=head.next;
        return head;
    }
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
    static Node insertAtpos(int x,Node head,int pos){
        Node newNode=new Node(x);
        if(pos==1){
            newNode.next=head;
            return newNode;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }
    static Node insertAtEnd(int x,Node head){
        Node newNode=new Node(x);
        if(head==null){
            return newNode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
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
        System.out.println("After insert at end");
        head=insertAtEnd(40,head);
        printll(head);
        System.out.println("After insert at position");
        head=insertAtpos(25,head,3);
        printll(head);
        System.out.println("After deletion at the beginning");
        head=deleteAtbeginning(head);
        printll(head);
    }
}
