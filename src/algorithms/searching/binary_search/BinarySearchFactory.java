package algorithms.searching.binary_search;

public final class BinarySearchFactory {

    private BinarySearchFactory() {
    }

    /**
     * Creates an instance of IBinarySearch based on the type.
     *
     * @param type The type of binary search to be created
     * @return The binary search instance
     */
    public static IBinarySearch createBinarySearch(final String type) {
        if (type.equals("iterative")) {
            return new IterativeBinarySearch();
        }

        return null;
    }
}
