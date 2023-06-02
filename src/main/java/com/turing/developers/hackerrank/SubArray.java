package com.turing.developers.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class SubArray {
    
    public static void main(String[] args) {
        
    
        int[] array = getArray();
        System.out.println(findNegativeSubarrays2(array));
        
    }
    
    public static int[] getArray(){
    
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n<=0){
            return new int[0];
        }
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        return a;
    }
    
    private static int findNegativeSubarrays2(int[] a){
        int n = a.length;
        int sum = 0, count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i;j++){
                for(int k=j; k<n-i;k++){
                    sum += a[k];
                }
                if(sum<0){
                    count++;
                }
                sum =0;
            }
        }
        return count;
    }
    
    private static int findNegativeSubarrays(int[] array) {
    
        int count=0;
        
        if(array.length == 0){
            return count;
        }
        
        for(int value:array){
            if(value<0){
                count++;
            }
        }
        
        int sum = getArraySum(array);
        if(sum<0){
            count++;
        }
        
        for(int i=2;i<array.length;i++){
            int subarrayAmount = getSubarrayAmount(array.length, i);
            for(int j=0;j<subarrayAmount;j++){
                int[] subArray = Arrays.copyOfRange(array,j,j+i);
                sum = getArraySum(subArray);
                if(sum<0){
                    count++;
                }
            }
        }        
    
        return count;
        
    }
    
    private static int getSubarrayAmount(int length, int iteration) {
        
        int subarrayAmount;
        
        if(length % 2 == 0) {
            subarrayAmount = 2 * (length / iteration) - iteration % 2 + 1;
        }else{
            subarrayAmount = 2 * (length / iteration) + iteration % 2;
        }
        
        return subarrayAmount;
    }
    
    private static int getArraySum(int[] array) {
        
        int sum=0;
        
        for(int value:array){
            sum+=value;    
        }        
        
        return sum;
    }
    
}
