import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MeasurementCalciTemperatureTest {
    //Fahrenheit
    @Test
    public void given0Fahrenheitand0Fahrenheit_ShouldReturnEqual() {
        MeasurementCalci fahrenheit1 = new MeasurementCalci(Unit.FAHRENHEIT, 0.0);
        MeasurementCalci fahrenheit2 = new MeasurementCalci(Unit.FAHRENHEIT, 0.0);
        Assertions.assertEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void given0Fahrenheitand1Fahrenheit_ShouldReturnNotEqual() {
        MeasurementCalci fahrenheit1 = new MeasurementCalci(Unit.FAHRENHEIT, 0.0);
        MeasurementCalci fahrenheit2 = new MeasurementCalci(Unit.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void givenNullFahrenheitand1Fahrenheit_ShouldReturnNotEqual() {
        MeasurementCalci fahrenheit1 = null;
        MeasurementCalci fahrenheit2 = new MeasurementCalci(Unit.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void givenType0Fahrenheitand1Fahrenheit_ShouldReturnEqual() {
        MeasurementCalci fahrenheit1 = new MeasurementCalci(Unit.FAHRENHEIT, 0.0);
        MeasurementCalci fahrenheit2 = new MeasurementCalci(Unit.FAHRENHEIT, 1.0);
        Assertions.assertEquals(fahrenheit1.getClass(), fahrenheit2.getClass());
    }

    @Test
    public void givenReference0Fahrenheitand0Fahrenheit_ShouldReturnNotEqual() {
        MeasurementCalci fahrenheit1 = new MeasurementCalci(Unit.FAHRENHEIT, 0.0);
        MeasurementCalci fahrenheit2 = new MeasurementCalci(Unit.FAHRENHEIT, 0.0);
        Assertions.assertNotSame(fahrenheit1, fahrenheit2);
    }

    @Test
    public void givenEquality0Fahrenheitand0Fahrenheit_ShouldReturnEqual() {
        MeasurementCalci fahrenheit1 = new MeasurementCalci(Unit.FAHRENHEIT, 1.0);
        double fahrenheitOne = fahrenheit1.getValue();
        MeasurementCalci fahrenheit2 = new MeasurementCalci(Unit.FAHRENHEIT, 1.0);
        double fahrenheitTwo = fahrenheit2.getValue();
        Assertions.assertEquals(fahrenheitOne, fahrenheitTwo);
    }

    @Test
    public void given212Fahrenheit100Celsius_WhenCompared_ShouldReturnEqual() {
        MeasurementCalci fahrenheit1 = new MeasurementCalci(Unit.FAHRENHEIT,212.0);
        MeasurementCalci celsius1 = new MeasurementCalci(Unit.CELSIUS,100.0);
        boolean compareCheck = MeasurementCalci.compare(fahrenheit1, celsius1);
        Assertions.assertTrue(compareCheck);
    }

    //Celsius
    @Test
    public void given0Celsiusand0Celsius_ShouldReturnEqual() {
        MeasurementCalci celsius1 = new MeasurementCalci(Unit.CELSIUS, 0.0);
        MeasurementCalci celsius2 = new MeasurementCalci(Unit.CELSIUS, 0.0);
        Assertions.assertEquals(celsius1, celsius2);
    }

    @Test
    public void given0Celsiusand1Celsius_ShouldReturnNotEqual() {
        MeasurementCalci celsius1 = new MeasurementCalci(Unit.CELSIUS, 0.0);
        MeasurementCalci celsius2 = new MeasurementCalci(Unit.CELSIUS, 1.0);
        Assertions.assertNotEquals(celsius1, celsius2);
    }

    @Test
    public void givenNullCelsiusand1Celsius_ShouldReturnNotEqual() {
        MeasurementCalci celsius1 = null;
        MeasurementCalci celsius2 = new MeasurementCalci(Unit.CELSIUS, 1.0);
        Assertions.assertNotEquals(celsius1, celsius2);
    }

    @Test
    public void givenType0Celsiusand1Celsius_ShouldReturnEqual() {
        MeasurementCalci celsius1 = new MeasurementCalci(Unit.CELSIUS, 0.0);
        MeasurementCalci celsius2 = new MeasurementCalci(Unit.CELSIUS, 1.0);
        Assertions.assertEquals(celsius1.getClass(), celsius2.getClass());
    }

    @Test
    public void givenReference0Celsiusand0Celsius_ShouldReturnNotEqual() {
        MeasurementCalci celsius1 = new MeasurementCalci(Unit.CELSIUS, 0.0);
        MeasurementCalci celsius2 = new MeasurementCalci(Unit.CELSIUS, 0.0);
        Assertions.assertNotSame(celsius1, celsius2);
    }

    @Test
    public void givenEquality0Celsiusand0Celsius_ShouldReturnEqual() {
        MeasurementCalci celsius1 = new MeasurementCalci(Unit.CELSIUS, 1.0);
        double celsiusOne = celsius1.getValue();
        MeasurementCalci celsius2 = new MeasurementCalci(Unit.CELSIUS, 1.0);
        double celsiusTwo = celsius2.getValue();
        Assertions.assertEquals(celsiusOne, celsiusTwo);
    }
}
