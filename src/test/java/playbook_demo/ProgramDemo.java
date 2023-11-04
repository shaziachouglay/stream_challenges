package playbook_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramDemo {
    public static String text = """
            "Tokyo, 3700000
                New York, 20_000_000
                Paris, 11.000.000
                """;

    public static void main(String[] args) {
        List<String> populations = new ArrayList<>();
        String[] lines = text.split("\n");
        for (String line : lines){
            String population = line.split(",")[1];
            String sanitized = population.replaceAll("[^\\d]","");
            populations.add(sanitized);
        }
        System.out.println(populations);


        var result = text.lines()
                .map(l-> l.split(",")[1])
                .map(population -> population.replaceAll("[^\\d]",""))
                .collect(Collectors.toList());
        System.out.println(result);

        
    }


}
