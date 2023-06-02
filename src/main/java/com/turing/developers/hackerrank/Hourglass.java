package com.turing.developers.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Hourglass {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        List<List<Integer>> arr = new ArrayList<>();
        
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        bufferedReader.close();
        
        findLargestHourglass(arr);
        
    }
    
    public static void findLargestHourglass2(List<List<Integer>> arr) {
    
        int sum = 0, max=Integer.MIN_VALUE;
    
        for(int i =0; i<4; i++){
            for(int j=0; j<4 ;j++){
                for(int k=j; k<j+3 ;k++){
                    if(k==j+1) {
                        sum += arr.get(k).get(i+1);
                    }
                    else {
                        sum += arr.get(k).get(i)+arr.get(k).get(i+1)+arr.get(k).get(i+2);
                    }
                }
                if(max<sum){
                    max=sum;
                }
                sum = 0;
            }
        }
    
        System.out.println(max);
    
    }
    
    public static void findLargestHourglass(List<List<Integer>> arr) {
        
        int[][] array = to2dArray(arr);
        int[][] hourglass = new int[3][3];
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                hourglass = getSubArray(array, i, j);
                sum = getSum(hourglass);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        
        System.out.println(max);
    }
    
    public static int[][] to2dArray(List<List<Integer>> arr) {
        
        int[][] array = new int[6][6];
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = arr.get(i).get(j);
            }
        }
        return array;
    }
    
    public static int getSum(int[][] array) {
        
        int sum = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(i == 1 && (j == 0 || j == 2))) {
                    sum += array[i][j];
                }
            }
        }
        
        return sum;
    }
    
    public static int[][] getSubArray(int[][] array, int rowIndex, int columnIndex) {
        
        int[][] subArray = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            subArray[i][0] = array[rowIndex + i][columnIndex];
            subArray[i][1] = array[rowIndex + i][columnIndex + 1];
            subArray[i][2] = array[rowIndex + i][columnIndex + 2];
        }
        
        return subArray;
    }
    
}