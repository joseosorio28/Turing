package com.turing.developers.epam;

import java.util.Arrays;

public class RemoveZeros {
    
    static int[] removeZeros(int[] a){
        int j =0;
        for(int i =0;i<a.length;i++) {
            if(a[i] !=0) {
                a[j] = a[i];
                j++;
            }
        }
//        while (j < a.length) {
//            a[j] = 0;
//            j++;
//        }
        return Arrays.copyOfRange(a,0,j);
    }
    
    public static void main(String[] args) {
        int[] a = new int[]{5,0, 5, 6, 0, 0, 2, 5};
        System.out.println(Arrays.toString(a));
        a = removeZeros(a);
        System.out.println(Arrays.toString(a));
    }

}
