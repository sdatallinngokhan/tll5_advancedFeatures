package week6.oop.abstract_and_interface.interface_;

public class Rectangle implements Shape, Shape2 { // it is possible to implement 2 different interfaces

    private int edge1;
    private int edge2;

    public Rectangle(int edge1, int edge2) {
        this.edge1 = edge1;
        this.edge2 = edge2;
    }

    @Override
    public double getArea() {
        return edge1 * edge2;
    }

    @Override
    public double getPerimeter() {
        return 2 * edge1 + 2 * edge2;
    }
}
