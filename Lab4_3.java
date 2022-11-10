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

public class Lab4_3 {

    public static void main(String args[]) {
        //creates a Scanner object to obtain input from console window
        Scanner input = new Scanner(System.in);

        int n;
        int digit;
        int firstnum;
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int sum;

        System.out.println("Sum of digits");
        System.out.println();

        //get input data from the user
        System.out.print("Please enter a 5 digit number         : "); //prompt user for an action
        digit = input.nextInt();                         //read what the user enters
        firstnum = digit;

        num1 = digit / 10000;
        digit = digit - (num1 * 10000);

        num2 = digit / 1000;
        digit = digit - (num2 * 1000);

        num3 = digit / 100;
        digit = digit - (num3 * 100);

        num4 = digit / 10;
        digit = digit - (num4 * 10);

        num5 = digit / 1;
        digit = digit - (num5 * 1);

        sum = num1 + num2 + num3 + num4 + num5;

        //print out the results of some simple computations
        System.out.println();
        System.out.println("The sum of the digits in  " + firstnum + " is    : " + sum);

    }   // end method main  

}
