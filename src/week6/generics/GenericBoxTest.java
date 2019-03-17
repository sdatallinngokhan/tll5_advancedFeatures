package week6.generics;

public class GenericBoxTest {

    public static void main(String[] args) {
        Car car = new Car();

        GenericBox<Car> aBoxWithCarInIt = new GenericBox<>(car);
        aBoxWithCarInIt.getItem().getMaxSpeed(); // I could reach to Car object without casting

        Airplane airplane = new Airplane();
        GenericBox<Airplane> aBoxWithAirplaneInIt = new GenericBox<>(airplane);
        aBoxWithAirplaneInIt.getItem().getWingSpan();
    }
}
