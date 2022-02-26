package code.java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWIth1 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10,15,8,49,25,98,32);
        List<String> numStartWith1 = integers.stream().map(s -> s + "").filter(s -> s.startsWith("1")).collect(Collectors.toList());
        System.out.println("Numbers start with 1s : "+numStartWith1);
    }
}
