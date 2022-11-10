
import java.util.Scanner;

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

public class EqTester {

    public static void main(String args[]) {
        //creates a Scanner object to obtain input from console window
        Scanner input = new Scanner(System.in);

        int a; //reserve space for integers
        int b;
        int c;
        int first;
        int second;
        int third;
        int total;

        System.out.println("Equation Tester");
        System.out.println();

        //get input data from the user
        System.out.print("Enter the value for the variable a: "); //prompt user for an action
        a = input.nextInt();                         //read what the user enters

        System.out.print("Enter the value for the variable b: "); //prompt user for an action
        b = input.nextInt();                         //read what the users enters

        System.out.print("Enter the value for the variable c: "); //prompt user for an action
        c = input.nextInt();                         //read what the users enters

        first = ((4 * a) - 2) / (a * (b + 1));
        second = (4 * b) * ((a * c) - b);
        third = ((2 * a) + 3 - b) / (b + c);
        total = first + second - third;
        //print out the results of some simple computations
        System.out.println();
        System.out.println("The value of the expression is :  " + total);

    }   // end method main  

}
