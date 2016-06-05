package Module04.Shapes.Temperature;

public class Celcius {
    public static double FahrenheitToCelcius (double Fahrenheit){
        double Celcius = 0.0;
        Celcius = (Fahrenheit - 32) / 1.8;
        return Celcius;
    }

    public static double CelciusToFahrenheit (double Celcius){
        double Fahrenheit = 0.0;
        Fahrenheit = Celcius * 1.8 + 32;
        return Fahrenheit;
    }
}
