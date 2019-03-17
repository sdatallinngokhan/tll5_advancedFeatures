package week6.generics.extends_example;

public class GarageTest {

    public static void main(String[] args) {
        Car car = new Car();
        Garage<Car> aGarageWithCarInIt = new Garage<>(car);
        aGarageWithCarInIt.repairVehicle();

        Airplane airplane = new Airplane();
        Garage<Airplane> aGarageWithAirplaneInIt = new Garage<>(airplane);
        aGarageWithAirplaneInIt.repairVehicle();
    }
}
