package home_work_5;

public class Dog extends Animal {
    private static int instanceCount;

    public Dog() {
        instanceCount++;
        System.out.println("Created dog(s): " + instanceCount);
    }

    @Override
    public void run(int maxdis) {
        if (maxdis <= 500) {
            System.out.println("Dog run " + maxdis + " meters");
        } else {
            System.out.println("Dog can not running more 500 meters(((");
        }
    }

    @Override
    public void swim(int maxswim) {
        if (maxswim <= 10) {
            System.out.println("Dog swim " + maxswim + " meters");
        } else {
            System.out.println("Dog can not swimming more 10 meters(((");
        }
    }
}
