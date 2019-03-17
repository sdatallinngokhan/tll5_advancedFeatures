package week6.exercises;

public class NameReverser {

    public String getReverseEasily(String name) {
        return new StringBuilder(name).reverse().toString();
    }

    public String getReverse(String name) {
        String reversedName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversedName = reversedName + name.charAt(i);
        }

        return reversedName;
    }

    public static void main(String[] args) {
        NameReverser nameReverser = new NameReverser();

        System.out.println("Easy way result : " + nameReverser.getReverseEasily("Gokhan"));
        System.out.println("Normal way result : " + nameReverser.getReverse("Gokhan"));
    }
}
