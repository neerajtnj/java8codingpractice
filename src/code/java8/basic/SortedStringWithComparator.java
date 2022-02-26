package code.java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStringWithComparator {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Jack", "kerry", "pisa", "moly");
        List<String> result = strings.stream()
                .sorted((a, b) -> a.compareToIgnoreCase(b))
                .collect(Collectors.toList());
        System.out.println("Sorted String with ascending Order :"+result);
    }
}
