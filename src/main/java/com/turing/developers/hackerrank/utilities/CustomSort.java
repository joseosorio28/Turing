package com.turing.developers.hackerrank.utilities;

import java.util.Comparator;

public class CustomSort implements Comparator<Student> {
    
    @Override
    public int compare(Student o1, Student o2) {
        
        double cgpa = (o2.getCgpa() - o1.getCgpa())*1000;
        if ((int) cgpa != 0) {
            return (int) cgpa;
        } else if (o1.getFname().compareTo(o2.getFname()) != 0) {
            return o1.getFname().compareTo(o2.getFname());
        } else {
            return o2.getId() - o1.getId();
        }
    }
}
