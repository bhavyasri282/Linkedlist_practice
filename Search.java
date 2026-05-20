class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Search{
    public static void main(String args[]){
        Node first=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        first.next=second;
        second.next=third;
        Node head=first;
        Node temp=head;
        int key=20;
        boolean x=false;
        while(temp!=null){
            if(temp.data==key){
                x=true;
                break;
            }
            temp=temp.next;
        }
        if(x){
            System.out.println("key found");
        }
        else{
            System.out.println("not found");
        }
    }
}
