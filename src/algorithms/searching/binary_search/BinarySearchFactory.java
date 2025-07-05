package algorithms.searching.binary_search;

import algorithms.searching.ISearchSorted;

public final class BinarySearchFactory {
    private BinarySearchFactory() {
    }

    /**
     * Gets binary search algorithm executor based on the type.
     *
     * @param type The type of binary search to be created (i for iterative binary search, r for recursive binary search)
     * @return The binary search
     */
    public static ISearchSorted getBinarySearch(final String type) {
        if (type.equals("i")) {
            return new IterativeBinarySearch();
        } else if (type.equals("r")) {
            return new RecursiveBinarySearch();
        }

        throw new IllegalArgumentException("Unknown binary search type: " + type);
    }
}
