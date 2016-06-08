package Module04.Shapes;


public class rectangle implements shape {
    protected double side11;
    protected double side22;


    public double getSide11() {
        return side11;
    }

    public void setSide11(double side11) {
        this.side11 = side11;
    }



    public double getSide22() {
        return side22;
    }

    public void setSide22(double side22) {
        this.side22 = side22;
    }


   public double calculateArea()
   {
        return side11*side22;
    }
}

