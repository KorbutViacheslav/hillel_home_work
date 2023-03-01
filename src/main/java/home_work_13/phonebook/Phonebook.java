package home_work_13.phonebook;

import java.util.HashMap;
import java.util.HashSet;
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
        HashMap<Recording, String> rec = findAll("Roma");
        System.out.println(rec);
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

    public static HashMap<Recording, String> findAll(String name) {
        /*ArrayList<Recording> list = new ArrayList<>();
        for (Recording current : book) {
            if (current.getName().equals(name)) {
                list.add(current);
            }
        }
        if (list.isEmpty()) {
            return null;
        } else {
            return list;
        }*/
        //Optional with a HashMap
        HashMap<Recording, String> mapRec = new HashMap<>();
        for (Recording r : book) {
            if (r.getName().equals(name)) {
                mapRec.put(r, name);
            }
        }
        if (mapRec.isEmpty()) {
            return null;
        } else {
            return mapRec;
        }

    }
}
