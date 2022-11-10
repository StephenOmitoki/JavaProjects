
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

public class Part2 {

    public static void main(String args[]) {
        //creates a Scanner object to obtain input from console window
        Scanner input = new Scanner(System.in);

        double distance;
        double hours;
        double minutes;
        double totalminutes;
        double seconds;
        double totalseconds;
        double time;
        double speed;

        System.out.println("Bike computer helper");
        System.out.println();

        //get input data from the user
        System.out.print("Enter the number of meters traveled   :   "); //prompt user for an action
        distance = input.nextInt();                         //read what the user enters

        System.out.print("Enter the number of hours you took    :   "); //prompt user for an action
        hours = input.nextInt();                         //read what the user enters

        System.out.print("Enter the number of minutes you took  :   "); //prompt user for an action
        minutes = input.nextInt();                         //read what the user enters

        System.out.print("Enter the number of seconds you took  :   "); //prompt user for an action
        seconds = input.nextInt();                         //read what the user enters

        totalseconds = hours * 3600;
        totalminutes = minutes * 60;
        time = totalseconds + totalminutes + seconds;
        speed = distance / time;
        //print out the results of some simple computations
        System.out.println();
        System.out.println("Your average speed was :   " + (int) (speed * 100) / 100.0 + "m/sec");

    }   // end method main  

}
