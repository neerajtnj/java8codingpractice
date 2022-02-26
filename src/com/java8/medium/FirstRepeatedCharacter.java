package com.java8.medium;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String ultra="Rust is the widely used language across the world";
        Character result = ultra.chars().mapToObj(ch -> Character.toLowerCase(Character.valueOf((char) ch)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(chr -> chr.getValue() > 1L)
                .map(ch -> ch.getKey())
                .findFirst()
                .get();
        System.out.println("First Repeated Character : "+result);
    }
}
