package week6.generics;

public class NormalBoxTest {

    public static void main(String[] args) {
        Car car = new Car();
        NormalBox normalBox = new NormalBox(car);

        Car carFromBox = (Car) normalBox.getItem(); // I could reach the Car object by casting
    }
}
