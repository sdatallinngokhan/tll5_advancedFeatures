package week6.generics.interface_example;

public class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car(200);
        Car car2 = new Car(150);

        if (car1.compareTo(car2) > 0) {
            System.out.println("Car1 is faster");
        } else if (car1.compareTo(car2) < 0) {
            System.out.println("Car2 is faster");
        } else {
            System.out.println("Cars' speed are equal");
        }
    }
}
