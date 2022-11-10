
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;

public class Lab4_5 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputFile = new Scanner(new File("SecretMsg.txt"));

        String wordOne, wordTwo, wordThree, wordFour, words, wordFive, wordSix, tmp, wordSeven, tmpTwo, wordEight, wordNine, tmpThree, wordTen, wordEleven;
        char a, b, c, d;
        int len, lenTwo;

        wordOne = inputFile.next();
        wordOne = inputFile.next();
        wordOne = inputFile.next();
        wordOne = inputFile.next();
        //System.out.println("Fourth word on line one is " + wordOne);

        inputFile.nextLine();
        wordTwo = inputFile.next();
        wordTwo = inputFile.next();

        a = wordTwo.charAt(0);

        wordThree = inputFile.next();
        b = wordThree.charAt(0);

        wordFour = inputFile.next();
        c = wordFour.charAt(0);

        words = (("" + a + b + c).toUpperCase());

        //System.out.println(words);

        //
        inputFile.nextLine();
        wordFive = inputFile.next();
        wordFive = inputFile.next();

        inputFile.nextLine();
        wordSix = inputFile.next();
        wordSix = inputFile.next();
        wordSix = inputFile.next();
        tmp = wordSix.substring(2, 6);

        //System.out.println(wordFive + "" + tmp);

        inputFile.nextLine();

        wordSeven = inputFile.next();
        wordSeven = inputFile.next();
        wordSeven = inputFile.next();
        wordSeven = inputFile.next();
        wordSeven = inputFile.next();
        wordSeven = inputFile.next();
        wordSeven = inputFile.next();

        tmpTwo = wordSeven.substring(0, 4);

        //System.out.println(tmpTwo);

        wordEight = inputFile.next();
        wordEight = inputFile.next();

        len = wordEight.length();

        //System.out.println(len);

        wordNine = inputFile.next();
        tmpThree = wordNine.substring(3, 5);

        //System.out.println(tmpThree);

        
        inputFile.nextLine();
        wordTen = inputFile.next();
        wordTen = inputFile.next();
        wordTen = inputFile.next();

        
        inputFile.nextLine();
        wordEleven = inputFile.nextLine();
        lenTwo = wordEleven.length();

        //System.out.println(wordTen + ":" + lenTwo); 

        System.out.println(wordOne + " " + words + " " + wordFive + "" + tmp + " " + tmpTwo + " " + len + " " + tmpThree + " " + wordTen + ":" + lenTwo);

    }

}
