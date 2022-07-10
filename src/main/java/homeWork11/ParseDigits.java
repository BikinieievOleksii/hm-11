package homeWork11;

import java.util.ArrayList;
import java.util.Arrays;

public class ParseDigits {
    // task3
    public ArrayList<Integer> parseDigits(String[] mas) {
        ArrayList<Integer> rezult = new ArrayList();
        Arrays.stream(mas)
                .sorted()
                .forEach(string -> Arrays.stream(string.split(", "))
                        .map(chisloString -> Integer.parseInt(chisloString))
                        .sorted()
                        .forEach(chislo -> {
                            rezult.add(chislo);
                        }));
        return (rezult);
    }
}
