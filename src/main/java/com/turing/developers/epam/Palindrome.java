package com.turing.developers.epam;

public class Palindrome {
    
    public static void main(String[] args) {
        System.out.println(isPalindrome("Racecara"));
    }
    
    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }
}
