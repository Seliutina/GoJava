package Module04.Shapes;


public abstract class ShapeCalculator implements Shapes {
    public double calculateArea;

    public void setCalculateArea(double calculateArea) {
    }

    public double getCalculateArea() {
        return calculateArea();
    }


    public static void main(String[] args) {
       Shape circle = (Shape) new Circle();
        System.out.println(circle.calculateArea());

        Shape rectangle =(Shape) new Rectangle();
        System.out.println(rectangle.calculateArea());

        Shape triangle = (Shape) new Triangle();
        System.out.println(triangle.calculateArea());

    }
}
