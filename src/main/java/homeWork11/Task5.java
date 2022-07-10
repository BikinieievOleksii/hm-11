package homeWork11;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        T[] arrayFirst = (T[]) first.toArray();
        T[] arraySecond = (T[]) second.toArray();
        ArrayList<T> rez = new ArrayList<>();
        if (arrayFirst.length >= arraySecond.length) {
            for (int i=0; i< arraySecond.length; i++) {
                rez.add(arrayFirst[i]);
                rez.add(arraySecond[i]);
            }
        } else {
            for (int i=0; i< arrayFirst.length; i++) {
                rez.add(arrayFirst[i]);
                rez.add(arraySecond[i]);
            }
        }
        return (rez.stream());
    }
}
