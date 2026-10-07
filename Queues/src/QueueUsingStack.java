
import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    // Constructor
    QueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue
    public void enqueue(int value) {
        stack1.push(value);
    }

    // Dequeue
    public int dequeue() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // Move stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        // Remove front element
        int value = stack2.pop();

        // Move everything back
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return value;
    }

    // Peek
    public int peek() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // Move stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int value = stack2.peek();

        // Move everything back
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return value;
    }

    // Display
    public void display() {

        if (stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println(stack1);
    }

    public static void main(String[] args) {

        QueueUsingStack q = new QueueUsingStack();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Queue:");
        q.display();

        System.out.println("Peek: " + q.peek());

        System.out.println("Removed: " + q.dequeue());

        System.out.println("Queue after dequeue:");
        q.display();

        System.out.println("Removed: " + q.dequeue());

        System.out.println("Queue after dequeue:");
        q.display();
    }
}