public class Length {
    private final double value;
    public final Unit unit;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }

    public static boolean compare(Length l1,Length l2){
        return Double.compare(l1.getValue() * l1.getUnit().baseUnitConversion,
                l2.getValue() * l2.getUnit().baseUnitConversion)==0;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

}
