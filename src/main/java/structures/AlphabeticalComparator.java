package structures;

import java.util.Comparator;

/**
 * String.compareTo converts and compares the Unicode values  
 */
public class AlphabeticalComparator implements Comparator<String> {

    @Override
    public int compare(String word1, String word2) {
        return word1.compareTo(word2);
    }
    
}
