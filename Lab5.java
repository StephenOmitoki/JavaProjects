/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stephenomitoki
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;

public class Lab5 {


    public static void main(String args[]) throws Exception {

// create Scanner object to obtain input from file
        Scanner inputFile = new Scanner(new File("PaycheckData.txt"));

        double Hourlywage, Mondayhours, Tuesdayhours, Wednesdayhours, Thursdayhours, Fridayhours, Saturdayhours, Sundayhours, Hoursworked;
        double Mondayearnings, Tuesdayearnings, Wednesdayearnings, Thursdayearnings, Fridayearnings, Saturdayearnings, Sundayearnings;
        double Weekdayearnings, Weekendearnings;
        double TotalSalary;// reserve space for variables 

        System.out.println("Employee Paystub");
        System.out.println();
        
            
            String firstName = inputFile.next();
            System.out.println("Employee First Name         : " + firstName);
            String secondName = inputFile.next();
            System.out.println("Employee Second Name        : " + secondName);
            int employeeNumber = inputFile.nextInt();
         
    System.out.println("Employee Number             : " + employeeNumber);
                double hourlyWage;
         hourlyWage = inputFile.nextDouble();
            System.out.print("Hourly wage                 : $");
                     System.out.format(" %.2f\n", hourlyWage);
            double mondayH, tuesdayH, WednesdayH, thursdayH, fridayH, saturdayH, sundayH;
            double mondayE, tuesdayE, WednesdayE, thursdayE, fridayE, saturdayE, sundayE;
            System.out.println();
           mondayH = inputFile.nextDouble();
                System.out.print("Hours worked on Monday      :");
                     System.out.format(" %.1f", mondayH);
            System.out.println();
            tuesdayH = inputFile.nextDouble();
                System.out.print("Hours worked on Tuesday     :");
                     System.out.format(" %.1f", tuesdayH);
            System.out.println();
            WednesdayH = inputFile.nextDouble();
                System.out.print("Hours worked on Wednesday   :");
                     System.out.format(" %.1f", WednesdayH);
            System.out.println();
            thursdayH = inputFile.nextDouble();
                System.out.print("Hours worked on Thursday    :");
                     System.out.format(" %.1f", thursdayH);
            System.out.println();
            fridayH = inputFile.nextDouble();
                System.out.print("Hours worked on Friday      :");
                     System.out.format(" %.1f", fridayH);
            System.out.println();
            saturdayH = inputFile.nextDouble();
                System.out.print("Hours worked on Saturday    :");
                     System.out.format(" %.1f", saturdayH);
            System.out.println();
            sundayH = inputFile.nextDouble();
                System.out.print("Hours worked on Sunday      :");
                     System.out.format(" %.1f", sundayH);
            System.out.println();
            System.out.println();
            double totalHoursWorked;
            totalHoursWorked =  mondayH + tuesdayH + WednesdayH + thursdayH + fridayH + saturdayH + sundayH;
            System.out.println("Total Hours worked          : " + totalHoursWorked);
                System.out.println();
            /*
    mondayE = mondayH * hourlyWage;
    tuesdayE = tuesdayH * hourlyWage;
    WednesdayE = WednesdayH * hourlyWage;
    thursdayE = thursdayH * hourlyWage;
    fridayE = fridayH * hourlyWage;
    saturdayE = saturdayH * hourlyWage;
    sundayE = sundayH * hourlyWage;
    */

    if (mondayH <= 8) {
                  mondayE = mondayH * hourlyWage;
         
    }
    else {
                            mondayH = mondayH - 8;
                            mondayE = (8 * hourlyWage) + (mondayH * hourlyWage * 1.5); 
    }
              if (tuesdayH <= 8) {
                  tuesdayE = tuesdayH * hourlyWage;
         
    }
    else {
                            tuesdayH = tuesdayH - 8;
                            tuesdayE = (8 * hourlyWage) + (tuesdayH * hourlyWage * 1.5); 
    }
              if (WednesdayH <= 8) {
                  WednesdayE = WednesdayH * hourlyWage;
         
    }
    else {
                            WednesdayH = WednesdayH - 8;
                            WednesdayE = (8 * hourlyWage) + (WednesdayH * hourlyWage * 1.5); 
    }
               if (thursdayH <= 8) {
                  thursdayE = thursdayH * hourlyWage;
         
    }
    else {
                            thursdayH = thursdayH - 8;
                            thursdayE = (8 * hourlyWage) + (thursdayH * hourlyWage * 1.5); 
    }
             if (fridayH <= 8) {
                  fridayE = fridayH * hourlyWage;
         
    }
    else {
                            fridayH = fridayH - 8;
                            fridayE = (8 * hourlyWage) + (fridayH * hourlyWage * 1.5); 
    }
              if (saturdayH <= 8) {
                  saturdayE = saturdayH * hourlyWage;
         
    }
    else {
                            saturdayH = saturdayH - 8;
                            saturdayE = (8 * hourlyWage) + (saturdayH * hourlyWage * 2); 
    }
                 if (sundayH <= 8) {
                  sundayE = sundayH * hourlyWage;
         
    }
    else {
                            sundayH = sundayH - 8;
                            sundayE = (8 * hourlyWage) + (sundayH * hourlyWage * 2); 
    }
                System.out.print("Monday Earnings             : $");
                     System.out.format(" %.2f", mondayE);
            System.out.println();
              System.out.print("Tuesday Earnings            : $");
                     System.out.format(" %.2f", tuesdayE);
            System.out.println();
              System.out.print("Wednesday Earnings          : $");
                     System.out.format(" %.2f", WednesdayE);
            System.out.println();
              System.out.print("Thursday Earnings           : $");
                     System.out.format(" %.2f", thursdayE);
            System.out.println();
              System.out.print("Friday Earnings             : $");
                     System.out.format(" %.2f", fridayE);
            System.out.println();
              System.out.print("Saturday Earnings           : $");
                     System.out.format(" %.2f", saturdayE);
            System.out.println();
              System.out.print("Sunday Earnings             : $");
                     System.out.format(" %.2f", sundayE);
            System.out.println();
            double weekdayEarnings, weekendEarnings, totalSalary;
            weekdayEarnings = mondayE + tuesdayE + WednesdayE + thursdayE + fridayE;
            weekendEarnings = saturdayE + sundayE;
            totalSalary = mondayE + tuesdayE + WednesdayE + thursdayE + fridayE + saturdayE + sundayE;
             System.out.println();
            System.out.print("Weekday earnings            : $");
                     System.out.format(" %.2f", weekdayEarnings);
            System.out.println();
            System.out.print("Weekday earnings            : $");
                     System.out.format(" %.2f", weekendEarnings);
            System.out.println();
            System.out.println();
            System.out.print("Total Salary                : $");
                     System.out.format(" %.2f", totalSalary);
         

             System.out.println();
    

    }
}
