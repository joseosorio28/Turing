package com.turing.developers.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {
    
    public static void main(String[] args) {
    
        //System.out.println();
        findNumber(getArray());
    }
    
    public static void findNumber(List<int[]> data){
        
        int n = data.get(0)[0];
        int index = n+1;
        int q = data.get(index)[0];
        
        List<int[]> numbers = data.subList(1,index);
        
        for(int i=0; i<q;i++){
            int[] query = data.get(index+i+1);
            try{
                System.out.println(numbers.get(query[0]-1)[query[1]-1]);
            }catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }
    
    public static List<int[]> getArray(){
        
        List<int[]> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        if (n<=0){
            //return new int[0];
        }
        list.add(new int[]{n});
        
        for(int i=0; i<n; i++){
            int d = scanner.nextInt();
            if (d<=0){
                //return new int[0];
            }
            int[] a = new int[d];
            for (int j=0;j<d;j++){
                a[j] = scanner.nextInt();
            }
            list.add(a);
        }
    
        int q = scanner.nextInt();
        if (q<=0){
            //return new int[0];
        }
        list.add(new int[]{q});
    
        for(int i=0; i<q; i++){
            int[] a = new int[2];
            for (int j=0;j<2;j++){
                a[j] = scanner.nextInt();
            }
            list.add(a);
        }
        
        return list;
    }
}
