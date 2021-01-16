package senla.tasks.task1;

import java.util.Arrays;

public class NumberInfo {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        boolean[] isPrime = new boolean[number + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i < number; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= number; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime[number];
    }

    public static boolean isEven(int number) {
        return (number & 1) == 0;
    }
}
