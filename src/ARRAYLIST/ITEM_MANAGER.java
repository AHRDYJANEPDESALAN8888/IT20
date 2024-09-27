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
}
