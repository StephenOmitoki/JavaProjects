
/**
 *
 * @author stephenomitoki
 */
import java.util.Scanner;

public class Lab6_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word;
        String check;
        int length;

        System.out.print("Enter a word : ");
        word = input.next();
        check = word.toLowerCase();
        length = word.length();

        switch (length) {
            case 1:
                System.out.println(word + " is a palindrome");
                break;
            case 2:
                if ((check.charAt(0)) == check.charAt(1)) {
                    System.out.println(word + " is a palindrome");
                } else {
                    System.out.println(word + " is not a palindrome");
                }
                break;
            case 3:
                if ((check.charAt(0)) == check.charAt(2)) {

                    System.out.println(word + " is a palindrome");
                } else {
                    System.out.println(word + " is not a palindrome");
                }
                break;
            case 4:
                if ((check.charAt(0)) == check.charAt(3)) {

                    System.out.println(word + " is a palindrome");
                } else {
                    System.out.println(word + " is not a palindrome");
                }
                break;

            case 5:
                if ((check.charAt(0)) == check.charAt(4)) {
                    if ((check.charAt(1)) == check.charAt(2)) {
                        System.out.println(word + " is a palindrome");
                    } else {
                        System.out.println(word + " is not a palindrome");
                    }
                } else {
                    System.out.println(word + " is not a palindrome");
                }

                if (length > 5) {
                    break;

                }

        }
    }
}
