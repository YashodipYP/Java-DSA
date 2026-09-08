class linkedddList{
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
        linkedddList.Node newNode = new linkedddList.Node(data);
        newNode.next = head;
        head = newNode;
    }
    void insertatSpecific(int data , int position){

        if(position == 0){
            addFirst(data);
            return;
        }
        Node  newNode = new Node(data);
        Node current =head;
        for(int i = 0;i<position-1;i++){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

    }
}
public class atSpecific {
    public static void main(String[] args) {
        linkedddList ll = new linkedddList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.insertatSpecific(90,2);
        ll.display();
    }
}

