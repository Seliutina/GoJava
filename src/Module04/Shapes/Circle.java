package Module04.Shapes;


public class Circle implements Shape {
    public static final double PI = 3.14;
    protected double r;

    protected double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


    public double calculateArea() {
        return PI*r*r;
    }
}
