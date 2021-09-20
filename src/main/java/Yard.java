import java.util.Objects;

public class Yard {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Yard yard = (Yard) o;
        return Double.compare(yard.value, value) == 0;
    }

    private final double value;

    public Yard(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public double getYardToFeet() {
        return value*3;
    }
}
