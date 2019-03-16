package week6.enums;

public enum LengthUnit { // enums are set of constant variables

    METER(1),
    DECIMETER(0.1),
    CENTIMETER(0.01),
    MILLIMETER(0.001);

    LengthUnit(double value) {
        this.value = value;
    }

    private double value;

    public double getValue() {
        return value;
    }
}
