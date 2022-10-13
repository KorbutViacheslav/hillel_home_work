package home_work_6;

public class Square implements GeometricFigure{
    private double a=5;
    public Square(){
        area();
    }
    @Override
    public double area() {
        return a*a;
    }
}
