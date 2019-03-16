package week6.oop.inheritance;

public class Vehicle { // extends Object is here as default

    private int maxSpeed;

    public String name = "vehicle_name";

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String vehicleType() {
        return "big vehicle";
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
