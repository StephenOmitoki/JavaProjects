/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5080161
 */

/*
Hello3-- Demonstrating simple input and arithmetic manipulation of integers
 */
import java.util.Scanner;

public class Part4 {

    public static void main(String args[]) {
        //creates a Scanner object to obtain input from console window
        Scanner input = new Scanner(System.in);

        double price;
        double gst;
        double total;
        double tendered;
        double changedue;
        double sum, product;

        System.out.println("Sales receipt");

        //get input data from the user
        System.out.print("Enter the price of the item: "); //prompt user for an action
        price = input.nextInt();                         //read what the user enters
        gst = price * 0.05;
        total = price + gst;
        //print out what the user entered
        System.out.println();
        System.out.println("   Price : " + price);
        System.out.println("   GST   : " + gst);
        System.out.println("   Total : " + total);
        System.out.println();

        //print out the results of some simple computations
        System.out.print("Enter the amount entered: "); //prompt user for an action
        tendered = input.nextInt();
        System.out.println();
        changedue = tendered - total;

        System.out.println("Change due :    " + changedue);
        System.out.println();
        System.out.println("Thank you and have a nice day!");
    }
}
