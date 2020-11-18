import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    Student test= new Student();
    @BeforeEach
    void setUp() {
        test.addGrade(4.5);
        test.addGrade(4.5);
    }

    @Test
    void getAverageGrade() {
        assertEquals(4.5,test.getAverageGrade());
    }
}