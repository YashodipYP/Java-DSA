
public class QueueOperations {

    int[] queue;
    int front;
    int rear;
    int size;

    // Constructor
    QueueOperations(int size) {
        queue = new int[size];
        front = 0;
        rear = 0;
        this.size = size;
    }

    // Add element at rear
    public void add(int value) {

        if (rear == size) {
            System.out.println("Queue is full");
            return;
        }

        queue[rear] = value;
        rear++;
    }

    // Add element at a specific index
    public void addAtIndex(int index, int value) {

        if (rear == size) {
            System.out.println("Queue is full");
            return;
        }

        if (index < front || index > rear) {
            System.out.println("Invalid index");
            return;
        }

        // Shift elements to the right
        for (int i = rear; i > index; i--) {
            queue[i] = queue[i - 1];
        }

        queue[index] = value;
        rear++;
    }

    // Peek front element
    public int peek() {

        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front];
    }

    // Remove front element
    public int remove() {

        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = queue[front];

        // Shift everything left
        for (int i = front; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }

        rear--;

        return value;
    }

    // Display queue
    public void display() {

        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        QueueOperations q = new QueueOperations(10);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Queue:");
        q.display();

        System.out.println("Peek: " + q.peek());

        System.out.println("Adding 99 at index 2:");
        q.addAtIndex(2, 99);
        q.display();

        System.out.println("Removed: " + q.remove());

        System.out.println("Queue after remove:");
        q.display();

        System.out.println("Peek: " + q.peek());
    }
}

