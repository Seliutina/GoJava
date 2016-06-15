package Module04.Shapes.Temperature;


import java.util.Scanner;

public abstract class temperatureConverter {
    public static void main(String[] args) {
        try {
            fahrenheit fahrenheit = new fahrenheit();
            System.out.println(fahrenheit.convertTemperature());
            celcius celcius = new celcius();
            System.out.println(celcius.convertTemperature());
        } catch (NumberFormatException ex){
        System.out.println("Wrong data");}
    }

}