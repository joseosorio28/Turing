package com.turing.developers.learning.classes;

import com.turing.developers.hackerrank.GroupedInterface;

public class OuterClass extends SuperClass implements GroupedInterface {
    
    static String name;
    
    public String getNames(){
        String names = name;
        
        return name + GroupedInterface.E;
    }
    
    @Override
    public void doSomething(int i, double x) {
    
    }
    
    @Override
    public int doSomethingElse(String s) {
        return 0;
    }
    
    @Override
    public void call() {
    
    }
    
    static class InnerClass{
        
        private String name;
        
        public String getName(){
            return OuterClass.name + name;
        }
        
    }
    
    public void main() {
        
        SuperClass superClass = new SuperClass();
        this.publicMethod();
        this.privateMethod();
    }
    
}
