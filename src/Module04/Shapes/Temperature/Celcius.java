package Module04.Shapes.Temperature;



import java.util.InputMismatchException;
import java.util.Scanner;

public class celcius implements temperature {

    @Override
    public double convertTemperature() {
        final Scanner scanner = new Scanner(System.in);
        double fahrenheitToCelcius = scanner.nextDouble();
            return (fahrenheitToCelcius - 32) / 1.8;
    }
}