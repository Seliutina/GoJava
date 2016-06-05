package Module04.Shapes;

public class Triangle implements Shapes {
    int a, b, c;

    public static double count (int a, int b)
    {
        double Area = (a*b)/2;
        return Area;
    }

    boolean existence()
    {
        boolean ex = true;
        if((a+b)<c && (a+c)<b && (b+c)<a)
            ex = false;
        return ex;
    }

    @Override
    public double count() {
        return 60;
    }
}
