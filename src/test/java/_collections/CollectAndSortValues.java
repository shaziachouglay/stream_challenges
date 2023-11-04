package _collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectAndSortValues {
    static List<String>  values;
    public static void main(String[] args) {

            Map<Integer, String> aMap = Map.of(
                    1, "Java",
                    2, "C#",
                    3, "JavaScript",
                    4, "Python",
                    5, "Go",
                    6, "JavaScript");

            List<String> distinctValues = collectDistinctValues(aMap);
            System.out.println(distinctValues);

            List<String> reversed = reverseList(distinctValues);
            System.out.println(reversed);  // Expected: [Python, JavaScript, Java, Go, C#]

        }

        public static List<String> collectDistinctValues(Map<Integer, String> aMap) {
            values = aMap.values()
                   .stream().distinct().collect(Collectors.toList());
           return values;
        }

        public static List<String> reverseList(List<String> values) {
            return  values.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        }
    }


