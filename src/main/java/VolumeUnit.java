public enum VolumeUnit {

    GALLON(3785.41),
    LITRE(1000.0),
    MILLILITER(1.0);

    final double baseUnitConversion;

    VolumeUnit(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }
}
