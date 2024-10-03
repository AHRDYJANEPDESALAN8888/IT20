package topic_2_linkedlist_string;

import java.util.Scanner;

public class linkedlist {

    private node head;
    private final Scanner scanner;

    public linkedlist() {
        scanner = new Scanner(System.in);
    }

    // Method to add a new node at the end of the list
    public void add(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
    }

    // Method to print the linked list
    public void printList() {
        node current = head;
        while (current != null) {
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to delete a node by value
    public void deleteByValue(String value) {
        if (head == null) {
            return;
        }

        if (head.data.equals(value)) {
            head = head.next;
            return;
        }

        node current = head;
        while (current.next != null) {
            if (current.next.data.equals(value)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Method to move a node to a new position /swap nodes
    public void moveNodePointer(int currentIndex, int newIndex) {
        if (head == null || currentIndex == newIndex) {
            return;
        }

        node current = head;
        node prev = null;
        node movingnode = null;
        node movingPrev = null;

        // Find the node to move
        for (int i = 0; current != null && i < currentIndex; i++) {
            movingPrev = prev;
            prev = current;
            current = current.next;
        }
        movingnode = current;

        // If the node to move was not found
        if (movingnode == null) {
            return;
        }

        // Remove the node from its current position
        if (movingPrev != null) {
            movingPrev.next = movingnode.next;
        } else {
            head = movingnode.next; // Moving the head
        }

        // Insert the node at the new position
        current = head;
        prev = null;
        for (int i = 0; current != null && i < newIndex; i++) {
            prev = current;
            current = current.next;
        }

        if (prev != null) {
            movingnode.next = current;
            prev.next = movingnode;
        } else {
            movingnode.next = head;
            head = movingnode;
        }
    }

}
