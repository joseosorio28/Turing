package com.turing.developers.epam;

import java.util.Arrays;

public class Algorithm {
    
    public int binarySearch(int[] array, int value){

        // Repeat until the pointers low and high meet each other
        int low = 0;
        int high = array.length-1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (array[mid] == value)
                return mid;
            if (array[mid] < value)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
    
    public int unsortedBinarySearch(int[] array, int value){
        
        Arrays.sort(array);
        // Repeat until the pointers low and high meet each other
        int low = 0;
        int high = array.length-1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (array[mid] == value)
                return mid;
            if (array[mid] < value)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
    
    
}
