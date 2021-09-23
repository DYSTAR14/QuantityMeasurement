public enum Unit {

    FEET(12.0, Measurement.LENGTH),
    INCH(1.0, Measurement.LENGTH),
    YARD(36.0, Measurement.LENGTH),
    CENTIMETER(0.3937, Measurement.LENGTH),

    GALLON(3.78541, Measurement.VOLUME),
    LITRE(1.0, Measurement.VOLUME),
    MILLILITER(0.001, Measurement.VOLUME),

    TONNE(1000, Measurement.WEIGHT),
    KILOGRAM(1, Measurement.WEIGHT),
    GRAM(0.001, Measurement.WEIGHT);

    final double baseUnitConversion;
    final Measurement quantityUnit;

    Unit(double baseUnitConversion, Measurement quantityUnit) {
        this.baseUnitConversion = baseUnitConversion;
        this.quantityUnit = quantityUnit;
    }
}
