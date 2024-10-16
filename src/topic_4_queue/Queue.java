/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_4_queue;

import java.util.LinkedList;

/**
 *
 * @author HP
 */
public class Queue {

    private LinkedList<Customer> customers;

    public Queue() {
        customers = new LinkedList<>();
    }

    public boolean isEmpty() {
        return customers.isEmpty();
    }

    public int size() {
        return customers.size();
    }
}
