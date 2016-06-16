package Module04.Shapes.Temperature;


import java.util.InputMismatchException;

public abstract class temperatureConverter {
    public static void main(String[] args) {
        fahrenheit celciusToFahrenheit = new fahrenheit();
        celcius fahrenheitToCelcius = new celcius();


        System.out.println("Please, enter Celcius temperature:");
        try {
            System.out.println("Fahrenheit temperature is " + celciusToFahrenheit.convertTemperature() + " Fahrenheit degrees");
        } catch (InputMismatchException ex){
            System.out.println("Please, enter Fahrenheit temperature in a number format");
        }
        System.out.println("Please, enter Fahrenheit temperature:");
        try {
            System.out.println("Celcius temperature is " + fahrenheitToCelcius.convertTemperature() + " Celcius degrees");
        } catch (InputMismatchException ex){
            System.out.println("Please, type Celcius temperature in a number format");
        }

    }
}