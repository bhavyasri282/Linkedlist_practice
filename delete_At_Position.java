class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class delete_At_Position{
    static Node deletionAtpos(Node head,int pos){
        if(head==null){
            return null;
        }
        if(pos==1){
            return head.next;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
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
        head=deletionAtpos(head,2);
        printll(head);
        
    }
}
