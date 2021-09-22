public enum VolumeUnit {

    GALLON(3.78541),
    LITRE(1.0),
    MILLILITER(0.001);

    final double baseUnitConversion;

    VolumeUnit(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }
}
