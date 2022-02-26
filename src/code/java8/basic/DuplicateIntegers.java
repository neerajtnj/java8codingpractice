package code.java8.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateIntegers {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 3, 4, 3, 1, 1);
        Set<Integer> intSet= new HashSet<>();
        Set<Integer> duplicateValues = integers.stream().filter(n -> !intSet.add(n)).collect(Collectors.toSet());
        System.out.println("Duplicate Integer values :"+duplicateValues);
    }
}
