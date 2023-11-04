package _maps;

import java.util.HashMap;
import java.util.Map;

public class MapRemoveReplaceDuplicates {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>(Map.of(
                1,"Go",
                2,"JavaScript",
                3, "C#",
                4, "Kotlin",
                5, "Java"
        ));

       // map.entrySet().removeIf(entry -> entry.getValue().endsWith("#"));
//        map.entrySet().removeIf(entry -> entry.getKey().equals(4));
//        System.out.println(map);

//        map.replace(4,"C#");
//        System.out.println(map);

       // map.replaceAll(4,"Kotlin","Golang");

    }
}
