import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    //Feet
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given1Feetand1Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Assertions.assertNotEquals(feet1, inch1);
    }

    @Test
    public void givenNullFeetAnd0Feet_ShouldReturnNotEqual() {
        Length feet1 = null;
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenType0FeetAnd1_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    public void givenReference0FeetAnd0Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test
    public void givenEquality0FeetAnd0Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        double feetOne = feet1.getValue();
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        double feetTwo = feet2.getValue();
        Assertions.assertEquals(feetOne, feetTwo);
    }

    @Test
    public void givenCompare1FeetAnd12Inch_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        double actual = feet1.getFeetToInch();
        double expected = 12;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void givenCompare2FeetAnd12Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,2.0);
        double actual = feet1.getFeetToInch();
        double expected = 12;
        Assertions.assertNotEquals(actual, expected);
    }

    @Test
    public void givenCompare3FeetAnd1Yard_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,3.0);
        double actual = feet1.getFeetToYard();
        double expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void givenCompare1FeetAnd1Yard_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        double actual = feet1.getFeetToYard();
        double expected = 1;
        Assertions.assertNotEquals(actual, expected);
    }


    //Inch
    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenNullInchAnd0Inch_ShouldReturnNotEqual() {
        Length inch1 = null;
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenType0InchAnd1Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    public void givenReference0InchAnd0Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assertions.assertNotSame(inch1, inch2);
    }

    @Test
    public void givenEquality0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        double inchOne = inch1.getValue();
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        double inchTwo = inch2.getValue();
        Assertions.assertEquals(inchOne, inchTwo);
    }

//    @Test
//    public void givenCompare12InchAnd1Feet_ShouldReturnEqual() {
//        Length inch1 = new Length(Length.Unit.INCH,12.0);
//        double actual = inch1.getInchToFeet();
//        double expected = 1;
//        Assertions.assertEquals(actual, expected);
//    }
//
//    @Test
//    public void givenCompare12InchAnd1Feet_ShouldReturnNotEqual() {
//        Length inch1 = new Length(Length.Unit.INCH,24.0);
//        double actual = inch1.getInchToFeet();
//        double expected = 1;
//        Assertions.assertNotEquals(actual, expected);
//    }
//
//    @Test
//    public void givenCompare36InchAnd1Yard_ShouldReturnEqual() {
//        Length inch1 = new Length(Length.Unit.INCH,36.0);
//        double actual = inch1.getInchToYard();
//        double expected = 1;
//        Assertions.assertEquals(actual, expected);
//    }
//
//    @Test
//    public void givenCompare1InchAnd1Yard_ShouldReturnNotEqual() {
//        Length inch1 = new Length(Length.Unit.INCH,1.0);
//        double actual = inch1.getInchToYard();
//        double expected = 1;
//        Assertions.assertNotEquals(actual, expected);
//    }

    //Yard
    @Test
    public void given0Yardand0Yard_ShouldReturnEqual() {
        Length yard1 = new Length(Length.Unit.YARD,0.0);
        Length yard2 = new Length(Length.Unit.YARD,0.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    public void given0Yardand1Yard_ShouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.YARD,0.0);
        Length yard2 = new Length(Length.Unit.YARD,1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenNullYardAnd0Yard_ShouldReturnNotEqual() {
        Length yard1 = null;
        Length yard2 = new Length(Length.Unit.YARD,1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenType0YardAnd1Yard_ShouldReturnEqual() {
        Length yard1 = new Length(Length.Unit.YARD,0.0);
        Length yard2 = new Length(Length.Unit.YARD,1.0);
        Assertions.assertEquals(yard1.getClass(), yard2.getClass());
    }

    @Test
    public void givenReference0YardAnd0Yard_ShouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.YARD,0.0);
        Length yard2 = new Length(Length.Unit.YARD,0.0);
        Assertions.assertNotSame(yard1, yard2);
    }

    @Test
    public void givenEquality0YardAnd0Yard_ShouldReturnEqual() {
        Length yard1 = new Length(Length.Unit.YARD,0.0);
        double yardOne = yard1.getValue();
        Length yard2 = new Length(Length.Unit.YARD,0.0);
        double yardTwo = yard2.getValue();
        Assertions.assertEquals(yardOne, yardTwo);
    }

//    @Test
//    public void givenCompare1YardAnd3Feet_ShouldReturnEqual() {
//        Length yard = new Length(Length.Unit.YARD,1.0);
//        double actual = yard.getYardToFeet();
//        double expected = 3;
//        Assertions.assertEquals(actual, expected);
//    }
//
//    @Test
//    public void givenCompare1YardAnd2Feet_ShouldReturnNotEqual() {
//        Length yard = new Length(Length.Unit.YARD,1.0);
//        double actual = yard.getYardToFeet();
//        double expected = 2;
//        Assertions.assertNotEquals(actual, expected);
//    }
//
//    @Test
//    public void givenCompare1YardAnd36Inch_ShouldReturnEqual() {
//        Length yard = new Length(Length.Unit.YARD,1.0);
//        double actual = yard.getYardToInch();
//        double expected = 36;
//        Assertions.assertEquals(actual, expected);
//    }


}
