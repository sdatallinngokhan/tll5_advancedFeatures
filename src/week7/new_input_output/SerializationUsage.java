package week7.new_input_output;

import java.io.*;

public class SerializationUsage {

    public void readFile(String pathString) {
        Person person;
        try {
            File file = new File(pathString);
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            person = (Person) objectInputStream.readObject();

            System.out.println("Deserialized first name : " + person.getFirstName());
            System.out.println("Deserialized last name : " + person.getLastName());

            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeFile(String pathString) {
        Person person = new Person("Gokhan", "Polat");
        try {
            File file = new File(pathString);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(person);

            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SerializationUsage serializationUsage = new SerializationUsage();

        String path = "/Users/gokhanpolat/Developer/tallinn5/serializationTest.txt";
        serializationUsage.writeFile(path);

        serializationUsage.readFile(path);
    }
}

class Person implements Serializable {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
