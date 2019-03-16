package week6.inheritance;

public class Vehicle { // extends Object is here as default

    private int maxSpeed;

    public String name = "vehicle_name";

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
