package data_structures.linked_list;

final class CircularDoublyLinkedList<T> implements ILinkedList<T> {
    @Override
    public void insertAtBeginning(T value) {

    }

    @Override
    public void insertAtEnd(T value) {

    }

    @Override
    public void insertAtPosition(T value, int position) {

    }

    @Override
    public void deleteAtBeginning() {

    }

    @Override
    public void deleteAtEnd() {

    }

    @Override
    public void deleteAtPosition(int position) {

    }

    @Override
    public T getValueAtPosition(int position) {
        return null;
    }

    @Override
    public void display() {

    }

    private static class Node<T> {
        T value;
        Node<T> next;
        Node<T> previous;

        Node(T value) {
            this.value = value;
            this.next = null;
            this.previous = null;
        }
    }
}
