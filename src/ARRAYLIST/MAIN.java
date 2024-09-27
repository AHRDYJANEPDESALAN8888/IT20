package ARRAYLIST;

import java.util.Scanner;

public class MAIN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ITEM_MANAGER list = new ITEM_MANAGER();
        //Initializing variables
        String item1, item2, item3, newItem, finditem;
        int index;

        //to display items first
        list.displayItems();

        //User input
        System.out.println("Enter 3 items you want to add: ");
        item1 = sc.nextLine();
        item2 = sc.nextLine();
        item3 = sc.nextLine();

        //inputs will be added to the arraylist
        list.addItems(item1, item2, item3);
        System.out.println("-----------------------------");

        //inputs to update one value
        System.out.println("Enter an index number that you want to change: ");
        index = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a new item name that you want to change on that index number: ");
        newItem = sc.nextLine();
        list.updateItem(index, newItem);
        list.displayItems();
        System.out.println("-----------------------------");

    }

}
