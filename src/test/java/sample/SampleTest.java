package sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Sample Test")
public class SampleTest {
    
    @DisplayName("Basic test of Sample object.")
    @Test
    public void testSample() {
        Sample sample = new Sample(5, "Steven");
        assertEquals(5, sample.getNumber());
    }
}
