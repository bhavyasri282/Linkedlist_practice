class DNode {
    int data;
    DNode prev;
    DNode next;
    DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class insertion_at_end_DLL {
    static DNode insertAtBeginning(DNode head, int x) {
        DNode newNode = new DNode(x);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        return newNode;
    }
    static DNode insertAtEnd(DNode head, int x) {
        DNode newnode=new DNode(x);
        if(head==null){
            return newnode;
        }
        DNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
        return head;
    }
    static void printDLL(DNode head) {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DNode head = null;
        head = insertAtBeginning(head, 10);
        head = insertAtBeginning(head, 20);
        head = insertAtBeginning(head, 30);
        System.out.println("After insertion at beginning:");
        printDLL(head);
        head = insertAtEnd(head, 40);
        System.out.println("After insertion at end:");
        printDLL(head);
    }
}