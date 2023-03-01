package home_work_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private float weight = 0;
    private List<T> fruitsList = new ArrayList<>();

    public void add(T fruit) {
        fruitsList.add(fruit);
    }

    public void addAll(T... fruits) {
        fruitsList.addAll(Arrays.asList(fruits));
    }

    public float getWeight() {
        weight = (float) fruitsList.stream().mapToDouble(Fruit::getWeight).sum();
        return weight;
    }

    public List<T> getFruitsList() {
        return fruitsList;
    }

    public void merge(Box<T> off) {
        fruitsList.addAll(off.getFruitsList());
        off.getFruitsList().clear();
    }

    public boolean compare(Box<?> box) {
        return getWeight() == box.getWeight();
    }
}
