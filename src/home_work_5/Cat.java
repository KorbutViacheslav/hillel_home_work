package home_work_5;

public class Cat extends Animal {

    public Cat() {
        getInstanceCount();
        System.out.println("Created cat(s): " + getInstanceCount());
    }

    @Override
    public void run(int maxdis) {
        if (maxdis <= 200) {
            System.out.println("Cat run " + maxdis);
        } else {
            System.out.println("Cat can not running more 200 meters(((");
        }
    }

    @Override
    public void swim(int maxswim) {
        System.out.println("Cat can not swimming(((");


    }
}
