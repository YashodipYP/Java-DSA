class linkedList{
    static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    void add(int data){
        Node  newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }
    void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }
}
public class LinkedListL {
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.display();
    }
}
