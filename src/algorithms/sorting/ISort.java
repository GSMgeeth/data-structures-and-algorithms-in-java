package algorithms.sorting;

import java.util.List;

public interface ISort {
    /**
     * Sorts the given array in ascending order.
     *
     * @param array The array to sort
     */
    void sort(int[] array);

    /**
     * Sorts the given list in ascending order.
     *
     * @param list The list to sort
     */
    void sort(List<Integer> list);
}
