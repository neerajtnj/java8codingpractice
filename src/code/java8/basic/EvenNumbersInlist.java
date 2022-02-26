package code.java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersInlist {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 4, 3, 8, 2, 2);
        List<Integer> evenNumList = integers.stream().
                filter(value -> value%2== 0).collect(Collectors.toList());
        System.out.println("Even number list: "+evenNumList);
    }
}
