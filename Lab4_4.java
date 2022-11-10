
import java.util.Scanner;
import java.io.File;

public class Lab4_4 {

    public static void main(String args[]) throws Exception {

// create Scanner object to obtain input from file
        Scanner inputFile = new Scanner(new File("Lab4_Data.txt"));

        int a, b, c, d, e, f;    // reserve space for variables 

        System.out.println("File Magic output");
        System.out.println();

        a = inputFile.nextInt();   // get the number from file 
        b = inputFile.nextInt();   // get the number from file 
        inputFile.nextLine();      // skip the rest of the line from file 

        c = inputFile.nextInt();   // get the number from file 
        d = inputFile.nextInt();
        inputFile.nextLine();      // skip the rest of the line from file 
        inputFile.nextLine();      // skip the rest of the line from file 

        e = inputFile.nextInt();   // get the number from file 
        f = inputFile.nextInt();   // get the number from file 

        System.out.println("Line 1: " + a);
        System.out.println("Line 2: " + b);
        System.out.println("Line 3: " + c);
        System.out.println("Line 3: " + d);
        System.out.println("Line 4: " + e);
        System.out.println("Line 4: " + f);

    } // end method main
} // end of the class
