package data_structures.linked_list;

final class CircularDoublyLinkedList<T> implements ILinkedList<T> {
    private Node<T> head;

    @Override
    public void insertAtBeginning(T value) {
        final Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.previous = head;
            return;
        }

        Node<T> pointer = head;
        while (pointer.next != head) {
            pointer = pointer.next;
        }

        newNode.next = head;
        head.previous = newNode;
        head = newNode;
        pointer.next = head;
        head.previous = pointer;
    }

    @Override
    public void insertAtEnd(T value) {
        final Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.previous = head;
            return;
        }

        Node<T> pointer = head;
        while (pointer.next != head) {
            pointer = pointer.next;
        }

        pointer.next = newNode;
        newNode.previous = pointer;
        newNode.next = head;
        head.previous = newNode;
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
        pointer.next.previous = newNode;
        pointer.next = newNode;
        newNode.previous = pointer;
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

        pointer.next = head.next;
        head.next.previous = pointer;
        head = head.next;
    }

    @Override
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node<T> pointer = head;
        while (pointer.next != head) {
            pointer = pointer.next;
        }

        pointer.previous.next = head;
        head.previous = pointer.previous;
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

        if (pointer == null || pointer.next == head) {
            System.out.println("Invalid position");
            return;
        }

        pointer.next = pointer.next.next;
        pointer.next.previous = pointer;
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
        do {
            System.out.print(pointer.value + " ");
            pointer = pointer.next;
        } while (pointer != head);

        System.out.println();
    }

    /**
     * Node class for circular doubly linked list.
     *
     * @param <T> The type of the value
     */
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
