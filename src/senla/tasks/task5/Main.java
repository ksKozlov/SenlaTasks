package senla.tasks.task5;

import senla.tasks.errors.ErrorSummoner;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sequence;
        int sequenceLength = 0;
        ArrayList<Integer> palindromes = new ArrayList<>();

        System.out.print("Enter the length of sequence (no more than 100): ");

        if (scanner.hasNextInt()) {
            sequenceLength = scanner.nextInt();

            if (sequenceLength > 100 || sequenceLength < 1) {
                System.out.println("Error. The length of the sequence must be between 1 and 100.");
                System.exit(0);
            }
        }
        else {
            ErrorSummoner.incorrectVale();
        }

        sequence = new int[sequenceLength];

        System.out.println("Enter the sequence:");

        for (int i = 0; i < sequenceLength; i++) {
            System.out.print("number #" + i + " = ");

            if (scanner.hasNextInt()) {
                sequence[i] = scanner.nextInt();
                if (PalindromeFinder.isPalindrome(sequence[i])) {
                    palindromes.add(sequence[i]);
                }
            }
            else {
                ErrorSummoner.incorrectVale();
            }
        }

        System.out.println("\nPalindromes:");

        for (int i = 0; i < palindromes.size(); i++) {
            System.out.println(palindromes.get(i));
        }
    }
}
