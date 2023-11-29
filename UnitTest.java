import static org.junit.Assert.*;

public class UnitTest {
    @org.junit.Test
    public void testStudentProfile() {
        // Create a sample student
        Student student = new Student("David", "david", "2465/14", "Software", 2, 2);
        // Validate the constructor and getters
        assertEquals("David", student.getFName());
        assertEquals("david", student.getLName());
        assertEquals("2465/14", student.getId());
        assertEquals("Software", student.getDept());
        assertEquals(2, student.getYear());
        assertEquals(2, student.getSemester());
    }
}