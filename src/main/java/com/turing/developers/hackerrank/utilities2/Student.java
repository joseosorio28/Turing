package com.turing.developers.hackerrank.utilities2;

public class Student {
    private int id;
    private String name;
    private double cgpa;
    
    public Student(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }
    
    @Override
    public String toString() {
        return "{" +
                "id" + id +
                ", " + name +
                ", " + cgpa +
                '}';
    }
}
