package playbook_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToFromArray {
    public static void main(String[] args) {
        List<Integer> ints = List.of(20,50,30,80,70);
//        ints.remove(1);
//        System.out.println(ints);

        List<Integer> ints2 = ints.stream()
                .filter(i -> i <40)
                .collect(Collectors.toList());
        System.out.println(ints2);

        List<String> str = new ArrayList<>(List.of("Marie","Jake","Jon","Sanah"));
        str.removeIf(s -> s.endsWith("ie"));
        System.out.println(str);
        str.removeAll(List.of("Jake"));
        System.out.println(str);

        List<Person> personList = new ArrayList<>(List.of(new Person("Jon"),new Person("Andrew")));
        personList.removeIf(p -> p.name().equals("Andrew"));
        System.out.println(personList);

    }
    record Person(String name){}
}
