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

public class Lab4_1 {

    public static void main(String args[]) {
        //creates a Scanner object to obtain input from console window
        Scanner input = new Scanner(System.in);

        double weeks;
        double days;
        double hours;
        double minutes;
        double seconds;
        double totalseconds;
        double totalminutes;
        double totalhours;
        double totaldays;
        double totalweeks;

        System.out.println("Seconds Computation Program");
        System.out.println();

        //get input data from the user
        System.out.print("How many WEEKS    :   "); //prompt user for an action
        weeks = input.nextInt();                         //read what the user enters

        System.out.print("How many DAYS     :   "); //prompt user for an action
        days = input.nextInt();                         //read what the user enters

        System.out.print("How many HOURS    :   "); //prompt user for an action
        hours = input.nextInt();                         //read what the user enters

        System.out.print("How many MINUTES  :   "); //prompt user for an action
        minutes = input.nextInt();                         //read what the user enters

        System.out.print("How many SECONDS  :   "); //prompt user for an action
        seconds = input.nextInt();                         //read what the user enters

        totalweeks = weeks * 604800;
        totaldays = days * 86400;
        totalhours = hours * 3600;
        totalminutes = minutes * 60;
        totalseconds = totalminutes + totalhours + totaldays + totalweeks + seconds;

        //print out the results of some simple computations
        System.out.println();
        System.out.println("Total SECONDS during that time period is :   " + (int) totalseconds);
    }
}   // end method main  

