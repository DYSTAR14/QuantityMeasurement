public class Length {
    public final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public static boolean compare(Length l1, Length l2) {
        return Double.compare(Math.ceil(l1.getValue() * l1.getUnit().baseUnitConversion),
                Math.ceil(l2.getValue() * l2.getUnit().baseUnitConversion)) == 0;
    }

    public static double add(Length l1, Length l2) {
        return Math.ceil(l1.getValue() * l1.getUnit().baseUnitConversion + l2.getValue() * l2.getUnit().baseUnitConversion);
    }

    public double getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

}
