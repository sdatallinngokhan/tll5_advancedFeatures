package week6.generics.basics;

public class NormalBoxTest {

    public static void main(String[] args) {
        Car car = new Car();
        NormalBox normalBox = new NormalBox(car);

        Car carFromBox = (Car) normalBox.getItem(); // I could reach the Car object by casting

        Airplane airplaneFromBox = (Airplane) normalBox.getItem(); // this is an example of unsafe casting
    }
}
