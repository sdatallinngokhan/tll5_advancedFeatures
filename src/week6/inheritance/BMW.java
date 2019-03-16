package week6.inheritance;

public class BMW extends Car{

    public BMW(int maxSpeed) {
        super(maxSpeed);
    }

    public void test(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        System.out.println(getNameFromVehicle());
    }

    public static void main(String[] args) {
        BMW bmw = new BMW(67);
        bmw.test();
    }
}
