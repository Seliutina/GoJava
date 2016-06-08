package Module04.Shapes;


public abstract class ShapeCalculator implements Shape {

    public static void main(String[] args) {
       Circle circle = new Circle();
        System.out.println(circle.calculateArea());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.calculateArea());

       Triangle triangle = new Triangle();
        System.out.println(triangle.calculateArea());

    }
}
