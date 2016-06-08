package Module04.Shapes;


public abstract class shapeCalculator implements shape {

    public static void main(String[] args) {
       circle circle = new circle();
        System.out.println(circle.calculateArea());

        rectangle rectangle = new rectangle();
        System.out.println(rectangle.calculateArea());

       triangle triangle = new triangle();
        System.out.println(triangle.calculateArea());

    }
}
