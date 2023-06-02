package com.turing.developers.hackerrank;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        String[] testStrings = {
                getRandomString(127),
                "()",
                "()[]{}",
                "(]",
                "([)]",
                "{[()]}",
                getRandomString(127),
                "{}()",
                "({()})",
                "{}(",
                "[]"
        };
        
        for (String s : testStrings) {
            System.out.println("Test string: " + s);
            System.out.println("isValid: " + isValid(s) + "\n");
        }
        
    }
    
    public static boolean isValid(String input) {
        
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char peekChar = stack.peek();
                if ((current == ')' && peekChar != '(')
                        || (current == '}' && peekChar != '{')
                        || (current == ']' && peekChar != '[')) {
                    return false;  // for a valid input, a close brackets must have an open brackets
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
    
    public static String getRandomString(int length) {
        byte[] array = new byte[length]; // bounded by length
        new Random().nextBytes(array);
        return new String(array, StandardCharsets.UTF_8);
    }
}
