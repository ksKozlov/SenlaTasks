package senla.tasks.task3;

import java.util.Arrays;

public class TextWorker {

    public static String deletePunctuation(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLetter(chars[i]) || Character.isDigit(c) || Character.isSpaceChar(c)) {
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }

    public static String[] getSortedWords(String string) {
        String[] words = deletePunctuation(string).split(" ");
        Arrays.sort(words);
        return words;
    }

    public static int getNumberOfWords(String string) {
        return getSortedWords(string).length;
    }

    //Text-only method, you should not use it for a word
    public static String wordsToUpper(String string) {
        String[] words = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            /*
            *This cycle is necessary since the user can put a punctuation mark
            * without separating it with a space from the word
             */
            for (int j = 0; j < words[i].length(); ) {
                if (!Character.isAlphabetic(words[i].charAt(j))) {
                    j++;
                }
                words[i] = words[i].substring(0, j) + Character.toUpperCase(words[i].charAt(j)) +
                        words[i].substring(j + 1);
                break;
            }
            stringBuilder.append(words[i]).append(" ");
        }
        return stringBuilder.toString();
    }
}
