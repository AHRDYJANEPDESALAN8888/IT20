/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_4_queue;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();

        System.out.println("Welcome to Simple Queue Program!");
        System.out.println();

        while (true) {
            System.out.println("Choose an Option to Perform"
                    + "\n1. Add Customer"
                    + "\n2. Serve Customer"
                    + "\n3. Display Queue"
                    + "\n4. Exit");

            System.out.println();

            System.out.print("Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Customer name: ");
                    String name = sc.next();
                    q.enqueue(new Customer(name));
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.displayQueue();
                    break;
                case 4:
                    System.out.println("Thannk You for running this simple program!");
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid input. Please try Again!");
            }

        }
    }

}
