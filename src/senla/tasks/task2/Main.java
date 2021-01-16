package senla.tasks.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        String errorMessage = "It seems that you entered not an integer or not a number at all." +
                "\nOr maybe your number is too big or small.";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        }
        else {
            System.out.println(errorMessage);
            System.exit(0);
        }

        System.out.print("Enter b: ");
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        }
        else {
            System.out.println(errorMessage);
            System.exit(0);
        }

        System.out.println("gcd = " + NumWorker.getGcd(a, b));
        System.out.println("lcm = " + NumWorker.getLcm(a, b));
    }
}
