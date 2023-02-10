import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testName() {
        Student std = new Student();
        std.setName("hej");
        assertEquals(true, std.getName().length()>2);
    }

}