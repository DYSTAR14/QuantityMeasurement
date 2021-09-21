import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    //Feet
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullFeetAnd0Feet_ShouldReturnNotEqual() {
        Feet feet1 = null;
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenType0FeetAnd1_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    public void givenReference0FeetAnd0Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test
    public void givenEquality0FeetAnd0Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        double feetOne = feet1.getValue();
        Feet feet2 = new Feet(0.0);
        double feetTwo = feet2.getValue();
        Assertions.assertEquals(feetOne, feetTwo);
    }

    @Test
    public void givenCompare1FeetAnd12Inch_ShouldReturnEqual() {
        Feet feet1 = new Feet(1.0);
        double actual = feet1.getFeetToInch();
        double expected = 12;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void givenCompare2FeetAnd12Inch_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(2.0);
        double actual = feet1.getFeetToInch();
        double expected = 12;
        Assertions.assertNotEquals(actual, expected);
    }

    @Test
    public void givenCompare3FeetAnd1Yard_ShouldReturnEqual() {
        Feet feet1 = new Feet(3.0);
        double actual = feet1.getFeetToYard();
        double expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void givenCompare1FeetAnd1Yard_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(1.0);
        double actual = feet1.getFeetToYard();
        double expected = 1;
        Assertions.assertNotEquals(actual, expected);
    }


    //Inch
    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenNullInchAnd0Inch_ShouldReturnNotEqual() {
        Inch inch1 = null;
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenType0InchAnd1Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    public void givenReference0InchAnd0Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertNotSame(inch1, inch2);
    }

    @Test
    public void givenEquality0InchAnd0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        double inchOne = inch1.getValue();
        Inch inch2 = new Inch(0.0);
        double inchTwo = inch2.getValue();
        Assertions.assertEquals(inchOne, inchTwo);
    }

    @Test
    public void givenCompare12InchAnd1Feet_ShouldReturnEqual() {
        Inch inch1 = new Inch(12.0);
        double actual = inch1.getInchToFeet();
        double expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void givenCompare12InchAnd1Feet_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(24.0);
        double actual = inch1.getInchToFeet();
        double expected = 1;
        Assertions.assertNotEquals(actual, expected);
    }

    @Test
    public void givenCompare36InchAnd1Yard_ShouldReturnEqual() {
        Inch inch1 = new Inch(36.0);
        double actual = inch1.getInchToYard();
        double expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void givenCompare1InchAnd1Yard_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(1.0);
        double actual = inch1.getInchToYard();
        double expected = 1;
        Assertions.assertNotEquals(actual, expected);
    }

    //Yard
    @Test
    public void given0Yardand0Yard_ShouldReturnEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = new Yard(0.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    public void given0Yardand1Yard_ShouldReturnNotEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = new Yard(1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenNullYardAnd0Yard_ShouldReturnNotEqual() {
        Yard yard1 = null;
        Yard yard2 = new Yard(1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenType0YardAnd1Yard_ShouldReturnEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = new Yard(1.0);
        Assertions.assertEquals(yard1.getClass(), yard2.getClass());
    }

    @Test
    public void givenReference0YardAnd0Yard_ShouldReturnNotEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = new Yard(0.0);
        Assertions.assertNotSame(yard1, yard2);
    }

    @Test
    public void givenEquality0YardAnd0Yard_ShouldReturnEqual() {
        Yard yard1 = new Yard(0.0);
        double yardOne = yard1.getValue();
        Yard yard2 = new Yard(0.0);
        double yardTwo = yard2.getValue();
        Assertions.assertEquals(yardOne, yardTwo);
    }

    @Test
    public void givenCompare1YardAnd3Feet_ShouldReturnEqual() {
        Yard yard = new Yard(1.0);
        double actual = yard.getYardToFeet();
        double expected = 3;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void givenCompare1YardAnd2Feet_ShouldReturnNotEqual() {
        Yard yard = new Yard(1.0);
        double actual = yard.getYardToFeet();
        double expected = 2;
        Assertions.assertNotEquals(actual, expected);
    }

    @Test
    public void givenCompare1YardAnd36Inch_ShouldReturnEqual() {
        Yard yard = new Yard(1.0);
        double actual = yard.getYardToInch();
        double expected = 36;
        Assertions.assertEquals(actual, expected);
    }


}
