package data_structures.queue;

public interface IQueue {
    /**
     * Enqueues the value to the queue. If the queue is full, it prints "Queue is full".
     *
     * @param value The value to be enqueued
     */
    void enqueue(int value);

    /**
     * Dequeues the value from the queue. If the queue is empty, it prints "Queue is empty".
     *
     * @return The dequeued value
     */
    int dequeue();

    /**
     * Peeks the value from the queue. If the queue is empty, it prints "Queue is empty".
     *
     * @return The peeked value
     */
    int peek();

    /**
     * Checks if the queue is empty.
     *
     * @return True if the queue is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Displays the queue. If the queue is empty, it prints "Queue is empty".
     */
    void display();
}
