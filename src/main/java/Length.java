public class Length {

    enum Unit {FEET, INCH, YARD}
    private static final double FEET_TO_INCH = 12.0;
    private static final double INCH_TO_YARD = 36.0;
    private static final double FEET_TO_YARD = 3.0;

    private final double value;
    private final Unit unit;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public boolean compare(Length that) {
        if (this.unit.equals(that.unit))
            return Double.compare(this.value, that.value) == 0;

        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;

        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value / FEET_TO_INCH, that.value) == 0;

        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * INCH_TO_YARD, that.value) == 0;

        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value / INCH_TO_YARD, that.value) == 0;

        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value * FEET_TO_YARD, that.value) == 0;

        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value / FEET_TO_YARD, that.value) == 0;

        return false;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

}
