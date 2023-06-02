package com.turing.developers.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TagContentExtractorTest {
    
    private final TagContentExtractor tagContentExtractor = new TagContentExtractor();
    
    @Test
    void tagContentExtractor() {
        
        List<String> sampleInputs = Arrays.asList(
                "4",
                "<h1>Nayeem loves counseling</h1>",
                "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>",
                "<Amee>safat codes like a ninja</amee>",
                "<SA premium>Imtiaz has a secret crush</SA premium>"
        );
        List<String> expected = new ArrayList<>(Arrays.asList(
                "None",
                "Nayeem loves counseling",
                "Sanjay has no watch\nSo wait for a while",
                "None",
                "Imtiaz has a secret crush"
        ));
        Collections.reverse(expected);
        Stack<String> expectedOutputs = new Stack<>();
        expectedOutputs.addAll(expected);
        
        for (String input : sampleInputs) {
            String result = tagContentExtractor.tagContentExtractor(input);
            System.out.println("Expected: " + expectedOutputs.peek() + " -> Actual: " + result);
            assertEquals(expectedOutputs.peek(), result);
            expectedOutputs.pop();
        }
    }
}