package lessons;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Lessons testing.")
public class LessonsTest {
    @DisplayName("Equals test.")
    @Test
    public void testEquals() {
        boolean what = true;
        assertEquals(true, what);
    }
}
