package challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

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

    // @DisplayName("Coding challenge.")
    // @Test
    // public void testIncomingData(File in) {
    //     // Accept incoming file.
    //     // HashMap? But what about sort? Just use ArrayList.
    //     HashMap<String, Integer> map = new HashMap<>();
    //     HashSet<String> hashList = new HashSet<>();
    //     try {
    //         BufferedReader br = new BufferedReader(new FileReader(in));
    //         String line = br.readLine();
    //         while (line != null) {
    //             hashList.add(line);
    //         }
    //         br.close();
    //     } catch (Exception e) { // Break into separate exceptions but not now.
    //         e.printStackTrace();
    //     }

    //     Collections.sort(list);
    //     for (int i = 0; i < list.size() -1; i ++) {
    //         String[] entry = list.get(i).split("=");
    //         map.put(entry[0], Integer.parseInt(entry[1]));
    //     }
        
    // }
}
