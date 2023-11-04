package _lists;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Stream_Challenges {

    @Test

    public void calculateAvgValues(){
        List<Integer> nums = List.of(1,4,6,8,9);
        var result = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average().orElse(0.0);
        System.out.println(result);
    }
    @Test
    public void calculateOddAndEvn(){
        List<Integer> nums = List.of(5,8,3,0,45,2,8,34);
        var resultOfEven  = nums.stream()
                .filter(e -> e% 2 == 0)
                .mapToInt(Integer::intValue).sum();
        System.out.println(resultOfEven);

        var resultOfOdd  = nums.stream()
                .filter(e -> e% 2 == 1)
                .mapToInt(Integer::intValue).sum();
        System.out.println(resultOfOdd);
    }
    @Test
    public void duplicateRemoval(){
        List<Integer> nums = List.of(23, 78, 23, 65,78, 2, 4, 6);
        var a = nums.stream().min(Integer::compareTo).stream().count();
        System.out.println(a);
        var result = nums.stream()
                .distinct().collect(Collectors.toList());
        System.out.println(result);
    }

    @Test

    public void convertCharToUppercase(){
        String str = " best of luck!!";
        System.out.println(charToUpper(str,'o'));

    }

    private static String charToUpper(String str, char charToUpper){
        var sb = new StringBuilder();
        for (char c : str.toCharArray()){
          char charToAppend  =  c == charToUpper ? Character.toUpperCase(c):c;
          sb.append(charToAppend);
        }
        return sb.toString();
    }
}
