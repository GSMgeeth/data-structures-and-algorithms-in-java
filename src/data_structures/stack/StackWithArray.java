package data_structures.stack;

public final class StackWithArray implements IStack {
    private final int[] stack;
    private int top = -1;

    public StackWithArray(int capacity) {
        stack = new int[capacity];
    }

    @Override
    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full");
            return;
        }

        stack[++top] = value;
    }

    @Override
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top--];
    }

    @Override
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }

            System.out.println();
        }
    }
}
