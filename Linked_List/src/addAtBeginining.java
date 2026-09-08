class linkeddList{
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
    void addFirst(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }
}
public class addAtBeginining {
    public static void main(String[] args) {
        linkeddList ll = new linkeddList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.addFirst(5);
        ll.display();
    }
}
