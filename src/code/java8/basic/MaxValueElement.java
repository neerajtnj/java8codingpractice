package code.java8.basic;

import java.util.Arrays;
import java.util.List;

public class MaxValueElement {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 32, 32, 78, 90, 70);
        Integer maxValue = integers.stream().max(Integer::compare).get();
        System.out.println("Max value in the List :"+maxValue);
    }

}
