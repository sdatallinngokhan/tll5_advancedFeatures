package week6.exceptions;

public class Car {

    private int carSpeed;

    public Car(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    public void increaseSpeed() {
        try {
            carSpeed = carSpeed + 70;
            if (carSpeed > 200) {
                throw new CarCrashedException(this); // this keyword is used to point out class itself
            }
        } catch (CarCrashedException e) {
            e.printStackTrace();
        }
    }
}
