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

    //Method to update the one item in the list
    public void updateItem(int index, String newItem) {
        if (index >= 0 && index < items.size()) {
            String oldItem = items.set(index, newItem);
            System.out.println("You updated: " + oldItem + " to " + newItem);
        } else {
            System.out.println("Index out of bounds");
        }
    }

    //Method to find item in the ArrayList
    public int findItem(String finditem) {
        int index = items.indexOf(finditem);
        if (index != -1) {
            System.out.println("Found: " + finditem + " at index " + index);
        } else {
            System.out.println(finditem + " not found.");
        }
        return index;
    }
}
