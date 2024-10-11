package topic_2_linkedlist_int;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 elements:");
        int e = sc.nextInt();
        int e2 = sc.nextInt();
        int e3 = sc.nextInt();
        //adding elements to the list
        list.add(e);
        list.add(e2);
        list.add(e3);
        System.out.println("Current Linked List:");
        list.printList();

        //Delete
        System.out.println();
        System.out.println("Enter a value to delete:");
        int del = sc.nextInt();
        list.deleteByValue(del);
        System.out.println("Current Linked List:");
        list.printList();

        //Move/Swap Pointer
        System.out.println();
        System.out.println("Movingn/Swapping node from index 1 to index 0");
        System.out.println("Enter first index to move:");
        int i = sc.nextInt();
        System.out.println("Enter second index to move:");
        int i2 = sc.nextInt();
        list.moveNodePointer(i, i2);
        list.printList();
        
        System.out.println("Thank you !");
    }
}
