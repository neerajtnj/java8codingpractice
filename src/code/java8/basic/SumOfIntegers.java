package code.java8.basic;

import java.util.Arrays;
import java.util.List;

public class SumOfIntegers {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3,6 , 4, 5);
        Integer result = integers.stream()
                .reduce(0, (sumOfTotal, element) -> sumOfTotal + element,Integer::sum);
        System.out.println("Sum of Integers :"+result);
    }
}
