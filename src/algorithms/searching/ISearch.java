package algorithms.searching;

import java.util.List;

public interface ISearch {
    /**
     * Searches for a target in an array.
     *
     * @param array  The array to search in
     * @param target The target to search for
     * @return The index of the target in the array
     */
    int search(int[] array, int target);

    /**
     * Searches for a target in a list.
     *
     * @param list   The list to search in
     * @param target The target to search for
     * @return The index of the target in the list
     */
    int search(List<Integer> list, int target);
}
