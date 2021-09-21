

public class Length {

    enum Unit {FEET, INCH, YARD}

    private final double value;
    private final Unit unit;

    public Length(Unit unit, double value){
        this.unit = unit;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public double getFeetToInch() {
        return value * 12;
    }

    public double getFeetToYard() {
        return value / 3;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

}
