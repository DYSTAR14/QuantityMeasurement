public enum VolumeUnit {

    GALLON(3.78541, Measurement.VOLUME),
    LITRE(1.0, Measurement.VOLUME),
    MILLILITER(0.001, Measurement.VOLUME);

    final double baseUnitConversion;
    private final Measurement quantityUnit;

    VolumeUnit(double baseUnitConversion, Measurement quantityUnit) {
        this.baseUnitConversion = baseUnitConversion;
        this.quantityUnit = quantityUnit;
    }
}
