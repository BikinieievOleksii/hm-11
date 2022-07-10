package homeWork11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Alex", "Taras", "Nastya", "John", "Inna");

        String[] example1 = {"1, 2, 0", "4, 5"};

        List<Integer> example2 = List.of(3, 2, 5, 88, 333, 0);
        List<Integer> example3 = List.of(4, 9, 14, 53);

        OddNames oddNames = new OddNames();
        UpperCase upperCase = new UpperCase();
        ParseDigits parseDigits = new ParseDigits();
        GeneratorNumber generatorNumber = new GeneratorNumber();
        Task5 task5 = new Task5();
        System.out.println(oddNames.oddNames(names));
        System.out.println(upperCase.upperCase(names));
        System.out.println(parseDigits.parseDigits(example1));
        generatorNumber.generatorNumber(25214903917L, 11L, (long) Math.pow(2, 48), 3L);
        System.out.println(task5.zip(example2.stream(), example3.stream()).collect(Collectors.toList()));
    }
}
