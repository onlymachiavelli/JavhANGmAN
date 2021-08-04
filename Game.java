import java.io.Reader;
import java.util.Scanner;
import java.util.Random;

public class Game {
    // Just to make the syntax easier !

    public static void print(Object obj) {
        System.out.println(obj);
    }

    boolean FckingBool(int fuck) {
        if (fuck == 1) {
            return true;
        }
        return false;
    }

    public boolean Check(String word, char guess) {
        int i;
        // linear search for the char in the word
        for (i = 0; i < word.length(); i++) {
            if (guess == word.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = "hello";
        int countLOSS = 0;
        char answer = 'N';
        Random rand = new Random();
        print("This is a hangman game u better save that motherfucker down here");

        int opr = word.length() / 2;
        print(opr);
        boolean g;
        String ToGuess;
        for (int i = 0; i < word.length(); i++) {
            g = rand.nextInt(2);
        }

        while (true) {
            if (countLOSS == 5) {
                print("Game is over ! you lost you mther fucker !");// NICE
            }
            print("Word length = " + word.length());
            print("Enter your guess you fcking answer u fcking  peace of shit ! ");

            //
            answer = input.nextLine().charAt(0);
        }
    }
}