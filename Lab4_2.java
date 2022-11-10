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

public class Lab4_2 {

    public static void main(String args[]) {
        //creates a Scanner object to obtain input from console window
        Scanner input = new Scanner(System.in);

        double seconds, minutes, hours, days, weeks;
        double remseconds, reminutes, remhours, remdays, remweeks, totalseconds;

        System.out.println("Reverse Seconds Computation Program");
        System.out.println();

        //get input data from the user
        System.out.print("What is the total number of SECONDS:   "); //prompt user for an action
        totalseconds = input.nextDouble();
        System.out.println(""); //read what the user enters

        weeks = (totalseconds / 604800);
        remweeks = (totalseconds % 604800);

        days = (remweeks / 86400);
        remdays = (remweeks % 86400);

        hours = (remdays / 3600);
        remhours = (remdays % 3600);

        minutes = (remhours / 60);
        remseconds = (remhours % 60);

        seconds = (remseconds / 60);

        //print out the results of some simple computations
        System.out.println();
        System.out.println("Number of whole WEEKS   :   " + (int) weeks);

        System.out.println();
        System.out.println("Number of whole DAYS    :   " + (int) days);

        System.out.println();
        System.out.println("Number of whole HOURS   :   " + (int) hours);

        System.out.println();
        System.out.println("Number of whole MINUTES :   " + (int) minutes);

        System.out.println();
        System.out.println("Number of whole SECONDS :   " + (int) remseconds);
    }
}   // end method main  

