import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    //Feet
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullFeetAnd0Feet_ShouldReturnNotEqual() {
        Length feet1 = null;
        Length feet2 = new Length(Unit.FEET,1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenType0FeetAnd1_ShouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    public void givenReference0FeetAnd0Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,0.0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test
    public void givenEquality0FeetAnd0Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        double feetOne = feet1.getValue();
        Length feet2 = new Length(Unit.FEET,0.0);
        double feetTwo = feet2.getValue();
        Assertions.assertEquals(feetOne, feetTwo);
    }

    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET,1.0);
        Length inch1 = new Length(Unit.INCH,1.0);
        Assertions.assertNotEquals(feet1, inch1);
    }

    @Test
    public void given1Feetand1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Unit.FEET,1.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        boolean compareCheck = Length.compare(feet1,feet2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Feetand0Inch_WhenCompared_ShouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length inch1 = new Length(Unit.INCH,0.0);
        boolean compareCheck = Length.compare(feet1,inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand12Inch_WhenCompared_ShouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET,1.0);
        Length inch1 = new Length(Unit.INCH,12.0);
        boolean compareCheck = Length.compare(feet1,inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Inch_WhenCompared_ShouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET,1.0);
        Length inch1 = new Length(Unit.INCH,1.0);
        boolean compareCheck = Length.compare(feet1,inch1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given3Feetand1Yard_WhenCompared_ShouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET,3.0);
        Length yard1 = new Length(Unit.YARD,1.0);
        boolean compareCheck = Length.compare(feet1,yard1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Yard_WhenCompared_ShouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET,1.0);
        Length yard1 = new Length(Unit.YARD,1.0);
        boolean compareCheck = Length.compare(feet1,yard1);
        Assertions.assertFalse(compareCheck);
    }

    //Inch
    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenNullInchAnd0Inch_ShouldReturnNotEqual() {
        Length inch1 = null;
        Length inch2 = new Length(Unit.INCH,1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenType0InchAnd1Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    public void givenReference0InchAnd0Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,0.0);
        Assertions.assertNotSame(inch1, inch2);
    }

    @Test
    public void givenEquality0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        double inchOne = inch1.getValue();
        Length inch2 = new Length(Unit.INCH,0.0);
        double inchTwo = inch2.getValue();
        Assertions.assertEquals(inchOne, inchTwo);
    }

    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH,1.0);
        Length feet1 = new Length(Unit.FEET,1.0);
        Assertions.assertNotEquals(inch1, feet1);
    }

    @Test
    public void given1Inchand1Inch_WhenCompared_ShouldReturnEqualLength() {
        Length inch1 = new Length(Unit.FEET,1.0);
        Length inch2 = new Length(Unit.FEET,1.0);
        boolean compareCheck = Length.compare(inch1,inch2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Inchand0Feet_WhenCompared_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length feet1 = new Length(Unit.FEET,0.0);
        boolean compareCheck = Length.compare(inch1,feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given12Inchand1Feet_WhenCompared_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH,12.0);
        Length feet1 = new Length(Unit.FEET,1.0);
        boolean compareCheck = Length.compare(inch1,feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1Yard_WhenCompared_ShouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH,1.0);
        Length yard1 = new Length(Unit.YARD,1.0);
        boolean compareCheck = Length.compare(inch1,yard1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given36Inchand1Yard_WhenCompared_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH,36.0);
        Length yard1 = new Length(Unit.YARD,1.0);
        boolean compareCheck = Length.compare(inch1,yard1);
        Assertions.assertTrue(compareCheck);
    }

    //Yard
    @Test
    public void given0Yardand0Yard_ShouldReturnEqual() {
        Length yard1 = new Length(Unit.YARD,0.0);
        Length yard2 = new Length(Unit.YARD,0.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    public void given0Yardand1Yard_ShouldReturnNotEqual() {
        Length yard1 = new Length(Unit.YARD,0.0);
        Length yard2 = new Length(Unit.YARD,1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenNullYardAnd0Yard_ShouldReturnNotEqual() {
        Length yard1 = null;
        Length yard2 = new Length(Unit.YARD,1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenType0YardAnd1Yard_ShouldReturnEqual() {
        Length yard1 = new Length(Unit.YARD,0.0);
        Length yard2 = new Length(Unit.YARD,1.0);
        Assertions.assertEquals(yard1.getClass(), yard2.getClass());
    }

    @Test
    public void givenReference0YardAnd0Yard_ShouldReturnNotEqual() {
        Length yard1 = new Length(Unit.YARD,0.0);
        Length yard2 = new Length(Unit.YARD,0.0);
        Assertions.assertNotSame(yard1, yard2);
    }

    @Test
    public void givenEquality0YardAnd0Yard_ShouldReturnEqual() {
        Length yard1 = new Length(Unit.YARD,0.0);
        double yardOne = yard1.getValue();
        Length yard2 = new Length(Unit.YARD,0.0);
        double yardTwo = yard2.getValue();
        Assertions.assertEquals(yardOne, yardTwo);
    }

    @Test
    public void givenCompare1YardAnd3Feet_ShouldReturnEqual() {
        Length yard1 = new Length(Unit.YARD,1.0);
        Length feet1 = new Length(Unit.FEET,3.0);
        boolean compareCheck = Length.compare(yard1,feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void givenCompare1YardAnd2Feet_ShouldReturnNotEqual() {
        Length yard1 = new Length(Unit.YARD,1.0);
        Length feet1 = new Length(Unit.FEET,2.0);
        boolean compareCheck = Length.compare(yard1,feet1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void givenCompare1YardAnd36Inch_ShouldReturnEqual() {
        Length yard1 = new Length(Unit.YARD,1.0);
        Length inch1 = new Length(Unit.INCH,36.0);
        boolean compareCheck = Length.compare(yard1,inch1);
        Assertions.assertTrue(compareCheck);
    }

}
