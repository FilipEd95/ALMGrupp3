package com.example.almgrupp.controller;

import com.example.almgrupp.StudentList.StudentListGenerator;
import com.example.almgrupp.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/demo")
public class Controller {

    private List<Student> students;

    public Controller() {
        this.students = StudentListGenerator.getStudentList();
    }

    @RequestMapping("/add")
    public String addNewStudent (@RequestParam Long id, @RequestParam String name, @RequestParam String phoneNumber) {
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setPhoneNumber(phoneNumber);
        students.add(s);
        return "Saved";
    }

    @RequestMapping("/all")
    public List<Student> getAllStudents() {
        return students;
    }

    @RequestMapping("/getByName")
    public Student getStudentByName(@RequestParam String name){
        for (Student student: students) {
            if (student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

    @RequestMapping("/getByNumber")
    public Student getStudentByNumber(@RequestParam String number){
        for (Student student: students) {
            if (student.getPhoneNumber().equals(number)){
                return student;
            }
        }
        return null;
    }

    @RequestMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getId() == id){
                students.remove(i);
                return "Student with id " + id + " was deleted.";
            }
        }
        return "Could not delete student";
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
