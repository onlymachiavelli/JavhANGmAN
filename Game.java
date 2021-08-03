import java.io.Reader;
import java.util.Scanner;

public class Game {
    // Just to make the syntax easier !

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void input(Object obj) {
        Scanner Reader = new Scanner(System.in);
        obj = Reader.nextLine();
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
        String word = "hello";

    }
}