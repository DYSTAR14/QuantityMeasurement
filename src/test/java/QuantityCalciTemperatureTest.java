import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityCalciTemperatureTest {
    //Fahrenheit
    @Test
    public void given0Fahrenheitand0Fahrenheit_ShouldReturnEqual() {
        QuantityCalci fahrenheit1 = new QuantityCalci(Unit.FAHRENHEIT, 0.0);
        QuantityCalci fahrenheit2 = new QuantityCalci(Unit.FAHRENHEIT, 0.0);
        Assertions.assertEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void given0Fahrenheitand1Fahrenheit_ShouldReturnNotEqual() {
        QuantityCalci fahrenheit1 = new QuantityCalci(Unit.FAHRENHEIT, 0.0);
        QuantityCalci fahrenheit2 = new QuantityCalci(Unit.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void givenNullFahrenheitand1Fahrenheit_ShouldReturnNotEqual() {
        QuantityCalci fahrenheit1 = null;
        QuantityCalci fahrenheit2 = new QuantityCalci(Unit.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void givenType0Fahrenheitand1Fahrenheit_ShouldReturnEqual() {
        QuantityCalci fahrenheit1 = new QuantityCalci(Unit.FAHRENHEIT, 0.0);
        QuantityCalci fahrenheit2 = new QuantityCalci(Unit.FAHRENHEIT, 1.0);
        Assertions.assertEquals(fahrenheit1.getClass(), fahrenheit2.getClass());
    }

    @Test
    public void givenReference0Fahrenheitand0Fahrenheit_ShouldReturnNotEqual() {
        QuantityCalci fahrenheit1 = new QuantityCalci(Unit.FAHRENHEIT, 0.0);
        QuantityCalci fahrenheit2 = new QuantityCalci(Unit.FAHRENHEIT, 0.0);
        Assertions.assertNotSame(fahrenheit1, fahrenheit2);
    }

    @Test
    public void givenEquality0Fahrenheitand0Fahrenheit_ShouldReturnEqual() {
        QuantityCalci fahrenheit1 = new QuantityCalci(Unit.FAHRENHEIT, 1.0);
        double fahrenheitOne = fahrenheit1.getValue();
        QuantityCalci fahrenheit2 = new QuantityCalci(Unit.FAHRENHEIT, 1.0);
        double fahrenheitTwo = fahrenheit2.getValue();
        Assertions.assertEquals(fahrenheitOne, fahrenheitTwo);
    }

    @Test
    public void given212Fahrenheit100Celsius_WhenCompared_ShouldReturnEqual() {
        QuantityCalci fahrenheit1 = new QuantityCalci(Unit.FAHRENHEIT,212.0);
        QuantityCalci celsius1 = new QuantityCalci(Unit.CELSIUS,100.0);
        boolean compareCheck = QuantityCalci.compare(fahrenheit1, celsius1);
        Assertions.assertTrue(compareCheck);
    }

    //Celsius
    @Test
    public void given0Celsiusand0Celsius_ShouldReturnEqual() {
        QuantityCalci celsius1 = new QuantityCalci(Unit.CELSIUS, 0.0);
        QuantityCalci celsius2 = new QuantityCalci(Unit.CELSIUS, 0.0);
        Assertions.assertEquals(celsius1, celsius2);
    }

    @Test
    public void given0Celsiusand1Celsius_ShouldReturnNotEqual() {
        QuantityCalci celsius1 = new QuantityCalci(Unit.CELSIUS, 0.0);
        QuantityCalci celsius2 = new QuantityCalci(Unit.CELSIUS, 1.0);
        Assertions.assertNotEquals(celsius1, celsius2);
    }

    @Test
    public void givenNullCelsiusand1Celsius_ShouldReturnNotEqual() {
        QuantityCalci celsius1 = null;
        QuantityCalci celsius2 = new QuantityCalci(Unit.CELSIUS, 1.0);
        Assertions.assertNotEquals(celsius1, celsius2);
    }

    @Test
    public void givenType0Celsiusand1Celsius_ShouldReturnEqual() {
        QuantityCalci celsius1 = new QuantityCalci(Unit.CELSIUS, 0.0);
        QuantityCalci celsius2 = new QuantityCalci(Unit.CELSIUS, 1.0);
        Assertions.assertEquals(celsius1.getClass(), celsius2.getClass());
    }

    @Test
    public void givenReference0Celsiusand0Celsius_ShouldReturnNotEqual() {
        QuantityCalci celsius1 = new QuantityCalci(Unit.CELSIUS, 0.0);
        QuantityCalci celsius2 = new QuantityCalci(Unit.CELSIUS, 0.0);
        Assertions.assertNotSame(celsius1, celsius2);
    }

    @Test
    public void givenEquality0Celsiusand0Celsius_ShouldReturnEqual() {
        QuantityCalci celsius1 = new QuantityCalci(Unit.CELSIUS, 1.0);
        double celsiusOne = celsius1.getValue();
        QuantityCalci celsius2 = new QuantityCalci(Unit.CELSIUS, 1.0);
        double celsiusTwo = celsius2.getValue();
        Assertions.assertEquals(celsiusOne, celsiusTwo);
    }
}
