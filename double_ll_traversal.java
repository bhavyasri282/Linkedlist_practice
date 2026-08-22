class   DNode{
    int data;
    DNode next;
    DNode prev;
    DNode(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class double_ll_traversal{
    static void forward(DNode head){
        DNode temp=head;
        //move forward
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    static void backward(DNode head){
        DNode temp=head;
        //move to the last node
        while(temp.next!=null){
            temp=temp.next;
        }
        //move backward
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.prev;
        }
    }
    public static void main(String args[]){
        DNode head=new DNode(10);
        DNode second=new DNode(20);
        DNode third=new DNode(30);
        head.next=second;
        second.prev=head;
        second.next=third;
        third.prev=second;
        System.out.println("forward trav:");
        forward(head);
        System.out.println("backward trav:");
        backward(head);
    }
}