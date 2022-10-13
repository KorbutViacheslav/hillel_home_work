package home_work_6;

public class Circle implements GeometricFigure{
    private final double p=3.14;
    private double r=5;
    public Circle(){
        area();
    }
    @Override
    public double area() {
        return p*(r*r);
    }
}
