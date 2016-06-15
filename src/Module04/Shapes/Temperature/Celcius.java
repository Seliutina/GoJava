package Module04.Shapes.Temperature;



import java.util.InputMismatchException;
import java.util.Scanner;

public class celcius implements temperature {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter Fahrenheit degree");

        try {
            final double fahrenheit = scanner.nextDouble();
            double convertTemperature = (fahrenheit - 32)/1.8;
            System.out.println("Celcius degree equals " + convertTemperature);
        } catch (InputMismatchException ex) {
            System.out.println("Please, type the number");
        }

    }

    @Override
    public double convertTemperature() {
        final Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        return (fahrenheit -32)/1.8;
    }
}
