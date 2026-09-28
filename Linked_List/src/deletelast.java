public class deletelast {

    class linkedddddList {

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head;

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

        void display() {
            Node current = head;

            while (current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }

            System.out.print("null");
        }

        public void deleteFirst() {

            if (head == null) {
                return;
            }

            head = head.next;
        }
        public void deleteLast() {

            if (head == null) {
                return;
            }

            if (head.next == null) {
                head = null;
                return;
            }

            Node current = head;

            while (current.next.next != null) {
                current = current.next;
            }

            current.next = null;
        }
    }

    public static void main(String[] args) {
        deletelast obj = new deletelast();
        linkedddddList ll = obj.new linkedddddList();


        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        ll.display();

        System.out.println();

        ll.deleteFirst();
        ll.deleteLast();

        ll.display();
    }
}