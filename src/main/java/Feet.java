
public class Feet {

    public double getValue() {
        return value;
    }

    private final double value;

    public Feet(double value){
        this.value = value;
    }

    public double getFeetToInch() {
        return value * 12;
    }

    public double getFeetToYard() {
        return value / 3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }
}
