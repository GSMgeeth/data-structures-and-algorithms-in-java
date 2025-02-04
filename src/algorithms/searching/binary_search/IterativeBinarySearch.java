package algorithms.searching.binary_search;

public class IterativeBinarySearch implements IBinarySearch {

    @Override
    public int search(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == value) {
                return mid;
            }

            if (array[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
