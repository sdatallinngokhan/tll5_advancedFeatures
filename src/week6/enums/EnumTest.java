package week6.enums;

// Enums are used to standardize some values
public class EnumTest {

    public static void main(String[] args) {
        System.out.println(LengthUnit.CENTIMETER.getValue());
        System.out.println(WeatherType.RAINY);

        LengthUnit[] lengthUnits = LengthUnit.values();

        for (LengthUnit lengthUnit : lengthUnits) {
            System.out.println(lengthUnit);
        }
    }
}
