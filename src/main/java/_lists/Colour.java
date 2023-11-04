package _lists;

public class Colour {

    @Override
    public String toString() {
        return "Colour{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    private final String name;

    public Colour(String name) {
        this.name = name;
    }
}
