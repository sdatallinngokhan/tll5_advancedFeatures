package week6.inheritance;

public class Car extends Vehicle {

    public String name = "car_name";

    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    public void printValues(){
        System.out.println(super.name);
        System.out.println(this.name);
    }

    public String getNameFromVehicle(){
        return super.name;
    }

    public static void main(String[] args) {
        Car car = new Car(65); // I am using parameterized constructor since super class has no default const.

        car.printValues();
    }
}
