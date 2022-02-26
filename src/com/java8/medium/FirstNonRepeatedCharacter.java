package com.java8.medium;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String ultra="golang is the widely used language across the world";
        Character result = ultra.chars().mapToObj(ch -> Character.toLowerCase(Character.valueOf((char) ch)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(key -> key.getValue() == 1l)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println("First Non Repeated Character :"+result);
    }
}
