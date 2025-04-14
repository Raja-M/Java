package com.spring.core;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String[] fruits ={"apple", "banana", "carrot", "orange"};
       Character[] output = allFirstNonRepeating(fruits);
     for(char item : output) {
         System.out.println(item);
     }

    }
    public static Character nonRepating(String input) {
        return input.chars().mapToObj(c->((char)c))
                .collect(Collectors.toMap(e-> e, c->1, Integer::sum, LinkedHashMap::new))
                .entrySet().stream().filter(e->e.getValue()==1)
                .map(Map.Entry::getKey).findFirst().orElse(null);

    }

    public static Character[] allFirstNonRepeating(String[] input) {
        return Arrays.stream(input).map(Main::nonRepating).toArray(Character[]::new);
    }

}