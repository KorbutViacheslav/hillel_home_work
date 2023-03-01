package home_work_6;

public class Triangle implements GeometricFigure {
    private double a = 5;
    private double h = 6;
    private final double st = 0.5;

    public Triangle() {
        area();
    }

    @Override
    public double area() {
        return st * a * h;
    }
}
