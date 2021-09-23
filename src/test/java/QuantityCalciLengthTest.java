import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityCalciLengthTest {
    //Feet
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 0.0);
        QuantityCalci feet2 = new QuantityCalci(Unit.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 0.0);
        QuantityCalci feet2 = new QuantityCalci(Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullFeetAnd0Feet_ShouldReturnNotEqual() {
        QuantityCalci feet1 = null;
        QuantityCalci feet2 = new QuantityCalci(Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenType0FeetAnd1_ShouldReturnEqual() {
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 0.0);
        QuantityCalci feet2 = new QuantityCalci(Unit.FEET, 1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    public void givenReference0FeetAnd0Feet_ShouldReturnNotEqual() {
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 0.0);
        QuantityCalci feet2 = new QuantityCalci(Unit.FEET, 0.0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test
    public void givenEquality0FeetAnd0Feet_ShouldReturnEqual() {
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 0.0);
        double feetOne = feet1.getValue();
        QuantityCalci feet2 = new QuantityCalci(Unit.FEET, 0.0);
        double feetTwo = feet2.getValue();
        Assertions.assertEquals(feetOne, feetTwo);
    }

    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqual() {
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 1.0);
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 1.0);
        Assertions.assertNotEquals(feet1, inch1);
    }

    @Test
    public void given1Feetand1Feet_WhenCompared_ShouldReturnEqualQuantityCali() {
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 1.0);
        QuantityCalci feet2 = new QuantityCalci(Unit.FEET, 1.0);
        boolean compareCheck = QuantityCalci.compare(feet1, feet2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Feetand0Inch_WhenCompared_ShouldReturnEqual() {
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 0.0);
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 0.0);
        boolean compareCheck = QuantityCalci.compare(feet1, inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand12Inch_WhenCompared_ShouldReturnEqual() {
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 1.0);
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 12.0);
        boolean compareCheck = QuantityCalci.compare(feet1, inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Inch_WhenCompared_ShouldReturnNotEqual() {
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 1.0);
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 1.0);
        boolean compareCheck = QuantityCalci.compare(feet1, inch1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given3Feetand1Yard_WhenCompared_ShouldReturnEqual() {
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 3.0);
        QuantityCalci yard1 = new QuantityCalci(Unit.YARD, 1.0);
        boolean compareCheck = QuantityCalci.compare(feet1, yard1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Yard_WhenCompared_ShouldReturnNotEqual() {
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 1.0);
        QuantityCalci yard1 = new QuantityCalci(Unit.YARD, 1.0);
        boolean compareCheck = QuantityCalci.compare(feet1, yard1);
        Assertions.assertFalse(compareCheck);
    }

    //Inch
    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 0.0);
        QuantityCalci inch2 = new QuantityCalci(Unit.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 0.0);
        QuantityCalci inch2 = new QuantityCalci(Unit.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenNullInchAnd0Inch_ShouldReturnNotEqual() {
        QuantityCalci inch1 = null;
        QuantityCalci inch2 = new QuantityCalci(Unit.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenType0InchAnd1Inch_ShouldReturnEqual() {
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 0.0);
        QuantityCalci inch2 = new QuantityCalci(Unit.INCH, 1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    public void givenReference0InchAnd0Inch_ShouldReturnNotEqual() {
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 0.0);
        QuantityCalci inch2 = new QuantityCalci(Unit.INCH, 0.0);
        Assertions.assertNotSame(inch1, inch2);
    }

    @Test
    public void givenEquality0InchAnd0Inch_ShouldReturnEqual() {
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 0.0);
        double inchOne = inch1.getValue();
        QuantityCalci inch2 = new QuantityCalci(Unit.INCH, 0.0);
        double inchTwo = inch2.getValue();
        Assertions.assertEquals(inchOne, inchTwo);
    }

    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqual() {
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 1.0);
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 1.0);
        Assertions.assertNotEquals(inch1, feet1);
    }

    @Test
    public void given1Inchand1Inch_WhenCompared_ShouldReturnEqualQuantityCali() {
        QuantityCalci inch1 = new QuantityCalci(Unit.FEET, 1.0);
        QuantityCalci inch2 = new QuantityCalci(Unit.FEET, 1.0);
        boolean compareCheck = QuantityCalci.compare(inch1, inch2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Inchand0Feet_WhenCompared_ShouldReturnEqual() {
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 0.0);
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 0.0);
        boolean compareCheck = QuantityCalci.compare(inch1, feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given12Inchand1Feet_WhenCompared_ShouldReturnEqual() {
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 12.0);
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 1.0);
        boolean compareCheck = QuantityCalci.compare(inch1, feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1Yard_WhenCompared_ShouldReturnNotEqual() {
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 1.0);
        QuantityCalci yard1 = new QuantityCalci(Unit.YARD, 1.0);
        boolean compareCheck = QuantityCalci.compare(inch1, yard1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given36Inchand1Yard_WhenCompared_ShouldReturnEqual() {
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 36.0);
        QuantityCalci yard1 = new QuantityCalci(Unit.YARD, 1.0);
        boolean compareCheck = QuantityCalci.compare(inch1, yard1);
        Assertions.assertTrue(compareCheck);
    }

    //Yard
    @Test
    public void given0Yardand0Yard_ShouldReturnEqual() {
        QuantityCalci yard1 = new QuantityCalci(Unit.YARD, 0.0);
        QuantityCalci yard2 = new QuantityCalci(Unit.YARD, 0.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    public void given0Yardand1Yard_ShouldReturnNotEqual() {
        QuantityCalci yard1 = new QuantityCalci(Unit.YARD, 0.0);
        QuantityCalci yard2 = new QuantityCalci(Unit.YARD, 1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenNullYardAnd0Yard_ShouldReturnNotEqual() {
        QuantityCalci yard1 = null;
        QuantityCalci yard2 = new QuantityCalci(Unit.YARD, 1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenType0YardAnd1Yard_ShouldReturnEqual() {
        QuantityCalci yard1 = new QuantityCalci(Unit.YARD, 0.0);
        QuantityCalci yard2 = new QuantityCalci(Unit.YARD, 1.0);
        Assertions.assertEquals(yard1.getClass(), yard2.getClass());
    }

    @Test
    public void givenReference0YardAnd0Yard_ShouldReturnNotEqual() {
        QuantityCalci yard1 = new QuantityCalci(Unit.YARD, 0.0);
        QuantityCalci yard2 = new QuantityCalci(Unit.YARD, 0.0);
        Assertions.assertNotSame(yard1, yard2);
    }

    @Test
    public void givenEquality0YardAnd0Yard_ShouldReturnEqual() {
        QuantityCalci yard1 = new QuantityCalci(Unit.YARD, 0.0);
        double yardOne = yard1.getValue();
        QuantityCalci yard2 = new QuantityCalci(Unit.YARD, 0.0);
        double yardTwo = yard2.getValue();
        Assertions.assertEquals(yardOne, yardTwo);
    }

    @Test
    public void givenCompare1YardAnd3Feet_ShouldReturnEqual() {
        QuantityCalci yard1 = new QuantityCalci(Unit.YARD, 1.0);
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 3.0);
        boolean compareCheck = QuantityCalci.compare(yard1, feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void givenCompare1YardAnd2Feet_ShouldReturnNotEqual() {
        QuantityCalci yard1 = new QuantityCalci(Unit.YARD, 1.0);
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 2.0);
        boolean compareCheck = QuantityCalci.compare(yard1, feet1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void givenCompare1YardAnd36Inch_ShouldReturnEqual() {
        QuantityCalci yard1 = new QuantityCalci(Unit.YARD, 1.0);
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 36.0);
        boolean compareCheck = QuantityCalci.compare(yard1, inch1);
        Assertions.assertTrue(compareCheck);
    }

    //Centimeter
    @Test
    public void given0Centimeterand0Centimeter_ShouldReturnEqual() {
        QuantityCalci centimeter1 = new QuantityCalci(Unit.CENTIMETER, 0.0);
        QuantityCalci centimeter2 = new QuantityCalci(Unit.CENTIMETER, 0.0);
        Assertions.assertEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0Centimeterand1Centimeter_ShouldReturnNotEqual() {
        QuantityCalci centimeter1 = new QuantityCalci(Unit.CENTIMETER, 0.0);
        QuantityCalci centimeter2 = new QuantityCalci(Unit.CENTIMETER, 1.0);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void givenNullCentimeterAnd0Centimeter_ShouldReturnNotEqual() {
        QuantityCalci centimeter1 = null;
        QuantityCalci centimeter2 = new QuantityCalci(Unit.CENTIMETER, 1.0);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void givenType0CentimeterAnd1Centimeter_ShouldReturnEqual() {
        QuantityCalci centimeter1 = new QuantityCalci(Unit.CENTIMETER, 0.0);
        QuantityCalci centimeter2 = new QuantityCalci(Unit.CENTIMETER, 1.0);
        Assertions.assertEquals(centimeter1.getClass(), centimeter2.getClass());
    }

    @Test
    public void givenReference0CentimeterAnd0Centimeter_ShouldReturnNotEqual() {
        QuantityCalci centimeter1 = new QuantityCalci(Unit.CENTIMETER, 0.0);
        QuantityCalci centimeter2 = new QuantityCalci(Unit.CENTIMETER, 0.0);
        Assertions.assertNotSame(centimeter1, centimeter2);
    }

    @Test
    public void givenEquality0CentimeterAnd0Centimeter_ShouldReturnEqual() {
        QuantityCalci centimeter1 = new QuantityCalci(Unit.CENTIMETER, 0.0);
        double yardOne = centimeter1.getValue();
        QuantityCalci centimeter2 = new QuantityCalci(Unit.CENTIMETER, 0.0);
        double yardTwo = centimeter2.getValue();
        Assertions.assertEquals(yardOne, yardTwo);
    }

    @Test
    public void givenCompare30_48CentimeterAnd1Feet_ShouldReturnEqual() {
        QuantityCalci centimeter1 = new QuantityCalci(Unit.CENTIMETER, 30.48);
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 1.0);
        boolean compareCheck = QuantityCalci.compare(centimeter1, feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void givenCompare1CentimeterAnd1Feet_ShouldReturnNotEqual() {
        QuantityCalci centimeter1 = new QuantityCalci(Unit.CENTIMETER, 1.0);
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 1.0);
        boolean compareCheck = QuantityCalci.compare(centimeter1, feet1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void givenCompare91_44CentimeterAnd1Yard_ShouldReturnEqual() {
        QuantityCalci centimeter1 = new QuantityCalci(Unit.CENTIMETER, 91.44);
        QuantityCalci yard1 = new QuantityCalci(Unit.YARD, 1.0);
        boolean compareCheck = QuantityCalci.compare(centimeter1, yard1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void givenCompare1CentimeterAnd36Inch_ShouldReturnEqual() {
        QuantityCalci centimeter1 = new QuantityCalci(Unit.CENTIMETER, 2.54);
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 1.0);
        boolean compareCheck = QuantityCalci.compare(centimeter1, inch1);
        Assertions.assertTrue(compareCheck);
    }

    //Addition of Feet,Inch,Yard get in Inch
    @Test
    public void givenAdd2InchAnd2Inch_ShouldSuccess(){
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 2.0);
        QuantityCalci inch2 = new QuantityCalci(Unit.INCH, 2.0);
        Double actual = QuantityCalci.add(inch1,inch2);
        Double expected = 4.0;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void givenAdd1FeetAnd2Inch_ShouldSuccess(){
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 1.0);
        QuantityCalci inch2 = new QuantityCalci(Unit.INCH, 2.0);
        Double actual = QuantityCalci.add(inch2,feet1);
        Double expected = 14.0;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void givenAdd2FeetAnd2Feet_ShouldSuccess(){
        QuantityCalci feet1 = new QuantityCalci(Unit.FEET, 1.0);
        QuantityCalci feet2 = new QuantityCalci(Unit.FEET, 1.0);
        Double actual = QuantityCalci.add(feet1,feet2);
        Double expected = 24.0;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void givenAdd2InchAnd2_54_CentimeterShouldSuccess(){
        QuantityCalci inch1 = new QuantityCalci(Unit.INCH, 2.0);
        QuantityCalci inch2 = new QuantityCalci(Unit.CENTIMETER, 2.54);
        Double actual = QuantityCalci.add(inch1,inch2);
        Double expected = 3.0;
        Assertions.assertEquals(actual,expected);
    }
}
