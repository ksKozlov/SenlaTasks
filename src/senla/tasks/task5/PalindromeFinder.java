package senla.tasks.task5;

public class PalindromeFinder {

    public static boolean isPalindrome(int number) {
        char[] c = String.valueOf(number).toCharArray();
        boolean check = true;

        for (int i=0, j=c.length-1; i < c.length; i++, j--) {
            if (c[i] == c[j]) {
                check = true;
            } else {
                return false;
            }
        }

        return check;
    }
}
