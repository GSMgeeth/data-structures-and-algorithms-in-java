package algorithms.searching.binary_search;

import algorithms.searching.ISearchSorted;

import java.util.List;

final class IterativeBinarySearch implements ISearchSorted {
    @Override
    public int search(int[] sortedArray, int target) {
        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (sortedArray[mid] == target) {
                return mid;
            }

            if (sortedArray[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Target not found");
        return -1;
    }

    @Override
    public int search(List<Integer> sortedList, int target) {
        int left = 0;
        int right = sortedList.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (sortedList.get(mid) == target) {
                return mid;
            }

            if (sortedList.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Target not found");
        return -1;
    }
}
