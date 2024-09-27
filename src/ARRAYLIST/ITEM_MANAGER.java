package ARRAYLIST;

import java.util.ArrayList;

public class ITEM_MANAGER {

    private ArrayList<String> items;

    //Constructor to initialize the ArrayList
    public ITEM_MANAGER() {
        items = new ArrayList<>();
    }

    //Method to display items
    public void displayItems() {
        System.out.println("Items in the list: " + items);
    }

    //Method to add user's input to arraylist
    public void addItems(String item1, String item2, String item3) {
        items.add(item1);
        items.add(item2);
        items.add(item3);
        System.out.println("You Added: " + items);
    }
}
