package _collections;

import java.util.HashMap;
import java.util.Map;

public class UniqueVlaues {



    public static void main(String[] args) {


        Map<Integer,String> vals = new HashMap<>();
        vals.put(1, "a");
        vals.put(2, "b");
        vals.put(3, "a");
        System.out.println(vals);

    }
}
