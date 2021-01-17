package senla.tasks.errors;

public class ErrorSummoner {

    public static void someError() {
        System.out.println("Oops... Some error occurred.");
        System.exit(0);
    }

    public static void incorrectVale() {
        System.out.println("It seems that you entered not an integer or not a number at all." +
                "\nOr maybe your number is too big or small.");
        System.exit(0);
    }
}
