package _maps;

import java.util.*;
import java.util.stream.Collectors;

public class MapOverview {

    public static void main(String[] args) {

        Map<Integer,String> immutable = Map.of(
                1,"Java",
                2, "C#",
                3,"JavaScript",
                4,"JavaScript"
        );

        Map<Integer,String> mutable = new HashMap<>(Map.of(
                1,"Java",
                2, "C#",
                3,"JavaScript",
                4,"JavaScript"
        ));
        System.out.println(immutable.entrySet());

        // to find if map has duplicate values
        System.out.println(mapHasDuplicates(immutable));
        System.out.println(collectDuplicateValues(immutable));
    }

    private static <K,V>List<V> collectDuplicateValues(Map<K,V> map) {
        return map.values().stream()
                .filter(value -> Collections.frequency(map.values(),value) > 1)
                .distinct()
                .collect(Collectors.toList());
    }

    private static <K,V> boolean mapHasDuplicates(Map<K,V> map) {
        Collection<V> valuesList = map.values();
        Set<V> valueSet = new HashSet<>(valuesList);
        return valuesList.size() != valueSet.size();
    }
}
