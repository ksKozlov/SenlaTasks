package senla.tasks.task1;

import senla.tasks.errors.ErrorSummoner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");

        try {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                boolean isEven = NumberInfo.isEven(number);
                boolean isPrime = NumberInfo.isPrime(number);

                if (isPrime && isEven) {
                    System.out.println("The number is prime and even.");
                }
                else if (!isPrime && isEven) {
                    System.out.println("The number is not prime, but even.");
                }
                else if (isPrime) {
                    System.out.println("The number is prime, but not even.");
                }
                else {
                    System.out.println("The number is not prime and not even.");
                }
            }
            else {
                ErrorSummoner.incorrectVale();
            }
        } catch (Exception e) {
            ErrorSummoner.someError();
        }

    }
}