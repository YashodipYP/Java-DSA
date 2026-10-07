
public class QueueLinkedList {

    // Node
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    // Constructor
    QueueLinkedList() {
        front = null;
        rear = null;
    }

    // Enqueue - Add element at rear
    public void enqueue(int value) {

        Node newNode = new Node(value);

        // Queue is empty
        if (front == null) {
            front = newNode;
            rear = newNode;
            return;
        }

        // Add at rear
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue - Remove element from front
    public int dequeue() {

        // Queue is empty
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = front.data;

        // Move front to next node
        front = front.next;

        // If queue becomes empty
        if (front == null) {
            rear = null;
        }

        return value;
    }

    // Peek - See front element
    public int peek() {

        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        return front.data;
    }

    // Display queue
    public void display() {

        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node current = front;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // Main
    public static void main(String[] args) {

        QueueLinkedList q = new QueueLinkedList();

        // Enqueue
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Queue:");
        q.display();

        // Peek
        System.out.println("Peek: " + q.peek());

        // Dequeue
        System.out.println("Removed: " + q.dequeue());

        System.out.println("Queue after dequeue:");
        q.display();

        // Peek again
        System.out.println("Peek: " + q.peek());
    }
}


