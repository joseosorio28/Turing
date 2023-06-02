package com.turing.developers.learning.classes;

public interface ISuperClass2 {
    default void publicMethod(){
        System.out.println("public from interface 2");
    }

}
