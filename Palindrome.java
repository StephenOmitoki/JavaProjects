
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author stephenomitoki
 */
public class Lab6_1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int num;
        int a, b, c;

        System.out.print("Enter a four digit integer : ");
        num = input.nextInt();
        a = num / 1000;
        b = num % 100;
        c = num % 10;
        System.out.println();

        if (a != c) {
            System.out.println(num + " is NOT a palindrome");
        } else if (a == c) {
            System.out.println(num + " is a palindrome");
        }
    }

}
