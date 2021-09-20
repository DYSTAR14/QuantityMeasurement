import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class QuantityTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual(){
       Feet feet1 = new Feet(0.0);
       Feet feet2 = new Feet(0.0);
       Assertions.assertEquals(feet1,feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual(){
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenNullFeetAnd0Feet_ShouldReturnNotEqual(){
        Feet feet1 = null;
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenType0FeetAnd1_ShouldReturnEqual(){
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertEquals(feet1.getClass(),feet2.getClass());
    }

    @Test
    public void givenReference0FeetAnd0Feet_ShouldReturnNotEqual(){
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertNotSame(feet1,feet2);
    }

    @Test
    public void givenEquality0FeetAnd0Feet_ShouldReturnNotEqual(){
        Feet feet1 = new Feet(0.0);
        double feetOne = feet1.getValue();
        Feet feet2 = new Feet(0.0);
        double feetTwo = feet2.getValue();
        Assertions.assertEquals(feetOne,feetTwo);
    }



    @Test
    public void given0Inchand0Inch_ShouldReturnEqual(){
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1,inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnEqual(){
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1,inch2);
    }

}
