package home_work_13.phonebook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Phonebook {
    private static Set<Recording> book = new HashSet<>();

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add(new Recording("Roma", "00000"));
        phonebook.add(new Recording("Alex", "22222"));
        phonebook.add(new Recording("Alina", "33333"));
        phonebook.add(new Recording("Roma", "11111"));

        System.out.println(find("Alex"));
        List<Recording> rec = findAll("Roma");
        for (Recording recording : rec) {
            System.out.println(recording);
        }
    }

    public static void add(Recording recording) {
        book.add(recording);
    }

    public static Recording find(String name) {
        for (Recording current : book) {
            if (current.getName().equals(name)) {
                return current;
            }
        }
        return null;
    }

    public static List<Recording> findAll(String name) {
        ArrayList<Recording> list = new ArrayList<>();
        for (Recording current : book) {
            if (current.getName().equals(name)) {
                list.add(current);
            }
        }
        if (list.isEmpty()) {
            return null;
        } else {
            return list;
        }
    }
}
