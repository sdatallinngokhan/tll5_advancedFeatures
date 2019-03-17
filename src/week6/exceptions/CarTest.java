package week6.exceptions;

public class CarTest {

    public static void main(String[] args) {
        Car car = new Car(50);
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        Car car2 = new Car(160);
        car2.increaseSpeed();
    }
}
