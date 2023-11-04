package _collections;

import java.util.*;

import static java.util.Comparator.comparing;

public class AdvancedSorting {
    public static void main(String[] args) {


        List<Person> personList = new ArrayList<>(Arrays.asList(
                null,
                new Person("Jake", 28),
                new Person("Dylon", 30),
                new Person("Andy", 48),
                new Person("Rob", 36),
                new Person("John", 35),
        null
        ));
//        personList.sort(comparing(Person::age));
//        personList.sort(comparing(Person::name));
//        personList.sort(comparing(Person::name).reversed());
//        personList.sort(Comparator.nullsFirst(comparing(Person::name)));
//        System.out.println(personList);
//
//        personList.stream()
//                .filter(Objects::nonNull)
//                .sorted(Comparator.comparing(Person::age))
//                .forEach(System.out::println);

        Person[] personArr = {
                null,
                new Person("Jake", 28),
                new Person("Dylon", 30),
                new Person("Andy", 48),
                new Person("Rob", 36),
                new Person("John", 35),
                null
        };
        Arrays.sort(personArr,Comparator.nullsFirst(comparing(Person::age)));
        System.out.println(Arrays.toString(personArr));

    }
}