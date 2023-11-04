package playbook_demo;

import org.junit.Test;

import java.util.function.IntPredicate;

public class StringWithSpecificChars {
    private static final String ONLY_DIGITS = "123";
    private static final String NOT_ONLY_DIGITS = "123A";
    private static final String ONLY_LETTERS = "ABD";
    private static final String NOT_ONLY_LETTERS = "ABC123";


    public static void main(String[] args) {

        IntPredicate isDigit = Character::isDigit;
        IntPredicate isLetter = Character::isLetter;
        IntPredicate isLetterOrDigit = Character::isLetterOrDigit;

        System.out.println(containOnlyCharacter(ONLY_DIGITS,isDigit));

    }

    public static boolean containOnlyCharacter(String str, IntPredicate predicate){
        return str.chars().allMatch(predicate);

    }
}
