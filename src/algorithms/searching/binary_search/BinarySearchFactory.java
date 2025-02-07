package algorithms.searching.binary_search;

import algorithms.searching.ISearchSorted;

public final class BinarySearchFactory {
    private BinarySearchFactory() {
    }

    /**
     * Creates a whole new binary search based on the type.
     *
     * @param type The type of binary search to be created (i for iterative binary search, r for recursive binary search)
     * @return The binary search
     */
    public static ISearchSorted createBinarySearch(final String type) {
        if (type.equals("i")) {
            return new IterativeBinarySearch();
        }

        return new RecursiveBinarySearch();
    }
}
