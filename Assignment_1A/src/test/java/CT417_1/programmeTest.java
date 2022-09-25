package CT417_1;

import CT417_1.module;
import CT417_1.programme;
import CT417_1.student;
import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class programmeTest {
    private programme p1;
    private DateTime sDate;
    private DateTime eDate;
    private ArrayList<student> students;
    private ArrayList<module> modules;

    public programmeTest(){
        sDate = new DateTime(2019,9,1,0,0);
        eDate = new DateTime(2023,6,1,0,0);
        students = new ArrayList<>();
        modules = new ArrayList<>();
        p1 = new programme("Computer Science", modules, students, sDate, eDate);
    }

    @Test
    public void getStartDate() {
        assertEquals(sDate, p1.getStartDate());
    }

    @Test
    public void getEndDate() {
        assertEquals(eDate, p1.getEndDate());
    }

    @Test
    public void getCourseName() {
        assertEquals("Computer Science", p1.getCourseName());
    }

    @Test
    public void getModules() {
        assertTrue(p1.getModules() != null);
    }

    @Test
    public void getStudents() {
        assertTrue(p1.getStudents() != null);

    }
}