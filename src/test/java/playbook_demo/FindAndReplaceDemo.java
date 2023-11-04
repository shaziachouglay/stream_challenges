package playbook_demo;

public class FindAndReplaceDemo {

    public static void main(String[] args) {
       findMatches();
       replace();
    }

    public static void findMatches(){
        String str = "Java 17 recipes!";

        System.out.println(str.matches("Java 17 recipes!"));
        System.out.println(str.matches("Java 17"));
        System.out.println(str.matches("[Jj]ava.*"));
        System.out.println(str.matches("Java [0-9]+ [Rr]ecipes!"));

    }
    private static void replace(){
        String str = "11 Recipes for Java11";

        System.out.println(str.replace("11","17"));
        System.out.println(str.replaceAll("11","17"));
        System.out.println(str.replaceFirst("11","17"));

    }
}
