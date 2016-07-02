package Module04.Shapes.Temperature;


import java.util.InputMismatchException;

public abstract class temperatureConverter {
    public static void main(String[] args) {
        fahrenheit celsiusToFahrenheit = new fahrenheit();
        celsius fahrenheitToCelcius = new celsius();


            System.out.println("Please, enter Celsius temperature:");
            try {
                System.out.println("Fahrenheit temperature is " + celsiusToFahrenheit.convertTemperature() + " Fahrenheit degrees");
            } catch (InputMismatchException ex) {
                System.out.println("Please, enter Fahrenheit temperature in a number format");
            }
            System.out.println("Please, enter Fahrenheit temperature:");
            try {
                System.out.println("Celsius temperature is " + fahrenheitToCelcius.convertTemperature() + " Celsius degrees");

            } catch (InputMismatchException ex) {
                System.out.println("Please, type Celsius temperature in a number format");
            }

        }
    }