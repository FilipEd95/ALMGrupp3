package com.example.almgrupp.controller;import com.example.almgrupp.model.Student;import org.junit.jupiter.api.BeforeEach;import org.junit.jupiter.api.Test;import java.util.List;import static org.junit.jupiter.api.Assertions.*;class ControllerTest {    private Controller controller;    @BeforeEach    void init(){        controller = new Controller();    }    @Test    void addNewStudent() {        controller.addNewStudent(5L, "Erik", "1234");        assertEquals(5, controller.getStudents().size());    }    @Test    void getAllStudents() {        List<Student> testList = controller.getAllStudents();        assertEquals(4, controller.getAllStudents().size());    }    @Test    void getStudentByName() {        assertEquals(4L, controller.getStudentByName("Sharlin").getId());    }    @Test    void getStudentByNumber() {        assertEquals("Anna", controller.getStudentByNumber("1234").getName());    }    @Test    void deleteById() {        assertEquals("Student with id 1 was deleted.", controller.deleteById(1L));        assertEquals(3, controller.getStudents().size());    }}