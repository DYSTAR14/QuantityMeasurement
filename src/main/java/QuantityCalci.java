import java.text.DecimalFormat;

public class QuantityCalci {
    static final DecimalFormat dfCompare = new DecimalFormat("###.####");
    static final DecimalFormat dfAddd = new DecimalFormat("###.##");
    public final Unit unit;
    private final double value;

    public QuantityCalci(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public static boolean compare(QuantityCalci measure1, QuantityCalci measure2) {
        if (measure1.getUnit().quantityUnit.equals(measure2.getUnit().quantityUnit))
            return Double.compare(
                    Math.ceil(Double.parseDouble(dfCompare.format(measure1.unit.getBaseUnit(measure1)))),
                    Math.ceil(Double.parseDouble(dfCompare.format(measure1.unit.getBaseUnit(measure2))))) == 0;
        return false;
    }

    public static Double add(QuantityCalci measure, QuantityCalci l2) {
        if (measure.getUnit().quantityUnit.equals(l2.getUnit().quantityUnit))
            return Double.parseDouble(dfAddd.format(measure.getValue() * measure.getUnit().baseUnitConversion
                    + l2.getValue() * l2.getUnit().baseUnitConversion));
        return null;
    }


    public double getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityCalci that = (QuantityCalci) o;
        return Double.compare(that.value, value) == 0 && unit == that.unit;
    }


}
