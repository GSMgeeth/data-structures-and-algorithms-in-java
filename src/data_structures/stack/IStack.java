package data_structures.stack;

public interface IStack {
    /**
     * Pushes the value to the stack. If the stack is full, it prints "Stack is full".
     *
     * @param value The value to be pushed
     */
    void push(int value);

    /**
     * Pops the value from the stack. If the stack is empty, it prints "Stack is empty".
     *
     * @return The popped value
     */
    int pop();

    /**
     * Peeks the value from the stack. If the stack is empty, it prints "Stack is empty".
     *
     * @return The peeked value
     */
    int peek();

    /**
     * Checks if the stack is empty.
     *
     * @return True if the stack is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Displays the stack. If the stack is empty, it prints "Stack is empty".
     */
    void display();
}
