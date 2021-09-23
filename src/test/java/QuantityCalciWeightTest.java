import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityCalciWeightTest {
    //Tonne
    @Test
    public void given0Tonand0Tone_ShouldReturnEqual() {
        QuantityCalci tons1 = new QuantityCalci(Unit.TONNE, 0.0);
        QuantityCalci tons2 = new QuantityCalci(Unit.TONNE, 0.0);
        Assertions.assertEquals(tons1, tons2);
    }

    @Test
    public void given0Tonand1Ton_ShouldReturnNotEqual() {
        QuantityCalci tons1 = new QuantityCalci(Unit.TONNE, 0.0);
        QuantityCalci tons2 = new QuantityCalci(Unit.TONNE, 1.0);
        Assertions.assertNotEquals(tons1, tons2);
    }

    @Test
    public void givenNullTonand1Ton_ShouldReturnNotEqual() {
        QuantityCalci tons1 = null;
        QuantityCalci tons2 = new QuantityCalci(Unit.TONNE, 1.0);
        Assertions.assertNotEquals(tons1, tons2);
    }

    @Test
    public void givenType0Tonand1Ton_ShouldReturnEqual() {
        QuantityCalci tons1 = new QuantityCalci(Unit.TONNE, 0.0);
        QuantityCalci tons2 = new QuantityCalci(Unit.TONNE, 1.0);
        Assertions.assertEquals(tons1.getClass(), tons2.getClass());
    }

    @Test
    public void givenReference0Tonand0Ton_ShouldReturnNotEqual() {
        QuantityCalci tons1 = new QuantityCalci(Unit.TONNE, 0.0);
        QuantityCalci tons2 = new QuantityCalci(Unit.GALLON, 0.0);
        Assertions.assertNotSame(tons1, tons2);
    }

    @Test
    public void givenEquality0Tonand0Ton_ShouldReturnEqual() {
        QuantityCalci tons1 = new QuantityCalci(Unit.TONNE, 1.0);
        double tonOne = tons1.getValue();
        QuantityCalci tons2 = new QuantityCalci(Unit.TONNE, 1.0);
        double toneTwo = tons2.getValue();
        Assertions.assertEquals(tonOne, toneTwo);
    }

    @Test
    public void given1Tonneand1000Kilogram_WhenCompared_ShouldReturnEqual() {
        QuantityCalci ton1 = new QuantityCalci(Unit.TONNE, 1.0);
        QuantityCalci kilogram1 = new QuantityCalci(Unit.KILOGRAM, 1000.0);
        boolean compareCheck = QuantityCalci.compare(ton1, kilogram1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Tonneand1Kilogram_WhenCompared_ShouldReturnNotEqual() {
        QuantityCalci ton1 = new QuantityCalci(Unit.TONNE, 1.0);
        QuantityCalci kilogram1 = new QuantityCalci(Unit.KILOGRAM, 1.0);
        boolean compareCheck = QuantityCalci.compare(ton1, kilogram1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Tonneand1000Gram_ShouldReturnEqual() {
        QuantityCalci ton1 = new QuantityCalci(Unit.TONNE, 1.0);
        QuantityCalci kilogram1 = new QuantityCalci(Unit.GRAM, 1000.0);
        Double actual = QuantityCalci.add(ton1, kilogram1);
        Double expected = 1001.0;
        Assertions.assertEquals(expected,actual);
    }

    //Kilogram
    @Test
    public void given0Kilogramand0Kilogram_ShouldReturnEqual() {
        QuantityCalci kilogram1 = new QuantityCalci(Unit.TONNE, 0.0);
        QuantityCalci kilogram2 = new QuantityCalci(Unit.TONNE, 0.0);
        Assertions.assertEquals(kilogram1, kilogram2);
    }

    @Test
    public void given0Kilogramand1Kilogram_ShouldReturnNotEqual() {
        QuantityCalci kilogram1 = new QuantityCalci(Unit.TONNE, 0.0);
        QuantityCalci kilogram2 = new QuantityCalci(Unit.TONNE, 1.0);
        Assertions.assertNotEquals(kilogram1, kilogram2);
    }

    @Test
    public void givenNullKilogramand1Kilogram_ShouldReturnNotEqual() {
        QuantityCalci kilogram1 = null;
        QuantityCalci kilogram2 = new QuantityCalci(Unit.TONNE, 1.0);
        Assertions.assertNotEquals(kilogram1, kilogram2);
    }

    @Test
    public void givenType0Kilogramand1Kilogram_ShouldReturnEqual() {
        QuantityCalci kilogram1 = new QuantityCalci(Unit.TONNE, 0.0);
        QuantityCalci kilogram2 = new QuantityCalci(Unit.TONNE, 1.0);
        Assertions.assertEquals(kilogram1.getClass(), kilogram2.getClass());
    }

    @Test
    public void givenReference0Kilogramand0Kilogram_ShouldReturnNotEqual() {
        QuantityCalci kilogram1 = new QuantityCalci(Unit.TONNE, 0.0);
        QuantityCalci kilogram2 = new QuantityCalci(Unit.GALLON, 0.0);
        Assertions.assertNotSame(kilogram1, kilogram2);
    }

    @Test
    public void givenEquality0Kilogramand0Kilogram_ShouldReturnEqual() {
        QuantityCalci kilogram1 = new QuantityCalci(Unit.TONNE, 1.0);
        double kilogramOne = kilogram1.getValue();
        QuantityCalci kilogram2 = new QuantityCalci(Unit.TONNE, 1.0);
        double kilogramTwo = kilogram2.getValue();
        Assertions.assertEquals(kilogramOne, kilogramTwo);
    }

    @Test
    public void given1Kilogramand1000Gram_WhenCompared_ShouldReturnEqual() {
        QuantityCalci kilogram1 = new QuantityCalci(Unit.KILOGRAM, 1.0);
        QuantityCalci gram1 = new QuantityCalci(Unit.GRAM, 1000.0);
        boolean compareCheck = QuantityCalci.compare(kilogram1, gram1);
        Assertions.assertTrue(compareCheck);
    }

//    @Test
//    public void given1Kilogramand1Gram_WhenCompared_ShouldReturnNotEqual() {
//        QuantityCalci kilogram1 = new QuantityCalci(Unit.KILOGRAM, 1.0);
//        QuantityCalci gram1 = new QuantityCalci(Unit.GRAM, 1.0);
//        boolean compareCheck = QuantityCalci.compare(kilogram1, gram1);
//        Assertions.assertFalse(compareCheck);
//    }

    //Gram
    @Test
    public void given0Gramand0Gram_ShouldReturnEqual() {
        QuantityCalci gram1 = new QuantityCalci(Unit.TONNE, 0.0);
        QuantityCalci gram2 = new QuantityCalci(Unit.TONNE, 0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    public void given0Gramand1Gram_ShouldReturnNotEqual() {
        QuantityCalci gram1 = new QuantityCalci(Unit.TONNE, 0.0);
        QuantityCalci gram2 = new QuantityCalci(Unit.TONNE, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void givenNullGramand1Gram_ShouldReturnNotEqual() {
        QuantityCalci gram1 = null;
        QuantityCalci gram2 = new QuantityCalci(Unit.TONNE, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void givenType0Gramand1Gram_ShouldReturnEqual() {
        QuantityCalci gram1 = new QuantityCalci(Unit.TONNE, 0.0);
        QuantityCalci gram2 = new QuantityCalci(Unit.TONNE, 1.0);
        Assertions.assertEquals(gram1.getClass(), gram2.getClass());
    }

    @Test
    public void givenReference0Gramand0Gram_ShouldReturnNotEqual() {
        QuantityCalci gram1 = new QuantityCalci(Unit.TONNE, 0.0);
        QuantityCalci gram2 = new QuantityCalci(Unit.GALLON, 0.0);
        Assertions.assertNotSame(gram1, gram2);
    }

    @Test
    public void givenEquality0Gramand0Gram_ShouldReturnEqual() {
        QuantityCalci gram1 = new QuantityCalci(Unit.TONNE, 1.0);
        double gramOne = gram1.getValue();
        QuantityCalci gram2 = new QuantityCalci(Unit.TONNE, 1.0);
        double gramTwo = gram2.getValue();
        Assertions.assertEquals(gramOne, gramTwo);
    }

    @Test
    public void given1000000Gramand1Tonne_WhenCompared_ShouldReturnEqual() {
        QuantityCalci gram1 = new QuantityCalci(Unit.GRAM, 1000000.0);
        QuantityCalci ton1 = new QuantityCalci(Unit.TONNE, 1.0);
        boolean compareCheck = QuantityCalci.compare(gram1, ton1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Gramand1Tonne_WhenCompared_ShouldReturnNotEqual() {
        QuantityCalci gram1 = new QuantityCalci(Unit.GRAM, 1.0);
        QuantityCalci ton1 = new QuantityCalci(Unit.TONNE, 1.0);
        boolean compareCheck = QuantityCalci.compare(gram1, ton1);
        Assertions.assertFalse(compareCheck);
    }
}
