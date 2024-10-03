package topic_2_linkedlist_string;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        Scanner scanner = new Scanner(System.in);

        // Adding elements to the list
        list.add("Ben & Ben - Langhiyang Pagibig Yan");
        list.add("Ruel - Face To Face");
        list.add("Nessa Barrett - Die First");
        list.add("Jeremy Zucker - Supercuts");
        System.out.println("Current Linked List:");
        System.out.println("------------------------------");
        list.printList();

        //Delete
        list.deleteByValue("Jeremy Zucker - Supercuts");
        System.out.println();
        System.out.println("Deleting |Jeremy Zucker - Supercuts...");
        System.out.println();
        System.out.println("Current Linked List:");
        System.out.println("------------------------------");
        list.printList();

        //Move/Swap Pointer
        System.out.println();
        System.out.println("Moving/Swapping node from index 1 to index 0");
        System.out.println();
        System.out.println("Current Linked List:");
        System.out.println("------------------------------");
        list.moveNodePointer(0, 1);
        list.printList();
    }

}
