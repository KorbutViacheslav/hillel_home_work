package home_work_11.part2;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        ThreadSafeList<Person> list = new ThreadSafeList<>();
        list.add(new Person(30, "Slava"));
        list.add(new Person(40, "Alina"));
        list.add(new Person(20, "Kolya"));
        list.add(new Person(20, "Ira"));
        list.add(new Person(40, "Makar"));
        for (int i = 0; i < list.size(); i++) {
            list.get(i).semaphore = semaphore;
        }
        list.get(0).start();
        list.get(1).start();
        list.get(2).start();
        list.get(3).start();
        list.get(4).start();


    }
}
