public enum LengthUnit {

    FEET(12.0, Measurement.LENGTH),
    INCH(1.0, Measurement.LENGTH),
    YARD(36.0, Measurement.LENGTH),
    CENTIMETER(0.3937, Measurement.LENGTH);

    final double baseUnitConversion;
    private final Measurement quantityUnit;

    LengthUnit(double baseUnitConversion, Measurement quantityUnit) {
        this.baseUnitConversion = baseUnitConversion;
        this.quantityUnit = quantityUnit;
    }

}

