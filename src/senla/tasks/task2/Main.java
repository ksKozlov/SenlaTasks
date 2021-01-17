package senla.tasks.task2;

import senla.tasks.errors.ErrorSummoner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        }
        else {
            ErrorSummoner.incorrectVale();
        }

        System.out.print("Enter b: ");
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        }
        else {
            ErrorSummoner.incorrectVale();
        }

        System.out.println("gcd = " + NumWorker.getGcd(a, b));
        System.out.println("lcm = " + NumWorker.getLcm(a, b));
    }
}
