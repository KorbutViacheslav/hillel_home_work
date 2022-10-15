package home_work_5;

abstract class Animal {
    private static int instanceCount;

    public Animal() {
        instanceCount++;
        System.out.println("Created animal(s): " + instanceCount);
    }

    abstract public void run(int maxdis);

    abstract public void swim(int maxswim);
}
