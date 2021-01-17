package senla.tasks.task4;

import senla.tasks.task3.TextWorker;

public class WordCounter {

    public static int wordCounter(String string, String word) {
        String[] words = TextWorker.getSortedWords(string);
        int counter = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].charAt(0) != word.charAt(0)) {
                continue;
            }
            else if (words[i].equals(word)) {
                counter++;
                if (words[i].charAt(1) != word.charAt(1)) {
                    break;
                }
            }
        }

        return counter;
    }
}
