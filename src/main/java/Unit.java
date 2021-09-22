
public enum Unit {

    FEET(12.0), INCH(1), YARD(36);

    final double baseUnitConversion;

    Unit(double baseUnitConversion){
        this.baseUnitConversion = baseUnitConversion;
    }

}

