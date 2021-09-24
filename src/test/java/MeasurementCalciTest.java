import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MeasurementCalciTest {
    @Test
    public void given1Feetand12Inch_WhenCompared_ShouldReturnNotEqual() {
        MeasurementCalci feet1 = new MeasurementCalci(Unit.FEET, 1.0);
        MeasurementCalci gallon1 = new MeasurementCalci(Unit.GALLON, 12.0);
        boolean compareCheck = MeasurementCalci.compare(feet1, gallon1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void givenAdd2InchAnd2_54_CentimeterShouldSuccess(){
        MeasurementCalci feet1 = new MeasurementCalci(Unit.FEET, 2.0);
        MeasurementCalci gallon1 = new MeasurementCalci(Unit.GALLON, 2.54);
        Double actual = MeasurementCalci.add(feet1,gallon1);
        Double expected = 3.0;
        Assertions.assertNotEquals(actual,expected);
    }
}
