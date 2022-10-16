package home_work_8;

import java.util.Random;
import java.util.Scanner;

public class WordsApp {
    public static void main(String[] args) {
        WordsApp app = new WordsApp();
        app.start();
    }

    public void start() {
        String[] arrayWords = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String computerWord = arrayWords[new Random().nextInt(arrayWords.length)];
        StringBuilder cheat = new StringBuilder("###############");
        System.out.println("Computer word: " + computerWord);
        while (true) {
            System.out.println("Enter word: ");
            String userWord = new Scanner(System.in).nextLine();
            if (computerWord.equals(userWord)) {
                System.out.println("YES");
                break;
            } else {
                printPodskazka(computerWord, userWord, cheat);
            }
        }
    }

    private void printPodskazka(String computerWord, String userWord, StringBuilder cheat) {
        int minZnachenn = Math.min(userWord.length(), computerWord.length());
        for (int i = 0; i < minZnachenn; i++) {
            if (computerWord.charAt(i) == userWord.charAt(i)) {
                cheat.setCharAt(i, computerWord.charAt(i));
            }
        }
        System.out.println("You cheat " + cheat + " try again)");
    }
}
