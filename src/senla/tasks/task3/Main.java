package senla.tasks.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type text: ");
        if (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            String[] words = TextWorker.getSortedWords(text);

            System.out.println(TextWorker.wordsToUpper(text));
            System.out.println("Sorted list of words: ");

            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }

            System.out.println("Number of words: " + TextWorker.getNumberOfWords(text));
        }
        else {
            System.out.println("Oops... Some error occurred.");
        }

    }
}
