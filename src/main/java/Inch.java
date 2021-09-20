
public class Inch {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.value, value) == 0;
    }

    public double getValue() {
        return value;
    }

    private final double value;

    public Inch(double value) {
        this.value = value;
    }

    public double getInchToFeet() {
        return value/12;
    }
}
