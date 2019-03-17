package week6.generics.super_usage;

public class GenericBoxTest {

    public static void main(String[] args) {
        Car car = new Car(120);
        GenericBox<Car> boxWithCarInside = new GenericBox<>(car);
// we can assign GenericBox<Car> type object to a GenericBox<? extends Vehicle>
// type variable - Car extends Vehicle.
        GenericBox<? super Car> boxWithSomeKindOfVehicleInside = boxWithCarInside;
        Car otherCar = new Car(150);
// illegal!
        boxWithSomeKindOfVehicleInside.setItem(otherCar);
    }
}
