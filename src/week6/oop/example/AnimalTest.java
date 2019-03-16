package week6.oop.example;

public class AnimalTest {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal frog = new Frog();

        System.out.println("Dog's eating type : " + dog.eatingType());
        System.out.println("Frog's eating type : " + frog.eatingType());
    }
}
