package playbook_demo;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ProgramDemo_Maths {

    public static void main(String[] args) {

        var locale = Locale.GERMAN;
        var style = NumberFormat.Style.LONG;

        List<String> nums = List.of("3700000","2000000","1100000");

        var formatter = NumberFormat.getCompactNumberInstance(locale,style);
       List<String> formattedNums =  nums.stream()
                .map(Integer::parseInt)
                .map(formatter::format)
                .collect(Collectors.toList());

        System.out.println(formattedNums);

        List<String> prices = List.of("20.15","37.22","58.19");
        var formatter1 = new DecimalFormat("#.00");
        formatter1.setRoundingMode(RoundingMode.HALF_UP);
       List <String> newPrice = prices.stream()
                .map(Double::parseDouble)
                .map(price -> price * 1.3)
               .map(formatter::format)
                .collect(Collectors.toList());

        System.out.println(newPrice);

        int x = 5;
        System.out.println(x++ + ++x);
    }
}
