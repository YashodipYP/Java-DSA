public class Node {

    // Data part of the node
    int data;

    // Pointer to the next node in the list
    Node next;

    // Constructor to initialize the node with data
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class SinglyLL {
    public static void main(String[] args) {

        // Create the first node (head of the list)
        Node head = new Node(10);

        // Link the second node
        head.next = new Node(20);

        // Link the third node
        head.next.next = new Node(30);

        // Link the fourth node
        head.next.next.next = new Node(40);

        // printing linked list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
