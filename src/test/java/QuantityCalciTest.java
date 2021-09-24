import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityCalciTest {
    @Test
    public void given1Feetand12Inch_WhenCompared_ShouldReturnNotEqual() {
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 1.0);
        QuantityCalci gallon1 = new QuantityCalci(Unit.GALLON, 12.0);
        boolean compareCheck = QuantityCalci.compare(feet1, gallon1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void givenAdd2InchAnd2_54_CentimeterShouldSuccess(){
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 2.0);
        QuantityCalci gallon1 = new QuantityCalci(Unit.GALLON, 2.54);
        Double actual = QuantityCalci.add(feet1,gallon1);
        Double expected = 3.0;
        Assertions.assertNotEquals(actual,expected);
    }
}
