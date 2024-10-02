package topic_2_linkedlist_int;

public class Linkedlist {

    private Node head;
    //Method to add a new node at the end of list

    public void add(int data) {
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

}
