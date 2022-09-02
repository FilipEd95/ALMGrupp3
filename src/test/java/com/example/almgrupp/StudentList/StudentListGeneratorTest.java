package com.example.almgrupp.StudentList;

import com.example.almgrupp.model.Student;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentListGeneratorTest {


    @Test
    void getStudentList() {
       List<Student> students = StudentListGenerator.getStudentList();
       assertEquals(4,students.size());
       assertEquals("Anna", students.get(0).getName());

    }
}