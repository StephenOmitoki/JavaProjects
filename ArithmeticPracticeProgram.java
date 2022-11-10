/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stephenomitoki
 */
import java.util.Scanner;

public class Lab5_4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Arithmetic Practice Program ");
        System.out.println();

        int answer = 0;
        int reply;
        int operation;

        String operandDisplay = "";

        int random1 = (int) (Math.random() * 20) + 1;
        int random2 = (int) (Math.random() * 20) + 1;
        operation = (int) (Math.random() * 5);

        if (operation == 0) {
            operandDisplay = " + ";
            answer = random1 + random2;
        } else if (operation == 1) {
            operandDisplay = " - ";
            answer = random1 - random2;
        } else if (operation == 2) {
            operandDisplay = " * ";
            answer = random1 * random2;
        } else if (operation == 3) {
            operandDisplay = " / ";
            answer = random1 / random2;
        } else if (operation == 4) {
            operandDisplay = " % ";
            answer = random1 % random2;
        }
        System.out.print("Question : " + random1 + operandDisplay + random2 + " = ");
        reply = input.nextInt();

        if (reply == answer) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }

    }
}
