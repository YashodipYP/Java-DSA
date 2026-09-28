public class llSearch {

    class LinkedListlll {

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head;

        // Add node
        void add(int data) {

            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        // Display list
        void display() {

            Node current = head;

            while (current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }

            System.out.println("null");
        }

        // Search
        boolean search(int value) {

            Node current = head;

            while (current != null) {

                if (current.data == value) {
                    return true;
                }

                current = current.next;
            }

            return false;
        }
    }

    public static void main(String[] args) {

        llSearch obj = new llSearch();

        LinkedListlll ll = obj.new LinkedListlll();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        ll.display();

        System.out.println(ll.search(30));
        System.out.println(ll.search(50));
    }
}