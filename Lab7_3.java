/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stephenomitoki
 */
import java.util.Scanner;

public class Lab7_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        int count = 0;
        int total = 0;
        int throwValue = 0;

        while (count < 10000) {

            a = (int) (Math.random() * 6) + 1;
            b = (int) (Math.random() * 6) + 1;
            c = (int) (Math.random() * 6) + 1;

            if ((a == b) && (a == c)) {

                if (a == 6) {
                    throwValue = 20;
                } else {
                    throwValue = 10;
                }
            } else if ((a == b) || (a == c) || (b == c)) {

                throwValue = 5;
            } else {

                throwValue = -1;
            }

            total += throwValue;
            count++;
        }
        System.out.println("Casino Dice throw simulation ");
        System.out.println();
        System.out.println("After 10,000 runs the player made $" + total);
        System.out.println("This is a bad game for the casino");
    }
}
