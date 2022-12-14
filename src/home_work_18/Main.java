package home_work_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Box<Apple> appleBox=new Box<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.addAll(new Apple(),new Apple(),new Apple(),new Apple());

        Box<Orange> orangeBox=new Box<>();
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.addAll(new Orange());
        System.out.println(orangeBox.compare(appleBox));

        Box<Orange> orangeBox1=new Box<>();
        orangeBox1.addAll(new Orange(),new Orange(),new Orange());
        orangeBox.merge(orangeBox1);
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox.getFruitsList());


    }

    public static List<?> toList(Objects[] objects) {
        List<? extends Objects> list = new ArrayList<>(Arrays.asList(objects));
        return list;
    }
}
