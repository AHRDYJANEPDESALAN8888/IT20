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
    // Method to print the linked list

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
// Method to delete a node by value

    public void deleteByValue(int value) {
        if (head == null) {
            return;
        }

        // If the head needs to be removed
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

}
