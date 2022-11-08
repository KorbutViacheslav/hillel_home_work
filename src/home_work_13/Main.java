package home_work_13;

import java.util.*;

public class Main {
    static ArrayList<String> list = new ArrayList<>(Arrays.asList(
            "apple", "orange", "peach", "plum", "banana", "apple", "apple", "plum", "orange"));
    static Integer[] array = {
            5, 6, 7, 8, 9, 0};
    static List<Integer> findUniqueList = new ArrayList<>(Arrays.asList(
            1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9));

    public static void main(String[] args) {
        countOccurance(list, "apple");
        System.out.println("It was array: " + Arrays.toString(array) + "\nBecame list: " + toLis(array));
        System.out.println("SetList: " + findUnique(findUniqueList));
        calcOccurance(list);
        System.out.println(findOccurance(list));

    }

    public static void countOccurance(ArrayList<String> list, String s) {
        int countString = 0;
        for (String ss : list) {
            if (ss.equals(s)) {
                countString++;
            }
        }
        System.out.println("Your word is repeated " + countString + " times in the list.");
    }

    public static <T> List<T> toLis(T[] array) {
        return new ArrayList<>(List.of(array));
    }

    public static <T> Set<T> findUnique(List<Integer> s) {
        return new LinkedHashSet(s);
    }

    public static void calcOccurance(ArrayList<String> list) {
        Set<String> setWords = new TreeSet<>();
        for (String word : list) {
            int countWord = 0;
            for (String ss : list) {
                if (ss.equals(word))
                    countWord++;
            }
            String currentWord = String.format("%s: %s", word, countWord);
            setWords.add(currentWord);
        }
        System.out.println(setWords);
    }

    public static List<String> findOccurance(ArrayList<String> list) {
        List<String> listWords = new ArrayList<>();
        for (String word : list) {
            int countWord = 0;
            for (String ss : list) {
                if (ss.equals(word)) countWord++;
            }
            String wor = String.format("{Name: \"%s\", Occurrence: %s}\n", word, countWord);
            listWords.add(wor);
        }
        return listWords;
    }
}
