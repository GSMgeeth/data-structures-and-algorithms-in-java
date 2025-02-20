package data_structures.linked_list;

final class CircularSinglyLinkedList<T> implements ILinkedList<T> {
    private Node<T> head;

    @Override
    public void insertAtBeginning(T value) {
        final Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        Node<T> pointer = head;
        while (pointer.next != head) {
            pointer = pointer.next;
        }

        newNode.next = head;
        head = newNode;
        pointer.next = head;
    }

    @Override
    public void insertAtEnd(T value) {
        final Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        Node<T> pointer = head;
        while (pointer.next != head) {
            pointer = pointer.next;
        }

        pointer.next = newNode;
        newNode.next = head;
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

        Node<T> pointer = head;
        while (pointer.next != head) {
            pointer = pointer.next;
        }

        if (pointer == head) {
            head = null;
            return;
        }

        pointer.next = head.next;
        head = head.next;
    }

    @Override
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node<T> pointer = head;
        Node<T> previous = null;
        while (pointer.next != head) {
            previous = pointer;
            pointer = pointer.next;
        }

        if (previous == null) {
            head = null;
            return;
        }

        previous.next = head;
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
        Node<T> previous = null;
        int count = 0;

        while (pointer != null && count < position) {
            previous = pointer;
            pointer = pointer.next;
            count++;
        }

        if (pointer == null) {
            System.out.println("Invalid position");
            return;
        }

        previous.next = pointer.next;
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

        return pointer.data;
    }

    @Override
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node<T> pointer = head;
        do {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        } while (pointer != head);

        System.out.println();
    }

    /**
     * Node class for the circular singly linked list.
     *
     * @param <T> The type of the value
     */
    private static class Node<T> {
        final T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }
}
