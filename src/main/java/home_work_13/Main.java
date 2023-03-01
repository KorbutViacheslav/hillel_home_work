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
        /*countOccurance(list, "apple");
        System.out.println("It was array: " + Arrays.toString(array) + "\nBecame list: " + toLis(array));
        System.out.println("SetList: " + findUnique(findUniqueList));*/
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

    public static <T> List<T> findUnique(List<Integer> s) {
        return (List<T>) new ArrayList<>(new HashSet<>(s));

    }

    public static void calcOccurance(List<String> list) {
        Map<String, Integer> mapWords = new HashMap<>();
        for (String s : list) {
            mapWords.put(s, mapWords.getOrDefault(s, 0) + 1);
        }
        System.out.println(mapWords);
    }

    public static HashMap<String,Integer> findOccurance(List<String> list) {
        HashMap<String,Integer> listWords = new HashMap<>();
        for (String word : list) {
            listWords.put(word,Collections.frequency(list,word));
        }
        return listWords;
    }
}
