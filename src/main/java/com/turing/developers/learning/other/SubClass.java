package com.turing.developers.learning.other;

import com.turing.developers.learning.classes.ISuperClass;
import com.turing.developers.learning.classes.ISuperClass2;

public class SubClass implements ISuperClass {
    
    public static void main(String[] args) {
        
        SubClass subClass = new SubClass();
        SubClass.InnerClass innerClass = new InnerClass();
        subClass.publicMethod();
        innerClass.publicMethod();
    }
    
    private static class InnerClass implements ISuperClass2 {
    
    }
    
}
