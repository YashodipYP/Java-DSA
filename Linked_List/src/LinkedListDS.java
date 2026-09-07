import java.util.LinkedList;
class Linkedlist{
    Node head;
    Node tail;
    void addAttail(int val){
        Node temp = new Node(val);
        if(tail==null)head = tail = temp;
        else{
        tail.next = temp;
        tail =temp;
    }
    }
    void displayt(){
        if(head == null) return;
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class LinkedListDS {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAttail(10);
        ll.addAttail(120);
        ll.displayt();
    }


}
