package com.turing.developers.epam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPrinter {
    
    public static void main(String[] args) {
        print("jay10");
    }
    
    public static void print(String word){
        
        Pattern pattern = Pattern.compile("([a-zA-Z]*)([0-9]+)");
        Matcher matcher = pattern.matcher(word);
        
        if(matcher.find()){
            String text = matcher.group(1);
            int times = Integer.parseInt(matcher.group(2));
            for(int i=0;i<times;i++){
                System.out.print(text);
            }
        }
        
    }
}
