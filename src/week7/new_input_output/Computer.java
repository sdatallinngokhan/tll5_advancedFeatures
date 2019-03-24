package week7.new_input_output;

import java.io.Serializable;

public class Computer implements Serializable {

    private String brand; // apple
    private String operatingSystem; // macOs
    private String type; // laptop

    public Computer(String brand, String operatingSystem, String type) {
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
