package yuown.hackerrank;

import java.util.Scanner;

public class NoPrefixSet {
    public static void main(String[] args) {
        Word base = new Word();
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int i = 1;
        while (scanner.hasNext() && (i <= total && i <= 100000)) {
            String line = scanner.next().trim();
            if (line.length() > 0 && line.length() <= 60) {
                base.add(line);
                i++;
            }
        }
    }
}

class Word {
    private static int MAX = 10;
    private Word[] words = new Word[MAX];
    private boolean isFullWord = false;

    private int getPosition(char c) {
        return c - 'a';
    }

    public void add(String w) {
        add(w, 0);
    }

    private void add(String w, int index) {
        if (index == w.length()) {
            isFullWord = true;
            return;
        }
        char c = w.charAt(index);
        Word word = words[getPosition(c)];
        if (word == null) {
            word = new Word();
            setWord(c, word);
        }
        if (isFullWord) {
            System.out.println("BAD SET");
            System.out.println(w);
            return;
        }
        word.add(w, index + 1);
        if (index == w.length() - 1) {
            System.out.println("GOOD SET");
        }
    }

    private Word getWord(char c) {
        return words[getPosition(c)];
    }

    private void setWord(char c, Word w) {
        words[getPosition(c)] = w;
    }
}