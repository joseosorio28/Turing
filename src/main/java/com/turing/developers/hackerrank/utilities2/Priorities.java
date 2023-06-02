package com.turing.developers.hackerrank.utilities2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {
    
    public List<Student> getStudents(List<String> events) {
        
        PriorityQueue<Student> studentQueue = new PriorityQueue<>(
                Comparator
                        .comparing(Student::getCgpa).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getId)
        );

        for(String event:events) {
            if (event.contains("SERVED")) {
                studentQueue.poll();
            } else {
                String[] data = event.split(" ");
                Student student = new Student(
                        Integer.parseInt(data[3]),
                        data[1],
                        Double.parseDouble(data[2])
                );
                studentQueue.add(student);
            }
        }
        
        List<Student> students = new ArrayList<>();
        while (!studentQueue.isEmpty()) {
            students.add(studentQueue.poll());
        }
        return students;
    }
    
}
