package com.turing.developers.learning.classes;

import com.turing.developers.learning.other.SubClass;

import java.util.*;

public class Learning {
    
    volatile static int var=5;
    
    public static void main(String[] args) {
        
        Thread thread = new Thread(){
            @Override
            public void run(){
                System.out.println("in Thread: "+Learning.var);
                try {
                    Thread.sleep(500);
                    System.out.println("in Thread after 0.5s : "+Learning.var);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        
        thread.start();
        Map<Object, Object> hashtable = new Hashtable<>();
        Set<Integer> set = new HashSet<>();
        Set<Integer> lset = new LinkedHashSet<>();
        List<Integer> list = new ArrayList<>();
    
//        set.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
//        list.sort(Comparator.naturalOrder());
    
        System.out.println(Learning.var);
        Learning.var = 10;
    
        System.out.println(Learning.var);
        
        SuperClass superClass = new SuperClass();
        SuperClass superClass2 = new SuperClass();
    
        //superClass.privateMethod();
    
        SubClass subClass = new SubClass();
        
        OuterClass outerClass = new OuterClass();
        
        //outerClass.privateMethod();
        //subClass.privateMethod();
    
        System.out.println(superClass==superClass2);
        System.out.println(superClass.equals(superClass2));
    
    }
}
