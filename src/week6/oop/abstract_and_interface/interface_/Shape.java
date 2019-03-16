package week6.oop.abstract_and_interface.interface_;

public interface Shape {

    double getArea(); // interface methods are public as default
    double getPerimeter(); // interface methods can not be private or protected

    default void printMyName(){ // interfaces can have only 1 method type with body. and it has to have default prefix as a keyword
        System.out.println("My name is bla bla");
    }
}
