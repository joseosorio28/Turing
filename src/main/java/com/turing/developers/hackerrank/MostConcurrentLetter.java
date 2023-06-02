package com.turing.developers.hackerrank;

import java.util.Map;
import java.util.stream.Collectors;

public class MostConcurrentLetter {
    
    public static void main(String[] args) {
        
        String input = "Test string with multiple letters to count";
        input="getMostRepeatedCharacterFromString";
        System.out.println(getMostRepeatedCharacterFromString(input));
        System.out.println(getMostRepeatedCharacterFromString2(input));
    }
    
    private static String getMostRepeatedCharacterFromString(String input) {
        
        return input.chars()
                .filter(c -> !Character.isWhitespace(c)) // ignoring space
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(p->p.getKey()+"="+p.getValue())
                .orElse("Empty string");
    }
    
    private static String getMostRepeatedCharacterFromString2(String input) {
        
        return input.chars()
                .filter(c -> !Character.isWhitespace(c)) // ignoring space
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .map(p->p.getKey()+"="+p.getValue())
                .collect(Collectors.toList()).toString();
    }
    
}
