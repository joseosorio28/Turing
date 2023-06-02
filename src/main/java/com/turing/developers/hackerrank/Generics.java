package com.turing.developers.hackerrank;

import java.util.Arrays;
import java.util.List;

public class Generics {
    
    public static void main(String[] args) {
        
        Integer[] intArray = {1,2,3};
        String[] sArray = {"Hello","World"};
        
        printArray(intArray);
        printArray(sArray);
        
    }
    
    private static <T> void printArray(T[] t) {
        Arrays.stream(t).forEach(System.out::println);
    }
    
    private static <T> void printList(List<T> t) {
        t.forEach(System.out::println);
    }
    
}
