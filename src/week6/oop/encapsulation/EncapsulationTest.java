package week6.oop.encapsulation;

public class EncapsulationTest {

    public static void main(String[] args) {
        Encapsulation1 encapsulation1 = new Encapsulation1("value_foo", "value_bar", false);

        System.out.println("Bar value 1 : " + encapsulation1.getBar());
        System.out.println("Foo value 1 : " + encapsulation1.getFoo());

        encapsulation1.setBar("Bar value 2 : " + "bar_value_different");
        System.out.println(encapsulation1.getBar());

        encapsulation1.setFoo("dangerous");
        System.out.println("Foo value 2 : " + encapsulation1.getFoo());
    }
}
