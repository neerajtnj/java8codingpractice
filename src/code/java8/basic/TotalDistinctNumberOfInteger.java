package code.java8.basic;

import java.util.Arrays;
import java.util.List;

public class TotalDistinctNumberOfInteger {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 4, 11, 4, 7, 212, 3);
        long count = integers.stream().distinct().count();
        System.out.println("Count :"+count);
    }
}
