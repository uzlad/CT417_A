package CT417_1;

import CT417_1.lecturer;
import CT417_1.module;
import CT417_1.programme;
import CT417_1.student;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class moduleTest {
    private module m1;
    private lecturer l1;
    private ArrayList<student> students;
    private ArrayList<programme> courses;

    public moduleTest(){
        students = new ArrayList<>();
        courses = new ArrayList<>();
        l1 = new lecturer("Michael Schukat", 28, "01/02/1994", 1);
        m1 = new module("Software Engineering III", "CT417", students, courses, l1);
    }
    @Test
    public void getModuleName() {
        assertEquals("Software Engineering III", m1.getModuleName());
    }

    @Test
    public void getModuleID() {
        assertEquals("CT417", m1.getModuleID());
    }

    @Test
    public void getStudents() {
        assertTrue(m1.getStudents() != null);
    }

    @Test
    public void getCourses() {
        assertTrue(m1.getCourses() != null);
    }

    @Test
    public void getLecturer() {
        assertEquals(l1, m1.getLecturer());
    }
}