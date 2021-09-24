import java.text.DecimalFormat;

public class MeasurementCalci {
    static final DecimalFormat dfCompare = new DecimalFormat("###.####");
    static final DecimalFormat dfAddd = new DecimalFormat("###.##");
    public final Unit unit;
    private final double value;

    public MeasurementCalci(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public static boolean compare(MeasurementCalci measure1, MeasurementCalci measure2) {
        if (measure1.getUnit().quantityUnit.equals(measure2.getUnit().quantityUnit))
            return Double.compare(
                    Math.ceil(Double.parseDouble(dfCompare.format(measure1.unit.getBaseUnit(measure1)))),
                    Math.ceil(Double.parseDouble(dfCompare.format(measure1.unit.getBaseUnit(measure2))))) == 0;
        return false;
    }

    public static Double add(MeasurementCalci measure, MeasurementCalci l2) {
        if (measure.getUnit().quantityUnit.equals(l2.getUnit().quantityUnit))
            return Double.parseDouble(
                    dfAddd.format(measure.getValue() * measure.getUnit().baseUnitConversion +
                            l2.getValue() * l2.getUnit().baseUnitConversion));
        return null;
    }


    public double getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that)
            return true;
        if (that == null || getClass() != that.getClass())
            return false;
        MeasurementCalci measurementCalci = (MeasurementCalci) that;
        return Double.compare(measurementCalci.value, value) == 0 && unit == measurementCalci.unit;
    }


}
