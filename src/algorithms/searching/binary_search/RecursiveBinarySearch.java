package algorithms.searching.binary_search;

import algorithms.searching.ISearchSorted;

import java.util.List;

final class RecursiveBinarySearch implements ISearchSorted {
    @Override
    public int search(int[] sortedArray, int target) {
        return searchRecursive(sortedArray, target, 0, sortedArray.length - 1);
    }

    @Override
    public int search(List<Integer> sortedList, int target) {
        return searchRecursive(sortedList, target, 0, sortedList.size() - 1);
    }

    private int searchRecursive(int[] sortedArray, int target, int left, int right) {
        if (left > right) {
            System.out.println("Target not found");
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (sortedArray[mid] == target) {
            return mid;
        }

        if (sortedArray[mid] > target) {
            return searchRecursive(sortedArray, target, left, mid - 1);
        }
        else {
            return searchRecursive(sortedArray, target, mid + 1, right);
        }
    }

    private int searchRecursive(List<Integer> sortedList, int target, int left, int right) {
        if (left > right) {
            System.out.println("Target not found");
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (sortedList.get(mid) == target) {
            return mid;
        }

        if (sortedList.get(mid) > target) {
            return searchRecursive(sortedList, target, left, mid - 1);
        }
        else {
            return searchRecursive(sortedList, target, mid + 1, right);
        }
    }
}
