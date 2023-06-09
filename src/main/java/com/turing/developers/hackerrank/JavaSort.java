package com.turing.developers.hackerrank;

import com.turing.developers.hackerrank.utilities.CustomSort;
import com.turing.developers.hackerrank.utilities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSort {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            
            testCases--;
        }
        
        studentList.sort(new CustomSort());
        
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}

