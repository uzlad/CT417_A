package CT417_1;

import CT417_1.lecturer;
import org.junit.Test;

import static org.junit.Assert.*;

public class lecturerTest {
    private lecturer l1;

    public lecturerTest(){
        l1 = new lecturer("Usman Arif", 21, "25/08/2001", 19308281);
    }

    @Test
    public void testGetUserName() {
        assertEquals("Usman Arif21", l1.getUserName());
    }

    @Test
    public void getName() {
        assertEquals("Usman Arif", l1.getName());
    }

    @Test
    public void getAge() {
        assertEquals(21, l1.getAge());

    }

    @Test
    public void getDOB() {
        assertEquals("25/08/2001", l1.getDOB());
    }

    @Test
    public void getID() {
        assertEquals(19308281, l1.getID());

    }

    @Test
    public void getModule() {
        assertTrue(l1.getModule() != null);
    }
}