package data_structures.linked_list;

public interface ILinkedList<T> {
    /**
     * Inserts the value at the beginning of the linked list.
     *
     * @param value The value to be inserted
     */
    void insertAtBeginning(T value);

    /**
     * Inserts the value at the end of the linked list.
     *
     * @param value The value to be inserted
     */
    void insertAtEnd(T value);

    /**
     * Inserts the value at the specified position of the linked list.
     *
     * @param value    The value to be inserted
     * @param position The position at which the value is to be inserted
     */
    void insertAtPosition(T value, int position);

    /**
     * Deletes the value at the beginning of the linked list.
     */
    void deleteAtBeginning();

    /**
     * Deletes the value at the end of the linked list.
     */
    void deleteAtEnd();

    /**
     * Deletes the value at the specified position of the linked list.
     *
     * @param position The position at which the value is to be deleted
     */
    void deleteAtPosition(int position);

    /**
     * Gets the value at the specified position of the linked list.
     *
     * @param position The position at which the value is to be retrieved
     * @return The value at the specified position
     */
    T getValueAtPosition(int position);

    /**
     * Displays the linked list. If the linked list is empty, it prints "List is empty".
     */
    void display();
}
