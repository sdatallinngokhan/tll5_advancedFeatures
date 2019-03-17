package week6.exceptions;

public class CarCrashedException extends Exception {

    public CarCrashedException(Car car) { // we sent car to know which car has been crashed
        // calling Exception(String message) constructor
        super("Car " + car + " has crashed!");
    }
}
