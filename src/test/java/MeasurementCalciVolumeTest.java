import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MeasurementCalciVolumeTest {
    //Gallon
    @Test
    public void given0Gallonand0Gallon_ShouldReturnEqual() {
        MeasurementCalci gallon1 = new MeasurementCalci(Unit.GALLON, 0.0);
        MeasurementCalci gallon2 = new MeasurementCalci(Unit.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    public void given0Gallonand1Gallon_ShouldReturnNotEqual() {
        MeasurementCalci gallon1 = new MeasurementCalci(Unit.GALLON, 0.0);
        MeasurementCalci gallon2 = new MeasurementCalci(Unit.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void givenNullGallonand1Gallon_ShouldReturnNotEqual() {
        MeasurementCalci gallon1 = null;
        MeasurementCalci gallon2 = new MeasurementCalci(Unit.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void givenType0Gallonand1Gallon_ShouldReturnEqual() {
        MeasurementCalci gallon1 = new MeasurementCalci(Unit.GALLON, 0.0);
        MeasurementCalci gallon2 = new MeasurementCalci(Unit.GALLON, 1.0);
        Assertions.assertEquals(gallon1.getClass(), gallon2.getClass());
    }

    @Test
    public void givenReference0Gallonand0Gallon_ShouldReturnNotEqual() {
        MeasurementCalci gallon1 = new MeasurementCalci(Unit.GALLON, 0.0);
        MeasurementCalci gallon2 = new MeasurementCalci(Unit.GALLON, 0.0);
        Assertions.assertNotSame(gallon1, gallon2);
    }

    @Test
    public void givenEquality0Gallonand0Gallon_ShouldReturnEqual() {
        MeasurementCalci gallon1 = new MeasurementCalci(Unit.GALLON, 0.0);
        double gallonOne = gallon1.getValue();
        MeasurementCalci gallon2 = new MeasurementCalci(Unit.GALLON, 0.0);
        double gallonTwo = gallon2.getValue();
        Assertions.assertEquals(gallonOne, gallonTwo);
    }

    @Test
    public void given1Gallonand3_78Liter_WhenCompared_ShouldReturnEqual() {
        MeasurementCalci gallon1 = new MeasurementCalci(Unit.GALLON, 1.0);
        MeasurementCalci litre2 = new MeasurementCalci(Unit.LITRE, 3.78);
        boolean compareCheck = MeasurementCalci.compare(gallon1, litre2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Gallonand3_78Liter_ShouldReturnEqual() {
        MeasurementCalci gallon1 = new MeasurementCalci(Unit.GALLON, 1.0);
        MeasurementCalci litre2 = new MeasurementCalci(Unit.LITRE, 3.78);
        Double actual = MeasurementCalci.add(gallon1, litre2);
        Double expected = 7.57;
        Assertions.assertEquals(expected,actual);
    }


    //Litre
    @Test
    public void given0Litreand0Litre_ShouldReturnEqual() {
        MeasurementCalci litre1 = new MeasurementCalci(Unit.LITRE, 0.0);
        MeasurementCalci litre2 = new MeasurementCalci(Unit.LITRE, 0.0);
        Assertions.assertEquals(litre1, litre2);
    }

    @Test
    public void given0Litreand1Litre_ShouldReturnNotEqual() {
        MeasurementCalci litre1 = new MeasurementCalci(Unit.LITRE, 0.0);
        MeasurementCalci litre2 = new MeasurementCalci(Unit.LITRE, 1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void givenNullLitreand1Litre_ShouldReturnNotEqual() {
        MeasurementCalci litre1 = null;
        MeasurementCalci litre2 = new MeasurementCalci(Unit.LITRE, 1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void givenType0Litreand1Litre_ShouldReturnEqual() {
        MeasurementCalci litre1 = new MeasurementCalci(Unit.LITRE, 0.0);
        MeasurementCalci litre2 = new MeasurementCalci(Unit.LITRE, 1.0);
        Assertions.assertEquals(litre1.getClass(), litre2.getClass());
    }

    @Test
    public void givenReference0Litreand0Litre_ShouldReturnNotEqual() {
        MeasurementCalci litre1 = new MeasurementCalci(Unit.LITRE, 0.0);
        MeasurementCalci litre2 = new MeasurementCalci(Unit.LITRE, 0.0);
        Assertions.assertNotSame(litre1, litre2);
    }

    @Test
    public void givenEquality0Litreand0Litre_ShouldReturnEqual() {
        MeasurementCalci litre1 = new MeasurementCalci(Unit.LITRE, 0.0);
        Double litreOne = litre1.getValue();
        MeasurementCalci litre2 = new MeasurementCalci(Unit.LITRE, 0.0);
        Double litreTwo = litre2.getValue();
        Assertions.assertEquals(litreOne, litreTwo);
    }

    @Test
    public void given1Litreand1000Milliliter_WhenCompared_ShouldReturnEqual() {
        MeasurementCalci gallon1 = new MeasurementCalci(Unit.LITRE, 1.0);
        MeasurementCalci litre2 = new MeasurementCalci(Unit.MILLILITER, 1000.0);
        boolean compareCheck = MeasurementCalci.compare(gallon1, litre2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Litreand1000Milliliter_ShouldReturnEqual() {
        MeasurementCalci gallon1 = new MeasurementCalci(Unit.LITRE, 1.0);
        MeasurementCalci litre2 = new MeasurementCalci(Unit.MILLILITER, 1000.0);
        Double actual = MeasurementCalci.add(gallon1, litre2);
        Double expected = 2.0;
        Assertions.assertEquals(expected,actual);
    }

    //Milliliter
    @Test
    public void given0Milliliterand0Milliliter_ShouldReturnEqual() {
        MeasurementCalci milliliter1 = new MeasurementCalci(Unit.MILLILITER, 0.0);
        MeasurementCalci milliliter2 = new MeasurementCalci(Unit.MILLILITER, 0.0);
        Assertions.assertEquals(milliliter1, milliliter2);
    }

    @Test
    public void given0Milliliterand1Milliliter_ShouldReturnNotEqual() {
        MeasurementCalci milliliter1 = new MeasurementCalci(Unit.MILLILITER, 0.0);
        MeasurementCalci milliliter2 = new MeasurementCalci(Unit.MILLILITER, 1.0);
        Assertions.assertNotEquals(milliliter1, milliliter2);
    }

    @Test
    public void givenNullMilliliterand1Milliliter_ShouldReturnNotEqual() {
        MeasurementCalci milliliter1 = null;
        MeasurementCalci milliliter2 = new MeasurementCalci(Unit.MILLILITER, 1.0);
        Assertions.assertNotEquals(milliliter1, milliliter2);
    }

    @Test
    public void givenType0Milliliternd1Milliliter_ShouldReturnEqual() {
        MeasurementCalci milliliter1 = new MeasurementCalci(Unit.MILLILITER, 0.0);
        MeasurementCalci milliliter2 = new MeasurementCalci(Unit.MILLILITER, 1.0);
        Assertions.assertEquals(milliliter1.getClass(), milliliter2.getClass());
    }

    @Test
    public void givenReference0Milliliterand0Milliliter_ShouldReturnNotEqual() {
        MeasurementCalci milliliter1 = new MeasurementCalci(Unit.MILLILITER, 0.0);
        MeasurementCalci milliliter2 = new MeasurementCalci(Unit.MILLILITER, 0.0);
        Assertions.assertNotSame(milliliter1, milliliter2);
    }

    @Test
    public void givenEquality0Milliliterand0Milliliter_ShouldReturnEqual() {
        MeasurementCalci milliliter1 = new MeasurementCalci(Unit.MILLILITER, 0.0);
        Double milliliterOne = milliliter1.getValue();
        MeasurementCalci milliliter2 = new MeasurementCalci(Unit.MILLILITER, 0.0);
        Double milliliterTwo = milliliter2.getValue();
        Assertions.assertEquals(milliliterOne, milliliterTwo);
    }
}
