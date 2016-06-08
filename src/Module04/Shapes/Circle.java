package Module04.Shapes;


public class Circle extends ShapeCalculator{
    public static final double PI = 3.14;
    protected double r;

    protected double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


    @Override
    public double Area() {
        return PI*r*r;
    }
}
