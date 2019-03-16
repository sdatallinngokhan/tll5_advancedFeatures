package week6.oop.abstract_and_interface.abstract_;

public class AbstractTest {

    public static void main(String[] args) {
        Vehicle car = new Car();
        car.move();

        Vehicle train = new Train();
        train.move();

        // POLYMORPHISM POWER
        if (car instanceof Car) {
            car = new Train();
            car.move();
        }
    }
}
