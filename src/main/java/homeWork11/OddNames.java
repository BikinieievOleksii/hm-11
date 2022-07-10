package homeWork11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddNames {
    // task1
    public String oddNames (List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(index1 -> index1 + " " + names.get(index1))
                .collect(Collectors.joining(", "));
    }
}
