package Module04.Shapes.Temperature;

import java.util.Scanner;

public class fahrenheit implements temperature {
    @Override
    public double convertTemperature() {
        final Scanner scanner = new Scanner(System.in);
        double celciusToFahrenheit = scanner.nextDouble();
            return celciusToFahrenheit * 1.8 + 32;
    }
}