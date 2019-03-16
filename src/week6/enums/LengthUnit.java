package week6.enums;

public enum LengthUnit { // enums are set of constant variables

    METER(1),
    DECIMETER(10),
    CENTIMETER(100),
    MILLIMETER(1000);

    LengthUnit(double value) {
        this.value = value;
    }

    private double value;

    public double getValue() {
        return value;
    }
}
