package algorithms.searching;

import java.util.List;

public interface ISearchSorted extends ISearch {
    /**
     * Searches for a target in a sorted array. The method assumes that the providing array is sorted in ascending order.
     *
     * @param sortedArray  The sorted array to search in
     * @param target The target to search for
     * @return The index of the target in the sorted array
     */
    int search(int[] sortedArray, int target);

    /**
     * Searches for a target in a sorted list. The method assumes that the providing list is sorted in ascending order.
     *
     * @param sortedList   The sorted list to search in
     * @param target The target to search for
     * @return The index of the target in the sorted list
     */
    int search(List<Integer> sortedList, int target);
}
