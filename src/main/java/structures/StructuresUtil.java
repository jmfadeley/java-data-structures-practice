package structures;

import java.util.List;

public class StructuresUtil {

    private StructuresUtil() { }

    /**
    * Array must already be sorted or index would be meaningless. This would be a good spot to 
    * check that a list is actually sorted, but I'm just going to not sweat it since I'm the 
    * sole, devilishly handsome developer.
    */
    public static int binarySearchRecursive(List<Integer> array, int target) {
        return binarySearchRecursive(array.toArray(new Integer[array.size()]), target, 0, array.size());
    }

    private static int binarySearchRecursive(Integer[] array, int target, int lowIndex, int highIndex) {
        if (lowIndex > highIndex) {
            return -1;
        }
        int midIndex = (lowIndex + highIndex) / 2;
        if (target == array[midIndex]) {
            return midIndex;
        } else if (target > array[midIndex]) {
            return binarySearchRecursive(array, target, midIndex+1, highIndex);
        } else if (target < array[midIndex]) {
            return binarySearchRecursive(array, target, lowIndex, midIndex-1);
        }
        return -1;
    }

    /**
    * An iterative approach to binary searching a String array. Again, not bothering to check 
    * that we've sorted anything. If I were being paid for this, I should be punished.
    */
    public static int binarySearchIterative(List<String> array, String target) {
        int start = 0;
        int end = array.size();

        while ( start <= end) {
            int middle = (start + end) / 2;
            if (target.compareTo(array.get(middle)) <= -1) {
                end = middle -1;
            } else if (target.compareTo(array.get(middle)) >= 1) {
                start = middle + 1;
            }
            if (target.equals(array.get(middle))) {
                return middle;
            }
        }
        return -1;
    }
}
