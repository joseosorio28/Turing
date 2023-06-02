package com.turing.developers.epam;

import java.util.Arrays;

public class BinaryConverter {
    
    public static int[] invert(int[] array) {
        return Arrays.stream(array)
                .map(value -> value == 0 ? 1 : 0)
                .toArray();
    }
    
    public static void main(String[] args) {
        int[] array = {1,1,0,1};
        System.out.println(Arrays.toString(array));
        int[] output = invert(array);
        System.out.println(Arrays.toString(output));
        
    }
}
