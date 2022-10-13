package home_work_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GeometricFigure[] array ={new Triangle(),new Circle(),new Square()};
        System.out.println("The sum of the areas of geometric shapes: "+summArea(array));
    }
    public static double summArea(GeometricFigure[] array){
        double sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i].area();}

        return sum;
    }
}
