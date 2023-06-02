package com.turing.developers.hackerrank.utilities2;

import java.util.Comparator;

public class Checker implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        
        int scoreCompare = (int) ((o2.getCgpa() - o1.getCgpa())*100);
        int nameCompare = o1.getName().compareTo(o2.getName());
        int idCompare = o2.getId()-o1.getId();
    
        if(scoreCompare != 0){
            return scoreCompare;
        }else if(nameCompare != 0){
            return nameCompare;
        }else{
            return idCompare;
        }
    }
}
