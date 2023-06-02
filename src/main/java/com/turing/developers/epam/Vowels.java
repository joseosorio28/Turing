package com.turing.developers.epam;

import java.util.Scanner;
/*
count the number of vowels occurring in all the substrings of a given String.
Consider a string of lowercase characters that contains 0 or more vowels.
The string is of length n and can be divided into n(n+1)/2 substrings.
The simple solution is to count the number of vowels within each substring and then add them together to get the final result.
Here is the code to count the number of vowels in all the substrings of a given string.

 */
public class Vowels {
    
    //calculates total sum of all vowel occurrences
    static int vowel_calc(String str)
    {
        int n = str.length();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++)
        {
            if (i == 0)
                // Number of times the 0th character occurs in all substrings
                arr[i] = n;
            else
                // Number of times the ith character occurs in all substrings
                arr[i] = (n - i) + arr[i - 1] - i;
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            // Check to see if ith character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                sum += arr[i];
        }
        
        // Return total sum of all vowel occurrences
        return sum;
    }
    
    // Driver Code
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        
        System.out.println(vowel_calc(str));
    }
}