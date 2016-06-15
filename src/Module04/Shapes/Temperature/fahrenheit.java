package Module04.Shapes.Temperature;


import com.sun.istack.internal.NotNull;

import java.util.InputMismatchException;
import java.util.Scanner;

public class fahrenheit implements temperature {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter Celcius degree");

        try {
                double celcius1 = scanner.nextDouble();
                double convertTemperature = celcius1 * 1.8 + 32;
                System.out.println("Fahrenheit degree equals " + convertTemperature);

            } catch (InputMismatchException ex) {
                System.out.println("Please, enter the number");
            } finally {
            final Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please, enter Celcius degree");
                double celcius1 = scanner1.nextDouble();
                double convertTemperature = celcius1 * 1.8 + 32;
                System.out.println("Fahrenheit degree equals " + convertTemperature);
            }
    }

    @Override
    public double convertTemperature() {
        final Scanner scanner = new Scanner(System.in);
        double celcius1 = scanner.nextDouble();
        return celcius1 * 1.8 + 32;
    }
}
