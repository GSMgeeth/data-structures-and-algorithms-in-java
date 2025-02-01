package data_structures.stack;

public final class StackFactory {
    private StackFactory() {
    }

    /**
     * Creates a whole new stack based on the type. For array, it creates a stack with capacity 5.
     *
     * @param type The type of stack to be created (a for array, l for list)
     * @return The stack
     */
    public static IStack createStack(final String type) {
        if (type.equals("a")) {
            return new StackWithArray(5);
        }

        return new StackWithList();
    }
}
