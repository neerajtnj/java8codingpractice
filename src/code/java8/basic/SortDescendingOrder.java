package code.java8.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortDescendingOrder {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 4, 5, 3, 2, 1, 34, 5);
        List<Integer> result = integers.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted order :"+result);
    }
}
