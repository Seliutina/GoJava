package Module04.Shapes;

public class Rectangle implements Shapes {
    int a, b;

    public static double count(int a, int b) {
        double Area = a * b;
        return Area;
    }

    @Override
    public double count() {
        return 120;
    }
}
