package data_structures.queue;

public final class QueueFactory {
    private QueueFactory() {
    }

    /**
     * Creates a whole new queue based on the type. For array, it creates a queue with capacity 5.
     *
     * @param type The type of queue to be created (a for array, l for list)
     * @return The queue
     */
    public static IQueue createQueue(final String type) {
        if (type.equals("a")) {
            return new QueueWithArray(5);
        }

        return new QueueWithList();
    }
}
