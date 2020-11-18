import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LectureTest {
    Lecture TLC= new Lecture();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Student s1= new Student();
        Student s2= new Student();
        s1.addGrade(5.5);
        s2.addGrade(4.5);
        TLC.enter(s1);
        TLC.enter(s2);
    }

    @org.junit.jupiter.api.Test
    void getHighestAverageGrade() {
        assertEquals(5.5,TLC.getHighestAverageGrade());
    }
}