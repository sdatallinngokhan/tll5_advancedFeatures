package week7.collections;

import java.util.*;

public class MapUsage {

    public static void main(String[] args) {
        Map<Integer, String> idCodeAndNameMap = new HashMap<>();

        idCodeAndNameMap.put(123, "Gokhan");
        idCodeAndNameMap.put(124, "Alex");
        System.out.println(idCodeAndNameMap);

        idCodeAndNameMap.put(124, "Fargo"); // Fargo value overrides Alex, because keys are same. Keys can not be duplicated
        System.out.println(idCodeAndNameMap);

        System.out.println("123 key's value : " + idCodeAndNameMap.get(123));

        for (Integer key : idCodeAndNameMap.keySet()) {
            System.out.println(idCodeAndNameMap.get(key));
        }

        List<String> namesList = new ArrayList<>();
        namesList.addAll(idCodeAndNameMap.values()); // values of a map can be transferred to a list
        System.out.println(namesList);

        Set<String> namesSet = new HashSet<>();
        namesSet.addAll(idCodeAndNameMap.values()); // values of a map can be transferred to a set
        System.out.println(namesSet);
    }

}
