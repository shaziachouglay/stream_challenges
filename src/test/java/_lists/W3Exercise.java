package _lists;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class W3Exercise {
    public static Colour red = new Colour("Red");
    public static Colour blue = new Colour("Blue");
    public static Colour green = new Colour("Green");

    private Colour_Container colour_container = new Colour_Container();

    private final List<Colour> colours = new ArrayList<>();

    @Test
    public void shouldAdColours() {
        colour_container.add(red);
        colour_container.add(blue);
        colour_container.add(green);
        assertThat(colour_container, contains(red, blue, green));

    }

    @Test
    public void shouldfilterColours() {
        var colors = new ArrayList<>(List.of(red, blue, green, red));

        var result = colors.stream()
                .filter(c -> !c.equals(red))
                .map(Colour::getName).collect(Collectors.toList());

        System.out.println(result);

    }

    @Test

    public void calculateAvgValue() {
        List<Integer> nums = Arrays.asList(1, 4, 7, 9, 12);

        double average = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("average val is " + average);
    }
    @Test
    public void stringConversion(){
        List<String> random = Arrays.asList("some","toothbrush","roses","boring");

       List<String> val =  random.stream()
                .map(String::toLowerCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(val);
    }
    @Test
    public void calculate(){
        List<Integer> nums = Arrays.asList(2,6,7,8,9,13);

        int sumOevens = nums.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumOevens);

        int sumOfOdd = nums.stream()
                .filter(num -> num % 2 == 1)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumOfOdd);

    }

    @Test
    public void duplicateRemoval(){
        List<String> names = Arrays.asList("sanya", "Mahi", "vinru","mahi","ajay");

        List<String> newName = names.stream()
                .map(String::toLowerCase)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(newName);
    }
    @Test
    public void stringCount(){
        List<String> names = Arrays.asList("Sanya", "Mahi", "vinru","mahi","ajay","ali","Sanjay");
        char startingLetter = 'S';
        List<String > newName = names.stream()
                .filter(n -> n.startsWith(String.valueOf(startingLetter))).collect(Collectors.toList());

//        List<String> newName = names.stream()
//                .filter(n -> n.startsWith("s")).collect(Collectors.toList());
        System.out.println(newName);
    }

    @Test
    public void findMaxAndMinVal(){
        List<Integer> nums =  Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
        int  minNums = nums.stream()
                .min(Integer::compare)
                .orElse(null);
        System.out.println(minNums);

        int maxNum =nums.stream()
                .max(Integer::compare)
                .orElse(null);
        System.out.println(maxNum);

        List<Integer> result = nums.stream()
                .sorted().collect(Collectors.toList());
        System.out.println(result);

        List<Integer> reverseResult = nums.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverseResult);
    }

    @Test
    public void findSecondAndLargestNum(){
      //  List<Integer> nums =  Arrays.asList(2, 17, 54, 14, 14, 33, 45, -11);
        List<Integer> nums =  List.of(2, 17, 54, 14, 14, 33, 45, -11);

        Integer secondSmallest = nums.stream().distinct()
                .sorted().skip(1)
                .findFirst().orElse(null);
        System.out.println(secondSmallest);

        Integer secondLargest = nums.stream().distinct()
                .sorted(Comparator.reverseOrder()).skip(1)
                .findFirst().orElse(null);
        System.out.println(secondLargest);


    }
}
