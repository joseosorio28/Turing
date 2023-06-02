package com.turing.developers.learning.classes;

public interface ISuperClass {
    
    default void publicMethod(){
        System.out.println("public from interface 1");
    }
    
}
