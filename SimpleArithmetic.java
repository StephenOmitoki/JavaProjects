/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5080161
 */
import java.util.Scanner;

public class Part2 {

    public static void main(String args[]) {
        //creates a Scanner object to obtain input from console window
        Scanner input = new Scanner(System.in);

        int x; //reserve space for integers
        int y;
        int sum, difference, product, remainder;

        System.out.println("Simple arithmetic");
        System.out.println();

        //get input data from the user
        System.out.print("Enter a number for the variable x: "); //prompt user for an action
        x = input.nextInt();                         //read what the user enters

        System.out.print("Enter a number for the variable y: "); //prompt user for an action
        y = input.nextInt();                         //read what the users enters

        // compute the sum, difference and product
        sum = x + y;
        difference = x - y;
        product = x * y;
        remainder = x / y;

        //print out the results of some simple computations
        System.out.println();
        System.out.println("x + y : " + sum);
        System.out.println("x - y : " + difference);
        System.out.println("x * y : " + product);
        System.out.println("x / y : " + remainder);

    }   // end method main  

}
