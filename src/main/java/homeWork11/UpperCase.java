package homeWork11;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    // task2
    public List<String> upperCase (List<String> list) {
        return list.stream()
                .map(s -> s.toUpperCase())
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}
