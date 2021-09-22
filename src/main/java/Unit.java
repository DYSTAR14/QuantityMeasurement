public enum Unit {

    FEET(12.0), INCH(1.0), YARD(36.0),
    CENTIMETER(0.3937);
    final double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

}

