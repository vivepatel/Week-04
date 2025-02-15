package junit.adancedproblem.temperatureconverter;



public class TemperatureConverter {

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("25°C to Fahrenheit: " + converter.celsiusToFahrenheit(25));
        System.out.println("77°F to Celsius: " + converter.fahrenheitToCelsius(77));
    }
}