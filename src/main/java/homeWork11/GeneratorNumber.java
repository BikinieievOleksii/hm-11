package homeWork11;

import java.util.stream.Stream;

public class GeneratorNumber {
    // task 4
    public Stream<Long> generatorNumber(Long a, Long c, Long m, Long seed) {
        return Stream.iterate(seed,n -> (a * n + c) % m);
    }
}
