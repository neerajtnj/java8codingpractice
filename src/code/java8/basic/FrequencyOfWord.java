package code.java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWord {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("John", "Kerry", "Jenny", "Kerry", "Seaun", "Lerry", "John");
        Map<String, Long> collect = strings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Frequency :"+collect);
    }
}
