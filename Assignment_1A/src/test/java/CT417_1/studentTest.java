package CT417_1;

import CT417_1.student;
import org.junit.Test;

import static org.junit.Assert.*;

public class studentTest {
    private student s1;

    public studentTest()
    {
        s1 = new student("Usman Arif", 21, "25/08/2001", 19308281);
    }


    @Test
    public void getUserName() {
        assertEquals("Usman Arif21", s1.getUserName());
    }

    @Test
    public void getName() {
        assertEquals("Usman Arif", s1.getName());
    }

    @Test
    public void getAge() {
        assertEquals(21, s1.getAge());

    }

    @Test
    public void getDOB() {
        assertEquals("25/08/2001", s1.getDOB());
    }

    @Test
    public void getID() {
        assertEquals(19308281, s1.getID());
    }

    @Test
    public void getModule() {
        assertTrue(s1.getModule() != null);

    }

    @Test
    public void getCourses() {
        assertTrue(s1.getCourses() != null);

    }
}