import java.text.DecimalFormat;

public class Volume {
    private final VolumeUnit unit;
    private final double value;

    public Volume(VolumeUnit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public static boolean compare(Volume v1, Volume v2) {
        return Double.compare(Math.ceil(v1.getValue() * v1.getUnit().baseUnitConversion),
                Math.ceil(v2.getValue() * v2.getUnit().baseUnitConversion)) == 0;
    }

    public static double add(Volume v1, Volume v2) {
        DecimalFormat df = new DecimalFormat("###.##");
        return Double.parseDouble(df.format(v1.getValue() * v1.getUnit().baseUnitConversion +
                v2.getValue() * v2.getUnit().baseUnitConversion));
    }

    public VolumeUnit getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) == 0 && unit == volume.unit;
    }

}
