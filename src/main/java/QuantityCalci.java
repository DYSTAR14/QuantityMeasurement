import java.text.DecimalFormat;
import java.util.Objects;

public class QuantityCalci {
    static final DecimalFormat dfCompare = new DecimalFormat("###.####");
    static final DecimalFormat dfAddd = new DecimalFormat("###.##");
    public final Unit unit;
    private final double value;

    public QuantityCalci(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public static boolean compare(QuantityCalci l1, QuantityCalci l2) {
        if(l1.getUnit().quantityUnit.equals(l2.getUnit().quantityUnit))
            return Double.compare(
                    Math.ceil(
                    Double.parseDouble(
                            dfCompare.format(l1.getValue() * l1.getUnit().baseUnitConversion)
                    )),
                    Math.ceil(
                    Double.parseDouble(
                            dfCompare.format(l2.getValue() * l2.getUnit().baseUnitConversion)
                    ))
            ) == 0;
        return false;
    }

    public static Double add(QuantityCalci l1, QuantityCalci l2) {
        if(l1.getUnit().quantityUnit.equals(l2.getUnit().quantityUnit))
            return Double.parseDouble(
                    dfAddd.format(
                            l1.getValue() * l1.getUnit().baseUnitConversion +
                                    l2.getValue() * l2.getUnit().baseUnitConversion
                    )
            );
        return null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value);
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
