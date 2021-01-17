package senla.tasks.task4;

import senla.tasks.errors.ErrorSummoner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = null;
        String word = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type text: ");

        if (scanner.hasNextLine()) {
            text = scanner.nextLine();
        }
        else {
            ErrorSummoner.someError();
        }

        System.out.print("Type word: ");

        if (scanner.hasNextLine()) {
            word = scanner.nextLine();
        }
        else {
            ErrorSummoner.someError();
        }

        System.out.println(WordCounter.wordCounter(text, word));
    }
}
