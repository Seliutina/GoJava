package Module04.Shapes;




public class calculateArea extends ShapeCalculator {
        public double getCalculateArea() {
                return calculateArea;
        }

        public void setCalculateArea(double calculateArea) {
                this.calculateArea = calculateArea;
        }

        double calculateArea;


        @Override
        public double calculateArea() {
                return 200;
        }
}


