package Module04.Shapes.Temperature;

import java.util.Scanner;

public class celsius implements temperature {

    @Override
    public double convertTemperature() {
        final Scanner scanner = new Scanner(System.in);
        double fahrenheitToCelsius = scanner.nextDouble();
            return (fahrenheitToCelsius - 32) / 1.8;
    }
}