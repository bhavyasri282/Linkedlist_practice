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
public class insertion_AtPostion_DLL {
    // Insert at Beginning
    static DNode insertAtBeginning(DNode head, int x) {
        DNode newNode = new DNode(x);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        return newNode;
    }
    // Insert at End
    static DNode insertAtEnd(DNode head, int x) {
        DNode newNode = new DNode(x);
        if (head == null) {
            return newNode;
        }
        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
    // Insert at a Particular Position
    static DNode insertAtPosition(DNode head, int x, int pos) {
        DNode newNode = new DNode(x);
        // If position is 1
        if (pos == 1) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            return newNode;
        }
        DNode temp = head;
        // Move to the node before the required position
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        // Invalid position
        if (temp == null) {
            return head;
        }
        // Connect new node to next node
        newNode.next = temp.next;
        // Connect new node to previous node
        newNode.prev = temp;
        // Connect next node back to new node
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        // Connect previous node to new node
        temp.next = newNode;
        return head;
    }
    // Print Doubly Linked List
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
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head, 40);
        System.out.println("Before insertion:");
        printDLL(head);
        head = insertAtPosition(head, 25, 3);
        System.out.println("After insertion:");
        printDLL(head);
    }
}