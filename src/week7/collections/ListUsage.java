package week7.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListUsage {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Gokhan");
        names.add("Alex");
        names.add("Cristian");
        names.add("Alex");

        System.out.println("List elemets : " + names);

        System.out.println("1st index of list : " + names.get(1));

        // print out list elements by for loop
        for (String elementOfList : names) {
            System.out.println(elementOfList);
        }

        System.out.println("Size of list : " + names.size());
        System.out.println("Does the list contain Alex? " + names.contains("Alex"));
        System.out.println("Does the list contain Fargo? " + names.contains("Fargo"));

        names.remove("Alex");
        System.out.println(names);
        System.out.println("Does the list contain Alex? " + names.contains("Alex"));

//        names.remove("Alex");
        names.remove(2); // it will work as 1 above line
        System.out.println(names);

        // print out list elements by Iterator
        Iterator<String> iteratorOfNames = names.iterator();
        while (iteratorOfNames.hasNext()){
            System.out.println(iteratorOfNames.next());
        }

        names.clear();
        System.out.println(names);
    }

}
