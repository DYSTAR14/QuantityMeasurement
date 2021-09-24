import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MeasurementCalciWeightTest {
    //Tonne
    @Test
    public void given0Tonand0Tone_ShouldReturnEqual() {
        MeasurementCalci tons1 = new MeasurementCalci(Unit.TONNE, 0.0);
        MeasurementCalci tons2 = new MeasurementCalci(Unit.TONNE, 0.0);
        Assertions.assertEquals(tons1, tons2);
    }

    @Test
    public void given0Tonand1Ton_ShouldReturnNotEqual() {
        MeasurementCalci tons1 = new MeasurementCalci(Unit.TONNE, 0.0);
        MeasurementCalci tons2 = new MeasurementCalci(Unit.TONNE, 1.0);
        Assertions.assertNotEquals(tons1, tons2);
    }

    @Test
    public void givenNullTonand1Ton_ShouldReturnNotEqual() {
        MeasurementCalci tons1 = null;
        MeasurementCalci tons2 = new MeasurementCalci(Unit.TONNE, 1.0);
        Assertions.assertNotEquals(tons1, tons2);
    }

    @Test
    public void givenType0Tonand1Ton_ShouldReturnEqual() {
        MeasurementCalci tons1 = new MeasurementCalci(Unit.TONNE, 0.0);
        MeasurementCalci tons2 = new MeasurementCalci(Unit.TONNE, 1.0);
        Assertions.assertEquals(tons1.getClass(), tons2.getClass());
    }

    @Test
    public void givenReference0Tonand0Ton_ShouldReturnNotEqual() {
        MeasurementCalci tons1 = new MeasurementCalci(Unit.TONNE, 0.0);
        MeasurementCalci tons2 = new MeasurementCalci(Unit.GALLON, 0.0);
        Assertions.assertNotSame(tons1, tons2);
    }

    @Test
    public void givenEquality0Tonand0Ton_ShouldReturnEqual() {
        MeasurementCalci tons1 = new MeasurementCalci(Unit.TONNE, 1.0);
        double tonOne = tons1.getValue();
        MeasurementCalci tons2 = new MeasurementCalci(Unit.TONNE, 1.0);
        double toneTwo = tons2.getValue();
        Assertions.assertEquals(tonOne, toneTwo);
    }

    @Test
    public void given1Tonneand1000Kilogram_WhenCompared_ShouldReturnEqual() {
        MeasurementCalci ton1 = new MeasurementCalci(Unit.TONNE, 1.0);
        MeasurementCalci kilogram1 = new MeasurementCalci(Unit.KILOGRAM, 1000.0);
        boolean compareCheck = MeasurementCalci.compare(ton1, kilogram1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Tonneand1Kilogram_WhenCompared_ShouldReturnNotEqual() {
        MeasurementCalci ton1 = new MeasurementCalci(Unit.TONNE, 1.0);
        MeasurementCalci kilogram1 = new MeasurementCalci(Unit.KILOGRAM, 1.0);
        boolean compareCheck = MeasurementCalci.compare(ton1, kilogram1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Tonneand1000Gram_ShouldReturnEqual() {
        MeasurementCalci ton1 = new MeasurementCalci(Unit.TONNE, 1.0);
        MeasurementCalci kilogram1 = new MeasurementCalci(Unit.GRAM, 1000.0);
        Double actual = MeasurementCalci.add(ton1, kilogram1);
        Double expected = 1001.0;
        Assertions.assertEquals(expected,actual);
    }

    //Kilogram
    @Test
    public void given0Kilogramand0Kilogram_ShouldReturnEqual() {
        MeasurementCalci kilogram1 = new MeasurementCalci(Unit.TONNE, 0.0);
        MeasurementCalci kilogram2 = new MeasurementCalci(Unit.TONNE, 0.0);
        Assertions.assertEquals(kilogram1, kilogram2);
    }

    @Test
    public void given0Kilogramand1Kilogram_ShouldReturnNotEqual() {
        MeasurementCalci kilogram1 = new MeasurementCalci(Unit.TONNE, 0.0);
        MeasurementCalci kilogram2 = new MeasurementCalci(Unit.TONNE, 1.0);
        Assertions.assertNotEquals(kilogram1, kilogram2);
    }

    @Test
    public void givenNullKilogramand1Kilogram_ShouldReturnNotEqual() {
        MeasurementCalci kilogram1 = null;
        MeasurementCalci kilogram2 = new MeasurementCalci(Unit.TONNE, 1.0);
        Assertions.assertNotEquals(kilogram1, kilogram2);
    }

    @Test
    public void givenType0Kilogramand1Kilogram_ShouldReturnEqual() {
        MeasurementCalci kilogram1 = new MeasurementCalci(Unit.TONNE, 0.0);
        MeasurementCalci kilogram2 = new MeasurementCalci(Unit.TONNE, 1.0);
        Assertions.assertEquals(kilogram1.getClass(), kilogram2.getClass());
    }

    @Test
    public void givenReference0Kilogramand0Kilogram_ShouldReturnNotEqual() {
        MeasurementCalci kilogram1 = new MeasurementCalci(Unit.TONNE, 0.0);
        MeasurementCalci kilogram2 = new MeasurementCalci(Unit.GALLON, 0.0);
        Assertions.assertNotSame(kilogram1, kilogram2);
    }

    @Test
    public void givenEquality0Kilogramand0Kilogram_ShouldReturnEqual() {
        MeasurementCalci kilogram1 = new MeasurementCalci(Unit.TONNE, 1.0);
        double kilogramOne = kilogram1.getValue();
        MeasurementCalci kilogram2 = new MeasurementCalci(Unit.TONNE, 1.0);
        double kilogramTwo = kilogram2.getValue();
        Assertions.assertEquals(kilogramOne, kilogramTwo);
    }

    @Test
    public void given1Kilogramand1000Gram_WhenCompared_ShouldReturnEqual() {
        MeasurementCalci kilogram1 = new MeasurementCalci(Unit.KILOGRAM, 1.0);
        MeasurementCalci gram1 = new MeasurementCalci(Unit.GRAM, 1000.0);
        boolean compareCheck = MeasurementCalci.compare(kilogram1, gram1);
        Assertions.assertTrue(compareCheck);
    }

    //Gram
    @Test
    public void given0Gramand0Gram_ShouldReturnEqual() {
        MeasurementCalci gram1 = new MeasurementCalci(Unit.TONNE, 0.0);
        MeasurementCalci gram2 = new MeasurementCalci(Unit.TONNE, 0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    public void given0Gramand1Gram_ShouldReturnNotEqual() {
        MeasurementCalci gram1 = new MeasurementCalci(Unit.TONNE, 0.0);
        MeasurementCalci gram2 = new MeasurementCalci(Unit.TONNE, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void givenNullGramand1Gram_ShouldReturnNotEqual() {
        MeasurementCalci gram1 = null;
        MeasurementCalci gram2 = new MeasurementCalci(Unit.TONNE, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void givenType0Gramand1Gram_ShouldReturnEqual() {
        MeasurementCalci gram1 = new MeasurementCalci(Unit.TONNE, 0.0);
        MeasurementCalci gram2 = new MeasurementCalci(Unit.TONNE, 1.0);
        Assertions.assertEquals(gram1.getClass(), gram2.getClass());
    }

    @Test
    public void givenReference0Gramand0Gram_ShouldReturnNotEqual() {
        MeasurementCalci gram1 = new MeasurementCalci(Unit.TONNE, 0.0);
        MeasurementCalci gram2 = new MeasurementCalci(Unit.GALLON, 0.0);
        Assertions.assertNotSame(gram1, gram2);
    }

    @Test
    public void givenEquality0Gramand0Gram_ShouldReturnEqual() {
        MeasurementCalci gram1 = new MeasurementCalci(Unit.TONNE, 1.0);
        double gramOne = gram1.getValue();
        MeasurementCalci gram2 = new MeasurementCalci(Unit.TONNE, 1.0);
        double gramTwo = gram2.getValue();
        Assertions.assertEquals(gramOne, gramTwo);
    }

    @Test
    public void given1000000Gramand1Tonne_WhenCompared_ShouldReturnEqual() {
        MeasurementCalci gram1 = new MeasurementCalci(Unit.GRAM, 1000000.0);
        MeasurementCalci ton1 = new MeasurementCalci(Unit.TONNE, 1.0);
        boolean compareCheck = MeasurementCalci.compare(gram1, ton1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Gramand1Tonne_WhenCompared_ShouldReturnNotEqual() {
        MeasurementCalci gram1 = new MeasurementCalci(Unit.GRAM, 1.0);
        MeasurementCalci ton1 = new MeasurementCalci(Unit.TONNE, 1.0);
        boolean compareCheck = MeasurementCalci.compare(gram1, ton1);
        Assertions.assertFalse(compareCheck);
    }
}
