/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stephenomitoki
 */
import java.util.Scanner;

public class Lab7_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test, occur = 0;
        double prob;
        int check;
        int count = 0;
        int d1, d2;

        System.out.print("Probability Testing Program");
        System.out.println();

        System.out.print("What Die total do you wish to test for (2 - 12): ");
        test = input.nextInt();

        System.out.println();
        System.out.println("Computed Probability for Die throw = " + test);
        System.out.println();
        System.out.println("Die throws     Probability");
        System.out.println();

        while (count < 20000) {
            d1 = (int) (Math.random() * 6 + 1);
            d2 = (int) (Math.random() * 6 + 1);
            count++;
            check = d1 + d2;

            if (check == test) {
                occur++;
            }

            if ((count % 1000) == 0) {
                prob = (double) occur / count;
                System.out.printf("%10d    %8.5f \n", count, prob);
            }
        }
    }

}
