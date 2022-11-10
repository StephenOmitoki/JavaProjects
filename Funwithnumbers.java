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

        int n;
        int num1;
        int num2;
        int num3;
        int sum;

        System.out.println("Fun with numbers");
        System.out.println();

        //get input data from the user
        System.out.print("Enter a single digit number  :   "); //prompt user for an action
        n = input.nextInt();                         //read what the user enters
        num1 = n * 11;
        num2 = n * 111;
        num3 = n * 1111;

        sum = n + num1 + num2 + num3;
        //print out the results of some simple computations
        System.out.println();
        System.out.println("The sum of the sequence is : " + sum);

    }   // end method main  

}
