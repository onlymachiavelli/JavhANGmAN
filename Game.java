import java.io.Reader;
import java.util.Scanner;

public class Game {
    // Just to make the syntax easier !

    public static void print(Object obj) {
        System.out.println(obj);
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
        print("This is a hangman game u better save that motherfucker down here");
        answer = input.nextLine().charAt(0);
        print(answer);
        int opr = word.length() / 2;
        print(opr);
        String[] arr;
        while (true) {
            if (countLOSS == 5) {
                print("Game is over ! you lost you mther fucker !");// NICE
            }

            print("Enter your guess you fcking peace of shit ! ");
        }
    }
}