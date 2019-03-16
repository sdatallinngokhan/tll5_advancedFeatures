package week6.oop.abstract_and_interface.interface_.example;

public class Rectangle extends ShapeClass implements ShapeInterface1, ShapeInterface2{

    @Override
    public double getArea(){ // this method is optional
        return 1;
    }
}
