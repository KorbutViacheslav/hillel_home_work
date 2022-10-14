package home_work_5;

abstract class Animal {
    private static int count;

    public Animal() {
        count++;
        System.out.println("Created animal(s): " + count);
    }

    abstract public void run(int maxdis);

    abstract public void swim(int maxswim);
}
