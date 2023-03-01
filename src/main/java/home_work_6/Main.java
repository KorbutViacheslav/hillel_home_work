package home_work_6;

public class Main {
    public static void main(String[] args) {
        GeometricFigure[] array = {new Triangle(), new Circle(), new Square()};
        System.out.println("The sum of the areas of geometric shapes: " + summArea(array));
    }

    public static double summArea(GeometricFigure[] array) {
        double sum = 0;
        for (GeometricFigure arrays : array) {
            sum += arrays.area();
        }
        return sum;
    }
}
