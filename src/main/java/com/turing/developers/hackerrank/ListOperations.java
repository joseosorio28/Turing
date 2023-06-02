package com.turing.developers.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    
    
    public static void main(String[] args) {
    
        List<Integer> list = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
    
        int n = scanner.nextInt();
        if (n<=0){
            //return new int[0];
        }
    
        for(int i=0; i<n; i++){
            int d = scanner.nextInt();
            list.add(d);
        }
    
        int q = scanner.nextInt();
        if (q<=0){
            //return new int[0];
        }
        
        for(int i=0; i<q; i++){
            
            scanner.nextLine();
            String operation = scanner.nextLine();
            
            if(operation.equals("Insert")){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                
                list.add(x,y);
            }
            
            if(operation.equals("Delete")){
                int x = scanner.nextInt();
                list.remove(x);
            }
        }
    
        System.out.println(list.toString()
                .replaceAll("\\[","")
                .replaceAll("\\]","")
                .replaceAll(",","")
        );
        
    }
    
}
