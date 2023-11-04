package _collections;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

public class ReplaceElementsInList {

    public static void main(String[] args) {

        List<Double> doubles = new ArrayList<>(List.of(10.525,20.567,30.789));

        UnaryOperator<Double> operator = num -> BigDecimal.valueOf(num)
                        .setScale(2, RoundingMode.HALF_EVEN).doubleValue();

        UnaryOperator<Double> operator1 = num -> num < 30 ? BigDecimal.valueOf(num)
                .setScale(2,RoundingMode.HALF_EVEN).doubleValue():num;


        doubles.replaceAll(operator1);
        System.out.println(doubles);

        List<String> str = new ArrayList<>(List.of("mary","jake","thomas"));


        str.replaceAll(s-> s.substring(0,1).toUpperCase() + s.substring(1));
        str.sort(String::compareTo);

        // another way to sort
        str.sort(Comparator.reverseOrder());
        str.sort(Comparator.naturalOrder());
        System.out.println(str);

    }
}
