package week6.oop.example;

public class Dog extends Animal {

    public boolean isBarking() {
        return true;
    }

    @Override
    public String eatingType() {
        return "carnivor";
    }

    @Override
    public String breathingType() {
        return "lungs";
    }
}
