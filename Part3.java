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
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 5080161
 */
import java.util.Scanner;

public class Part3 {

    public static void main(String args[]) {
        //creates a Scanner object to obtain input from console window
        Scanner input = new Scanner(System.in);

        int x;
        int product1, product2, product3, product4;

        System.out.println("Multiplication Table");
        System.out.println();

        //get input data from the user
        System.out.print("Enter a number less than 10: "); //prompt user for an action
        x = input.nextInt();                         //read what the user enters

        System.out.println();
        System.out.println("   1 2 3 4");
        product1 = x * 1;
        product2 = x * 2;
        product3 = x * 3;
        product4 = x * 4;

        //print out the results of some simple computations
        System.out.println("3  " + product1 + " " + product2 + " " + product3 + " " + product4);

    }   // end method main  

}
