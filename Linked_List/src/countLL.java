public class countLL {
    /* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
    class Solution {
        public int getCount(Node head) {
            int count = 0;
            Node current = head;
            while(current!=null){
                count = count + 1;
                current = current.next;
            }
            return count;
        }
    }
}
