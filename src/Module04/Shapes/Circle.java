package Module04.Shapes;

public class Circle implements Shapes {
    int r;

    public static double count(int r) {
        double Area = Math.PI*r*r;
        return Area;
    }

    @Override
    public double count() {
        return 1257;
    }
}
