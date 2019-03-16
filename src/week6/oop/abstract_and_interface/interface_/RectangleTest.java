package week6.oop.abstract_and_interface.interface_;

public class RectangleTest {

    public static void main(String[] args) {
        int edge1 = 5;
        int edge2 = 4;
        Shape rectangle = new Rectangle(edge1, edge2);

        System.out.println("Area : " + rectangle.getArea());
        System.out.println("Perimeter : " + rectangle.getPerimeter());

        System.out.println();
        System.out.println();

        rectangle.printMyName();
    }
}
