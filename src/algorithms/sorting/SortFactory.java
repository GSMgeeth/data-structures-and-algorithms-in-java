package algorithms.sorting;

public final class SortFactory {
    private SortFactory() {
    }

    /**
     * Gets bubble sort algorithm executor.
     *
     * @param type The type of bubble sort to be created (b for bubble sort)
     * @return The bubble sort
     */
    public static ISort getBubbleSort(final String type) {
        if (type.equals("b")) {
            return new BubbleSort();
        }

        throw new IllegalArgumentException("Unknown sort type: " + type);
    }
}
