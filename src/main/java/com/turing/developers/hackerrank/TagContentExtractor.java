package com.turing.developers.hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    
    public String tagContentExtractor(String text){
    
        String regex = "<(.+)>([^<>]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        
        StringBuilder stringBuilder = new StringBuilder();
        
        if(!matcher.find()){
            return "None";
        }
        matcher.reset();
        
        while(matcher.find()){
            if(stringBuilder.length()>1) {
                stringBuilder.append("\n");
                stringBuilder.append(matcher.group(2));
            }
            else{
                stringBuilder.append(matcher.group(2));
            }
        }
        
        return stringBuilder.toString();
    }
}
