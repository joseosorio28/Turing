package com.turing.developers.learning.classes;

import java.util.Objects;

public class SuperClass {
    
    private int value = 10;
    
    protected void privateMethod(){
        System.out.println("private");
    }
    
    public void publicMethod(){
        System.out.println("public");
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperClass that = (SuperClass) o;
        return value == that.value;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
