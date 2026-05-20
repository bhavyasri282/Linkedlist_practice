class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Main{
    public static void main(String args[]){
        Node first=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        int count=0;
        first.next=second;
        second.next=third;
        Node head=first;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("The count of elements in linkedlist is: "+count);
    }
}
