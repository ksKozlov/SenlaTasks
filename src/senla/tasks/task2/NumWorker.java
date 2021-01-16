package senla.tasks.task2;

public class NumWorker {

    public static int getGcd(int a, int b) {
        if (a < 0) {
            a *= -1;
        }
        if (b < 0) {
            b *= -1;
        }
        while ((a != 0) && (b != 0)) {
            if (a > b) {
                a %= b;
            }
            else {
                b %= a;
            }
        }
        return a + b;
    }

    public static int getLcm(int a, int b) {
        return Math.abs(a * b) / getGcd(a, b);
    }
}
