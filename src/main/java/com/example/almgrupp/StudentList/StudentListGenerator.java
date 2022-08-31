package com.example.almgrupp.StudentList;

import com.example.almgrupp.model.Student;

import java.util.List;

public class StudentListGenerator {

    private static List<Student> studentList;



    public static List<Student> getStudentList(){

        studentList.add(new Student(1, "Anna", "1234"));
        studentList.add(new Student(2, "Sofya", "4567"));
        studentList.add(new Student(3, "Filip", "5678"));
        studentList.add(new Student(4, "Sharlin", "4321"));


        return studentList;
    }
}
