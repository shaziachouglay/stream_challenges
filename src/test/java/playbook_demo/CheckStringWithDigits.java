package playbook_demo;

public class CheckStringWithDigits {

    public static void main(String[] args) {
        System.out.println(hasOnlyNumericChars("""
            37000000,
            20000000,
            11.000.000
            """));
    }

    public static boolean hasOnlyDigits(String text){
        return text.chars().allMatch(Character::isDigit);
    }

    public static boolean hasOnlyNumericChars(String text){
        String[] lines = text.split(",");
        for (String line : lines){
            String strippedLine = line.strip();
            if (!hasOnlyDigits(strippedLine)){
                return false;
            }
        }
        return true;
    }
}
