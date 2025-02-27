package data_structures.linked_list;

public final class LinkedListFactory {
    private LinkedListFactory() {
    }

    /**
     * Creates a whole new linked list based on the type.
     *
     * @param type The type of linked list to be created (s for singly linked list, d for doubly linked list, c for circular linked list)
     * @return The linked list
     */
    public static <T> ILinkedList<T> createLinkedList(final String type) {
        return switch (type) {
            case "s" -> new SinglyLinkedList<>();
            case "d" -> new DoublyLinkedList<>();
            case "cs" -> new CircularSinglyLinkedList<>();
            default -> new CircularDoublyLinkedList<>();
        };
    }
}
