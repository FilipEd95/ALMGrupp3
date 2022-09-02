package com.example.almgrupp.StudentList;

import com.example.almgrupp.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentListGenerator {

    public static List<Student> getStudentList(){
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Anna", "1234"));
        studentList.add(new Student(2, "Sofya", "4567"));
        studentList.add(new Student(3, "Filip", "5678"));
        studentList.add(new Student(4, "Sharlin", "4321"));

        return studentList;
    }
}
