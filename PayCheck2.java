/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stephenomitoki
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
import java.io.File;

public class PayCheck2 {

    public static void main(String args[]) throws Exception {

// create Scanner object to obtain input from file
        Scanner inputFile = new Scanner(new File("PaycheckData2.txt"));

        double Hourlywage, Mondayhours, Tuesdayhours, Wednesdayhours, Thursdayhours, Fridayhours, Saturdayhours, Sundayhours, Hoursworked;
        double Mondayearnings, Tuesdayearnings, Wednesdayearnings, Thursdayearnings, Fridayearnings, Saturdayearnings, Sundayearnings;
        double Weekdayearnings, Weekendearnings;
        double TotalSalary;
        double MondayOT = 0, TuesdayOT = 0, WednesdayOT = 0, ThursdayOT = 0, FridayOT = 0, SaturdayOT = 0, SundayOT = 0, WeekdayOT = 0, WeekendOT = 0;
        double MondayOTearnings = 0, TuesdayOTearnings = 0, WednesdayOTearnings = 0, ThursdayOTearnings = 0, FridayOTearnings = 0, SaturdayOTearnings = 0, SundayOTearnings = 0, WeekdayOTearnings = 0, WeekendOTearnings = 0;

        int EmployeeNumber;
        String FirstName, LastName;// reserve space for variables 

        System.out.println("Employee Paystub");
        System.out.println();

        FirstName = inputFile.next();
        System.out.println("Employee First Name         : " + FirstName);

        LastName = inputFile.next();
        System.out.println("Employee Last Name          : " + LastName);

        EmployeeNumber = inputFile.nextInt();
        System.out.println("Employee Number             : " + EmployeeNumber);
        inputFile.nextLine();

        Hourlywage = inputFile.nextDouble();
        inputFile.nextLine();// get the number from file 
        Mondayhours = inputFile.nextDouble();
        inputFile.nextLine();// get the number from file 
        Tuesdayhours = inputFile.nextDouble();
        inputFile.nextLine();// get the number from file 
        Wednesdayhours = inputFile.nextDouble();
        inputFile.nextLine();// get the number from file 
        Thursdayhours = inputFile.nextDouble();
        inputFile.nextLine();// get the number from file 
        Fridayhours = inputFile.nextDouble();
        inputFile.nextLine();// get the number from file// get the number from file 
        Saturdayhours = inputFile.nextDouble();
        inputFile.nextLine();// get the number from file// get the number from file
        Sundayhours = inputFile.nextDouble();
        // get the number from file// get the number from file
        Hoursworked = Mondayhours + Tuesdayhours + Wednesdayhours + Thursdayhours + Fridayhours + Saturdayhours + Sundayhours;

        /*Mondayearnings = Hourlywage * Mondayhours;
        Tuesdayearnings = Hourlywage * Tuesdayhours;
        Wednesdayearnings = Hourlywage * Wednesdayhours;
        Thursdayearnings = Hourlywage * Thursdayhours;
        Fridayearnings = Hourlywage * Fridayhours;
        Saturdayearnings = Hourlywage * Saturdayhours;
        Sundayearnings = Hourlywage * Sundayhours;
        Weekdayearnings = Mondayearnings + Tuesdayearnings + Wednesdayearnings + Thursdayearnings + Fridayearnings;
        Weekendearnings = Saturdayearnings + Sundayearnings;
        TotalSalary = Mondayearnings + Tuesdayearnings + Wednesdayearnings + Thursdayearnings + Fridayearnings + Saturdayearnings + Sundayearnings;
         */
        if (Mondayhours <= 8) {
            Mondayearnings = Mondayhours * Hourlywage;
        } else {

            Mondayearnings = (8 * Hourlywage);
            MondayOT = Mondayhours - 8;
            MondayOTearnings = (Mondayhours - 8) * (Hourlywage * 1.5);
        }

        if (Tuesdayhours <= 8) {
            Tuesdayearnings = Tuesdayhours * Hourlywage;
        } else {

            Tuesdayearnings = (8 * Hourlywage);
            TuesdayOT = Tuesdayhours - 8;
            TuesdayOTearnings = (Tuesdayhours - 8) * (Hourlywage * 1.5);
        }

        if (Wednesdayhours <= 8) {
            Wednesdayearnings = Wednesdayhours * Hourlywage;
        } else {

            Wednesdayearnings = (8 * Hourlywage);
            WednesdayOT = Wednesdayhours - 8;
            WednesdayOTearnings = (Wednesdayhours - 8) * (Hourlywage * 1.5);
        }

        if (Thursdayhours <= 8) {
            Thursdayearnings = Thursdayhours * Hourlywage;
        } else {

            Thursdayearnings = 8 * Hourlywage;
            ThursdayOT = Thursdayhours - 8;
            Thursdayearnings = (Thursdayhours - 8) * (Hourlywage * 1.5);
        }

        if (Fridayhours <= 8) {
            Fridayearnings = Fridayhours * Hourlywage;
        } else {

            Fridayearnings = (8 * Hourlywage);
            FridayOT = Fridayhours - 8;
            Fridayearnings = (Fridayhours - 8) * (Hourlywage * 1.5);

        }

        if (Saturdayhours <= 8) {
            Saturdayearnings = Saturdayhours * Hourlywage;
        } else {

            Saturdayearnings = (8 * Hourlywage);
            SaturdayOT = Saturdayhours - 8;
            SaturdayOTearnings = (Saturdayhours - 8) * (Hourlywage * 2);
        }

        if (Sundayhours <= 8) {
            Sundayearnings = Sundayhours * Hourlywage;
        } else {
            Sundayearnings = (8 * Hourlywage);
            SundayOT = Sundayhours - 8;
            SundayOTearnings = (Sundayhours - 8) * (Hourlywage * 2);
        }

        /*System.out.println();
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
        System.out.println();*/
 /* Mondayearnings = Hourlywage * Mondayhours;
        Tuesdayearnings = Hourlywage * Tuesdayhours;
        Wednesdayearnings = Hourlywage * Wednesdayhours;
        Thursdayearnings = Hourlywage * Thursdayhours;
        Fridayearnings = Hourlywage * Fridayhours;
        Saturdayearnings = Hourlywage * Saturdayhours;
        Sundayearnings = Hourlywage * Sundayhours;*/
        Weekdayearnings = Mondayearnings + Tuesdayearnings + Wednesdayearnings + Thursdayearnings + Fridayearnings;
        Weekendearnings = Saturdayearnings + Sundayearnings;
        WeekdayOT = MondayOT + TuesdayOT + WednesdayOT + ThursdayOT + FridayOT;
        WeekendOT = SaturdayOT + SundayOT;
        WeekdayOTearnings = MondayOTearnings + TuesdayOTearnings + WednesdayOTearnings + ThursdayOTearnings + FridayOTearnings;
        WeekendOTearnings = SaturdayOTearnings + SundayOTearnings;
        TotalSalary = Mondayearnings + Tuesdayearnings + Wednesdayearnings + Thursdayearnings + Fridayearnings + Saturdayearnings + Sundayearnings;

        /*System.out.println("Monday earnings             : " + "$" + Mondayearnings);
        System.out.println("Tuesday earnings            : " + "$" + Tuesdayearnings);
        System.out.println("Wednesday earnings          : " + "$" + Wednesdayearnings);
        System.out.println("Thursday earnings           : " + "$" + Thursdayearnings);
        System.out.println("Friday earnings             : " + "$" + Fridayearnings);
        System.out.println("Saturday earnings           : " + "$" + Saturdayearnings);
        System.out.println("Sunday earnings             : " + "$" + Sundayearnings);*/
        System.out.println();
        System.out.printf("Weekday earnings              : $ %7.2f\n", Weekdayearnings);
        System.out.printf("Weekday overtime earnings     : $ %7.2f\n", WeekdayOTearnings);
        System.out.printf("Weekend earnings              : $ %7.2f\n", Weekendearnings);
        System.out.printf("Weekend overtime earnings     : $ %7.2f\n", WeekendOTearnings);

        System.out.println();
        // System.out.println("Total Salary                : " + "$" + TotalSalary);

    } // end method main
} // end of the class

