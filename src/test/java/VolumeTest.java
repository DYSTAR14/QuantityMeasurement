import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VolumeTest {
    //Gallon
    @Test
    public void given0Gallonand0Gallon_ShouldReturnEqual() {
        Volume gallon1 = new Volume(VolumeUnit.GALLON, 0.0);
        Volume gallon2 = new Volume(VolumeUnit.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    public void given0Gallonand1Gallon_ShouldReturnNotEqual() {
        Volume gallon1 = new Volume(VolumeUnit.GALLON, 0.0);
        Volume gallon2 = new Volume(VolumeUnit.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void givenNullGallonand1Gallon_ShouldReturnNotEqual() {
        Volume gallon1 = null;
        Volume gallon2 = new Volume(VolumeUnit.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void givenType0Gallonand1Gallon_ShouldReturnEqual() {
        Volume gallon1 = new Volume(VolumeUnit.GALLON, 0.0);
        Volume gallon2 = new Volume(VolumeUnit.GALLON, 1.0);
        Assertions.assertEquals(gallon1.getClass(), gallon2.getClass());
    }

    @Test
    public void givenReference0Gallonand0Gallon_ShouldReturnNotEqual() {
        Volume gallon1 = new Volume(VolumeUnit.GALLON, 0.0);
        Volume gallon2 = new Volume(VolumeUnit.GALLON, 0.0);
        Assertions.assertNotSame(gallon1, gallon2);
    }

    @Test
    public void givenEquality0Gallonand0Gallon_ShouldReturnEqual() {
        Volume gallon1 = new Volume(VolumeUnit.GALLON, 0.0);
        double gallonOne = gallon1.getValue();
        Volume gallon2 = new Volume(VolumeUnit.GALLON, 0.0);
        double gallonTwo = gallon2.getValue();
        Assertions.assertEquals(gallonOne, gallonTwo);
    }

    @Test
    public void given1Gallonand3_78Liter_WhenCompared_ShouldReturnEqual() {
        Volume gallon1 = new Volume(VolumeUnit.GALLON, 1.0);
        Volume litre2 = new Volume(VolumeUnit.LITRE, 3.78);
        boolean compareCheck = Volume.compare(gallon1, litre2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Gallonand3_78Liter_ShouldReturnEqual() {
        Volume gallon1 = new Volume(VolumeUnit.GALLON, 1.0);
        Volume litre2 = new Volume(VolumeUnit.LITRE, 3.78);
        double actual = Volume.add(gallon1, litre2);
        double expected = 7.57;
        Assertions.assertEquals(expected,actual);
    }


    //Litre
    @Test
    public void given0Litreand0Litre_ShouldReturnEqual() {
        Volume litre1 = new Volume(VolumeUnit.LITRE, 0.0);
        Volume litre2 = new Volume(VolumeUnit.LITRE, 0.0);
        Assertions.assertEquals(litre1, litre2);
    }

    @Test
    public void given0Litreand1Litre_ShouldReturnNotEqual() {
        Volume litre1 = new Volume(VolumeUnit.LITRE, 0.0);
        Volume litre2 = new Volume(VolumeUnit.LITRE, 1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void givenNullLitreand1Litre_ShouldReturnNotEqual() {
        Volume litre1 = null;
        Volume litre2 = new Volume(VolumeUnit.LITRE, 1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void givenType0Litreand1Litre_ShouldReturnEqual() {
        Volume litre1 = new Volume(VolumeUnit.LITRE, 0.0);
        Volume litre2 = new Volume(VolumeUnit.LITRE, 1.0);
        Assertions.assertEquals(litre1.getClass(), litre2.getClass());
    }

    @Test
    public void givenReference0Litreand0Litre_ShouldReturnNotEqual() {
        Volume litre1 = new Volume(VolumeUnit.LITRE, 0.0);
        Volume litre2 = new Volume(VolumeUnit.LITRE, 0.0);
        Assertions.assertNotSame(litre1, litre2);
    }

    @Test
    public void givenEquality0Litreand0Litre_ShouldReturnEqual() {
        Volume litre1 = new Volume(VolumeUnit.LITRE, 0.0);
        double litreOne = litre1.getValue();
        Volume litre2 = new Volume(VolumeUnit.LITRE, 0.0);
        double litreTwo = litre2.getValue();
        Assertions.assertEquals(litreOne, litreTwo);
    }

    @Test
    public void given1Litreand1000Milliliter_WhenCompared_ShouldReturnEqual() {
        Volume gallon1 = new Volume(VolumeUnit.LITRE, 1.0);
        Volume litre2 = new Volume(VolumeUnit.MILLILITER, 1000.0);
        boolean compareCheck = Volume.compare(gallon1, litre2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Litreand1000Milliliter_ShouldReturnEqual() {
        Volume gallon1 = new Volume(VolumeUnit.LITRE, 1.0);
        Volume litre2 = new Volume(VolumeUnit.MILLILITER, 1000.0);
        double actual = Volume.add(gallon1, litre2);
        double expected = 2.0;
        Assertions.assertEquals(expected,actual);
    }

    //Milliliter
    @Test
    public void given0Milliliterand0Milliliter_ShouldReturnEqual() {
        Volume milliliter1 = new Volume(VolumeUnit.MILLILITER, 0.0);
        Volume milliliter2 = new Volume(VolumeUnit.MILLILITER, 0.0);
        Assertions.assertEquals(milliliter1, milliliter2);
    }

    @Test
    public void given0Milliliterand1Milliliter_ShouldReturnNotEqual() {
        Volume milliliter1 = new Volume(VolumeUnit.MILLILITER, 0.0);
        Volume milliliter2 = new Volume(VolumeUnit.MILLILITER, 1.0);
        Assertions.assertNotEquals(milliliter1, milliliter2);
    }

    @Test
    public void givenNullMilliliterand1Milliliter_ShouldReturnNotEqual() {
        Volume milliliter1 = null;
        Volume milliliter2 = new Volume(VolumeUnit.MILLILITER, 1.0);
        Assertions.assertNotEquals(milliliter1, milliliter2);
    }

    @Test
    public void givenType0Milliliternd1Milliliter_ShouldReturnEqual() {
        Volume milliliter1 = new Volume(VolumeUnit.MILLILITER, 0.0);
        Volume milliliter2 = new Volume(VolumeUnit.MILLILITER, 1.0);
        Assertions.assertEquals(milliliter1.getClass(), milliliter2.getClass());
    }

    @Test
    public void givenReference0Milliliterand0Milliliter_ShouldReturnNotEqual() {
        Volume milliliter1 = new Volume(VolumeUnit.MILLILITER, 0.0);
        Volume milliliter2 = new Volume(VolumeUnit.MILLILITER, 0.0);
        Assertions.assertNotSame(milliliter1, milliliter2);
    }

    @Test
    public void givenEquality0Milliliterand0Milliliter_ShouldReturnEqual() {
        Volume milliliter1 = new Volume(VolumeUnit.MILLILITER, 0.0);
        double milliliterOne = milliliter1.getValue();
        Volume milliliter2 = new Volume(VolumeUnit.MILLILITER, 0.0);
        double milliliterTwo = milliliter2.getValue();
        Assertions.assertEquals(milliliterOne, milliliterTwo);
    }
}
