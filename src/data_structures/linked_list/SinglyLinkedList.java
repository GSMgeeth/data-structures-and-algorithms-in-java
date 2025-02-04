package data_structures.linked_list;

public final class SinglyLinkedList<T> implements ILinkedList<T> {
    private Node<T> head;

    @Override
    public void insertAtBeginning(T value) {
        final Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public void insertAtEnd(T value) {
        final Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> pointer = head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }

        pointer.next = newNode;
    }

    @Override
    public void insertAtPosition(T value, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            insertAtBeginning(value);
            return;
        }

        Node<T> newNode = new Node<>(value);
        Node<T> pointer = head;
        int count = 0;

        while (pointer != null && count < position - 1) {
            pointer = pointer.next;
            count++;
        }

        if (pointer == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = pointer.next;
        pointer.next = newNode;
    }

    @Override
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    @Override
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node<T> pointer = head;
        while (pointer.next.next != null) {
            pointer = pointer.next;
        }

        pointer.next = null;
    }

    @Override
    public void deleteAtPosition(int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            deleteAtBeginning();
            return;
        }

        Node<T> pointer = head;
        int count = 0;

        while (pointer != null && count < position - 1) {
            pointer = pointer.next;
            count++;
        }

        if (pointer == null || pointer.next == null) {
            System.out.println("Invalid position");
            return;
        }

        pointer.next = pointer.next.next;
    }

    @Override
    public T getValueAtPosition(int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return null;
        }

        Node<T> pointer = head;
        int count = 0;

        while (pointer != null && count < position) {
            pointer = pointer.next;
            count++;
        }

        if (pointer == null) {
            System.out.println("Invalid position");
            return null;
        }

        return pointer.value;
    }

    @Override
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node<T> pointer = head;
        while (pointer != null) {
            System.out.print(pointer.value + " ");
            pointer = pointer.next;
        }

        System.out.println();
    }

    /**
     * Node class for the singly linked list.
     *
     * @param <T> The type of the value
     */
    private static class Node<T> {
        final T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }
}
