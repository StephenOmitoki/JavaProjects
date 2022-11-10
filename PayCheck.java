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
import java.io.File;

public class PayCheck {

    public static void main(String args[]) throws Exception {

// create Scanner object to obtain input from file
        Scanner inputFile = new Scanner(new File("PaycheckData.txt"));

        double Hourlywage, Mondayhours, Tuesdayhours, Wednesdayhours, Thursdayhours, Fridayhours, Saturdayhours, Sundayhours, Hoursworked;
        double Mondayearnings, Tuesdayearnings, Wednesdayearnings, Thursdayearnings, Fridayearnings, Saturdayearnings, Sundayearnings;
        double Weekdayearnings, Weekendearnings;
        double TotalSalary;// reserve space for variables 

        System.out.println("Employee Paystub");
        System.out.println();

        Hourlywage = inputFile.nextDouble();   // get the number from file 
        Mondayhours = inputFile.nextDouble();   // get the number from file 
        Tuesdayhours = inputFile.nextDouble();   // get the number from file 
        Wednesdayhours = inputFile.nextDouble();   // get the number from file 
        Thursdayhours = inputFile.nextDouble(); // get the number from file 
        Fridayhours = inputFile.nextDouble();   // get the number from file// get the number from file 
        Saturdayhours = inputFile.nextDouble();   // get the number from file// get the number from file
        Sundayhours = inputFile.nextDouble();   // get the number from file// get the number from file

        Hoursworked = Mondayhours + Tuesdayhours + Wednesdayhours + Thursdayhours + Fridayhours + Saturdayhours + Sundayhours;
        Mondayearnings = Hourlywage * Mondayhours;
        Tuesdayearnings = Hourlywage * Tuesdayhours;
        Wednesdayearnings = Hourlywage * Wednesdayhours;
        Thursdayearnings = Hourlywage * Thursdayhours;
        Fridayearnings = Hourlywage * Fridayhours;
        Saturdayearnings = Hourlywage * Saturdayhours;
        Sundayearnings = Hourlywage * Sundayhours;
        Weekdayearnings = Mondayearnings + Tuesdayearnings + Wednesdayearnings + Thursdayearnings + Fridayearnings;
        Weekendearnings = Saturdayearnings + Sundayearnings;
        TotalSalary = Mondayearnings + Tuesdayearnings + Wednesdayearnings + Thursdayearnings + Fridayearnings + Saturdayearnings + Sundayearnings;

        System.out.println();
        System.out.println("Hourly wage                 : " + Hourlywage);
        System.out.println();
        System.out.println("Hours worked on Monday      : " + Mondayhours);
        System.out.println("Hours worked on Tuesday     : " + Tuesdayhours);
        System.out.println("Hours worked on Wednesday   : " + Wednesdayhours);
        System.out.println("Hours worked on Thursday    : " + Thursdayhours);
        System.out.println("Hours worked on Friday      : " + Fridayhours);
        System.out.println("Hours worked on Saturday    : " + Saturdayhours);
        System.out.println("Hours worked on Sunday      : " + Sundayhours);
        System.out.println();
        System.out.println("Total Hours worked          : " + Hoursworked);
        System.out.println();
        System.out.println("Monday earnings             : " + "$" + Mondayearnings);
        System.out.println("Tuesday earnings            : " + "$" + Tuesdayearnings);
        System.out.println("Wednesday earnings          : " + "$" + Wednesdayearnings);
        System.out.println("Thursday earnings           : " + "$" + Thursdayearnings);
        System.out.println("Friday earnings             : " + "$" + Fridayearnings);
        System.out.println("Saturday earnings           : " + "$" + Saturdayearnings);
        System.out.println("Sunday earnings             : " + "$" + Sundayearnings);
        System.out.println();
        System.out.println("Weekday earnings            : " + "$" + Weekdayearnings);
        System.out.println("Weekend earnings            : " + "$" + Weekendearnings);
        System.out.println();
        System.out.println("Total Salary                : " + "$" + TotalSalary);

    } // end method main
} // end of the class

