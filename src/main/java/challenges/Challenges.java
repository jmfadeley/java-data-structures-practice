package challenges;

import java.util.Arrays;

public class Challenges {
    private Challenges() { }

    /**
     * Checks to see if an array has a value of the sum of 3 integers in the array,
     * returning true or false accordingly.
     * @param array - The array.
     * @param value - The sought value that is the sum of 3 ints contained in the array.
     * @return
     */
    public static boolean arraySumWithTrio(int array[], int value) {
        Arrays.sort(array);
        
        for (int i = 0; i < array.length - 2; i++) { // -2 prevents overrun.
            int remainder = value - array[i]; // Gets whatever you need that is left.
            if (arraySumWithDuo(array, remainder, i + 1)) {
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings({"squid:S127"})
    private static boolean arraySumWithDuo(int array[], int remainder, int index) {
        int j = array.length - 1;
        for (int i = index; i < j;) { // I do not like this approach at all.
            int sum = array[i] + array[j];
            if (sum == remainder) {
                return true;
            }
            if (sum < remainder) {
                ++i;
            } else {
                --j;
            }
        }
        return false;
    }

    public static String reverseWords(char[] sentence) {
        if (sentence == null || sentence.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int lastSpace = sentence.length;
        for (int i = lastSpace - 1; i >= 0; i--) { // -1 prevents overrun.
            if(sentence[i] == ' ') {
                for (int j = i + 1; j < lastSpace; j++) {
                    sb.append(sentence[j]);
                }
                sb.append(sentence[i]); 
                lastSpace = i;
            }
        }
        for (int j = 0; j < lastSpace; j++) {
            sb.append(sentence[j]);
        }
        return sb.toString();
    }
}
