package Module04.Shapes;


public abstract class ShapeCalculator implements Shapes {
    public double Area;

    public void setArea(double Area) {
    }

    public double Area() {
        return Area();
    }


    public static void main(String[] args) {
       Circle circle = new Circle();
        System.out.println(circle.Area());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.Area());

       Triangle triangle = new Triangle();
        System.out.println(triangle.Area());

    }
}
