package _lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Colour_Container implements Iterable<Colour>{
    private final List<Colour> colours = new ArrayList<>();
    public void add(Colour colour) {
        colours.add(colour);
    }

    @Override
    public Iterator<Colour> iterator() {
        return colours.iterator();
    }

    @Override
    public void forEach(Consumer<? super Colour> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Colour> spliterator() {
        return Iterable.super.spliterator();
    }
}
