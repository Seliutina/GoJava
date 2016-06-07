package Module04.Shapes;


public class Triangle extends ShapeCalculator{
    protected double side1;
    protected double side2;


    public void setSide2(double side2) {
        this.side2 = side2;
    }


    
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    @Override
    public double calculateArea() {
        return side1*side2/2;
    }
}
