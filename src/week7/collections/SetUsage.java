package week7.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetUsage {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Gokhan");
        names.add("Alex");
        System.out.println(names);

        names.add("Alex"); // an element can not be added more than 1 times to a Set
        System.out.println(names);

        for (String name : names) { // Set does not have get method, So a loop should be used to get elements 1 by 1
            System.out.println(name);
        }

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }
    }

}
