package junit.adavancedproblem.temperatureconverter;



import static org.junit.jupiter.api.Assertions.*;

import junit.adancedproblem.temperatureconverter.TemperatureConverter;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(77.0, converter.celsiusToFahrenheit(25), "25°C should equal 77°F");
        assertEquals(32.0, converter.celsiusToFahrenheit(0), "0°C should equal 32°F");
        assertEquals(-40.0, converter.celsiusToFahrenheit(-40), "-40°C should equal -40°F");
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(25.0, converter.fahrenheitToCelsius(77), "77°F should equal 25°C");
        assertEquals(0.0, converter.fahrenheitToCelsius(32), "32°F should equal 0°C");
        assertEquals(-40.0, converter.fahrenheitToCelsius(-40), "-40°F should equal -40°C");
    }
}