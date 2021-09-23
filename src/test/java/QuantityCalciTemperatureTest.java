import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityCalciTemperatureTest {
    //Fahrenheit
    @Test
    public void given0Tonand0Tone_ShouldReturnEqual() {
        QuantityCalci fahrenheit1 = new QuantityCalci(Unit.TONNE, 0.0);
        QuantityCalci fahrenheit2 = new QuantityCalci(Unit.TONNE, 0.0);
        Assertions.assertEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void given0Tonand1Ton_ShouldReturnNotEqual() {
        QuantityCalci fahrenheit1 = new QuantityCalci(Unit.TONNE, 0.0);
        QuantityCalci fahrenheit2 = new QuantityCalci(Unit.TONNE, 1.0);
        Assertions.assertNotEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void givenNullTonand1Ton_ShouldReturnNotEqual() {
        QuantityCalci fahrenheit1 = null;
        QuantityCalci fahrenheit2 = new QuantityCalci(Unit.TONNE, 1.0);
        Assertions.assertNotEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void givenType0Tonand1Ton_ShouldReturnEqual() {
        QuantityCalci fahrenheit1 = new QuantityCalci(Unit.TONNE, 0.0);
        QuantityCalci fahrenheit2 = new QuantityCalci(Unit.TONNE, 1.0);
        Assertions.assertEquals(fahrenheit1.getClass(), fahrenheit2.getClass());
    }

    @Test
    public void givenReference0Tonand0Ton_ShouldReturnNotEqual() {
        QuantityCalci fahrenheit1 = new QuantityCalci(Unit.TONNE, 0.0);
        QuantityCalci fahrenheit2 = new QuantityCalci(Unit.GALLON, 0.0);
        Assertions.assertNotSame(fahrenheit1, fahrenheit2);
    }

    @Test
    public void givenEquality0Tonand0Ton_ShouldReturnEqual() {
        QuantityCalci fahrenheit1 = new QuantityCalci(Unit.TONNE, 1.0);
        double fahrenheitOne = fahrenheit1.getValue();
        QuantityCalci fahrenheit2 = new QuantityCalci(Unit.TONNE, 1.0);
        double fahrenheitTwo = fahrenheit2.getValue();
        Assertions.assertEquals(fahrenheitOne, fahrenheitTwo);
    }

    @Test
    public void given1Tonneand1Kilogram_WhenCompared_ShouldReturnEqual() {
        QuantityCalci fahrenheit1 = new QuantityCalci(Unit.FAHRENHEIT,212.0);
        QuantityCalci celsius1 = new QuantityCalci(Unit.CELSIUS,100.0);
        boolean compareCheck = QuantityCalci.compare(fahrenheit1, celsius1);
        Assertions.assertTrue(compareCheck);
    }
}
