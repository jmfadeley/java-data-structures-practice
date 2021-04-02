package structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Structures Test")
public class StructuresTest {
    
    /**
     * HashMap takes a key value pairing. You can have one null key, and many null values. 
     * HashMap cannot take primitives. Use the primitive wrapper classes if needed.
     * HashMap is not thread safe. Use ConcurrentHashMap if it is an issue.
     */ 
    @DisplayName("HashMap.")
    @Test
    public void testHashMap() {
        // HashMaps cannot accept primitives. You can have one null key, but many null values.
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("England", "London");
        assertEquals("London", capitals.get("England"));

        HashMap<String, Sample> oops = new HashMap<>();
        oops.put("What", new Sample(1, "Huh"));
        assertEquals("Huh", oops.get("What").getName());
    }

    @DisplayName("HashCode.")
    @Test
    public void testHashCode() { 
        HashMap<String, Sample> oops1 = new HashMap<>();
        oops1.put("What", new Sample(1, "Huh"));

        HashMap<String, Sample> oops2 = new HashMap<>();
        oops2.put("What", new Sample(1, "Huh"));

        assertEquals(oops1, oops2);
        assertEquals(oops1.hashCode(), oops2.hashCode());

        oops2.put("What", new Sample(2, "Nooo"));
        assertNotEquals(oops1.hashCode(), oops2.hashCode());
    }

    /**
     * Hashtable is similar to HashMap but is synced. It also cannot accept null values as
     * either a key or value (results in NPE). Like HashMap, it will not accept primitives 
     * as valid keys or values. Note that you can get an Enumeration of Strings for keys.
     */
    @DisplayName("Hashtable.")
    @Test 
    public void testHashtable() {
        Hashtable<String, Integer> hashtable = new Hashtable<> ();
        
        hashtable.put("What", 1);
        hashtable.put("Key on slipping", 55);
        hashtable.put("What is love?", 98);
        assertEquals(3, hashtable.size());

        hashtable.clear();
        assertEquals(0, hashtable.size());
        assertTrue(hashtable.isEmpty());
    }

    /**
     * Binary Search works on sorted lists. In this case, did a recursive approach using integers,
     * using a lambda for the sorting part. 
     */
    @DisplayName("Binary Search, manual approach with recursions and integers.")
    @Test
    public void testBinarySearchRecursion() {
        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.addAll(Arrays.asList(7, 1, 42, 999, 76, 81, 9));
        array.sort((i1, i2) -> (Integer.compare(i1, i2)));
        assertEquals(1, array.get(0));
        assertEquals(3, StructuresUtil.binarySearchRecursive(array, 9));
    }

    /**
     * Although lambdas and Java 8's streams are the cleaner way to do sorting, the old school
     * way is to use a Comparator. Figured I'd do that just for completeness. 
     */
    @DisplayName("Binary Search, manual approach with iteration and Strings.")
    @Test
    public void testBinarySearchIteration() {
        List<String> array = new ArrayList<>();
        array.add("Steve");
        array.addAll(Arrays.asList("Martha", "Thomas", "Carol", "Zeke", "Jillian", "Alan", "John"));
        array.sort(new AlphabeticalComparator());
        assertEquals("Alan", array.get(0));
        assertEquals(4, StructuresUtil.binarySearchIterative(array, "Martha"));
        assertEquals(1, StructuresUtil.binarySearchIterative(array, "Carol"));
        assertEquals(6, StructuresUtil.binarySearchIterative(array, "Thomas"));
    }
}
