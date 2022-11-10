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

public class Lab5_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, multiplication, subtraction, addition, division, remainder;
        String tmp;

        System.out.println("Integer Math Calculator Program");
        System.out.println();

        System.out.println("Operations Available");
        System.out.println();

        System.out.println("+ Addition");
        System.out.println("- Subtraction");
        System.out.println("* Multiplication");
        System.out.println("/ Division");
        System.out.println("% Remainder");
        System.out.println();

        System.out.print("Which operation do you wish : ");

        //addition
        tmp = input.next();
        if (tmp.charAt(0) == '+') {
            System.out.print("Enter the Value for X    : ");
            x = input.nextInt();
            System.out.print("Enter the Value for Y    : ");
            y = input.nextInt();
            addition = x + y;

            System.out.println();
            System.out.println("x + y = " + addition);
        } //subtraction
        else if (tmp.charAt(0) == '-') {
            System.out.print("Enter the Value for X    : ");
            x = input.nextInt();
            System.out.print("Enter the Value for Y    : ");
            y = input.nextInt();
            subtraction = x - y;
            System.out.println("x - y = " + subtraction);
        } //multiplication
        else if (tmp.charAt(0) == '*') {
            System.out.print("Enter the Value for X    : ");
            x = input.nextInt();
            System.out.print("Enter the Value for Y    : ");
            y = input.nextInt();
            multiplication = x * y;
            System.out.println("x * y = " + multiplication);

        } //division
        else if (tmp.charAt(0) == '/') {
            System.out.print("Enter the Value for X    : ");
            x = input.nextInt();
            System.out.print("Enter the Value for Y    : ");
            y = input.nextInt();
            division = x / y;
            System.out.println("x / y = " + division);

        } //remainder or modulo
        else if (tmp.charAt(0) == '%') {
            System.out.print("Enter the Value for X    : ");
            x = input.nextInt();
            System.out.print("Enter the Value for Y    : ");
            y = input.nextInt();
            remainder = x % y;
            System.out.println("x % y = " + remainder);
            System.out.println();
        }
    }
}
