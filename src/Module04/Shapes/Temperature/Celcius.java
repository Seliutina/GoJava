package Module04.Shapes.Temperature;

import java.util.Scanner;

public class Celcius {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter Fahrenheit degree");
        double Fahrenheit = scanner.nextDouble();
        double Celcius = (Fahrenheit - 32) / 1.8;
        System.out.println("Celcius degree equals " + Celcius);

        System.out.println("Please, enter Celcius degree");
        double Celcius1 = scanner.nextDouble();
        double Fahrenheit1 = Celcius1 * 1.8 + 32;
        System.out.println("Fahrenheit degree equals " + Fahrenheit1);

    }
}
