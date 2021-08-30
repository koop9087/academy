package by.academy.homework8.task1.logic;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomCalculator {
    public Map<String, Long> calculate(Integer countOfNums, Integer seed) {
        Stream<Double> list = Stream.generate(() -> new Random().nextInt(seed))
                .limit(countOfNums)
                .map(s -> s * Math.PI - 20)
                .filter(s -> s < 100)
                .distinct()
                .skip(3);
        list.collect(Collectors.toMap(z -> "Number : " + z, Double::longValue)).forEach((z, y) -> System.out.println(z + " " + y));
        return new HashMap<>();
    }
}
