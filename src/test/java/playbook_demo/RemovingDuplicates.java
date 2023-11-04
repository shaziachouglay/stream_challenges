package playbook_demo;

import java.util.*;
import java.util.stream.Collectors;

public class RemovingDuplicates {
    public static void main(String[] args) {

        List<Integer> ints = List.of(20,30,30,40,50,60,30,70);

        Set<Integer> intSet = new HashSet<>(ints);
        System.out.println(intSet);
        var a = intSet.stream().sorted().collect(Collectors.toList());
        System.out.println(a);

        List<Person> personList = new ArrayList<>(List
                .of(new Person("Jon"),new Person("Sanah"),new Person("Jon")));

        Set<Person> personSet = new HashSet<>(personList);
        System.out.println(personSet);


    }

    static class Person{

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        String name;

        public Person(String name){
            this.name = name;
        }
    }
}
