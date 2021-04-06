package challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Challenges testing.")
public class ChallengesTest {
    @DisplayName("Arrays sum test.")
    @Test
    public void testArraySums() {
        int array[] = { 2, 3, 4, 9, 12, 5 };
        assertTrue(Challenges.arraySumWithTrio(array, 18));
        assertFalse(Challenges.arraySumWithTrio(array, 28));

        int array2[] = { -25, -10, -7, -3, 2, 4, 8, 10 };
        assertTrue(Challenges.arraySumWithTrio(array2, -8));
    }

    @DisplayName("String reverse test.")
    @Test
    public void testStringReverse() {
        String result = Challenges.reverseWords("What in the world is that".toCharArray());
        assertEquals("that is world the in What", result);
    }
}
