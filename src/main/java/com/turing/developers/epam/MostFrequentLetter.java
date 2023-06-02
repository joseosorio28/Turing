package com.turing.developers.epam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostFrequentLetter {
    
    public static void main(String[] args) {
        System.out.println(mostFrequentlyDuplicateLetters("test"));
    }
    
    public static Map.Entry<String,Long> mostFrequentlyDuplicateLetters(String word){
        char[] letterList = word.toCharArray();
        return Stream.of(letterList)
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()))
                .entrySet()
                .stream().max(Map.Entry.comparingByValue())
                .get();
    }
    
}
