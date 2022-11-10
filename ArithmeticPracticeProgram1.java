/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stephenomitoki
 */
import java.util.Scanner;

public class Lab7_1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Arithmetic Practice Program ");
        System.out.println();

        int answer = 0;
        int reply = 0;
        int operation;
        int question;
        int tries = 1;
        String op = "";
        int correct = 0;
        double average;

        System.out.print("How many questions do you wish to try : ");
        question = input.nextInt();

        while (tries <= question) {
            int random1 = (int) (Math.random() * 100) + 1;
            int random2 = (int) (Math.random() * 100) + 1;
            operation = (int) (Math.random() * 5);

            switch (operation) {
                case 0:
                    op = " + ";
                    answer = random1 + random2;
                    break;
                case 1:
                    op = " - ";
                    answer = random1 - random2;
                    break;
                case 2:
                    op = " * ";
                    answer = random1 * random2;
                    break;
                case 3:
                    op = " / ";
                    answer = random1 / random2;
                    break;
                case 4:
                    op = " % ";
                    answer = random1 % random2;
                    break;
                default:
                    break;
            }
            System.out.print("Question " + tries + ": " + random1 + op + random2 + " = ");
            reply = input.nextInt();

            if (reply == answer) {
                System.out.println("Correct");
                correct++;
            } else {
                System.out.println("Not Correct the answer is : " + answer);
            }
            tries++;
            System.out.println();
        }
        average = (double) (correct) / ((question)) * 100;
        System.out.println();
        System.out.println("You got " + correct + " correct answer out of a maximum of " + question + " questions");
        System.out.println();
        System.out.format("Your average is : %2.2f", average);
        System.out.println("%");

    }
}
