package week6.oop.inheritance;

public class Car extends Vehicle {

    public String name = "car_name";

    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    @Override // Override keyword is optional here, but it is nice to have for better readability
    public String vehicleType() {
        return "small vehicle";
    }

    // @Override keyword cannot be used here
    public String vehicleType2() {
        return "";
    }

    public void printValues() {
        System.out.println(super.name);
        System.out.println(this.name);

        System.out.println(vehicleType());
    }

    public String getNameFromVehicle() {
        return super.name;
    }

    public static void main(String[] args) {
        Car car = new Car(65); // I am using parameterized constructor since super class has no default const.

        car.printValues();
    }
}
