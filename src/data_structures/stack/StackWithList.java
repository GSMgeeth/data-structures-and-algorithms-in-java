package data_structures.stack;

import java.util.ArrayList;
import java.util.List;

final class StackWithList implements IStack {
    private final List<Integer> stack = new ArrayList<>();

    @Override
    public void push(int value) {
        stack.addLast(value);
    }

    @Override
    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack.removeLast();
    }

    @Override
    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack.getLast();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public void display() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (Integer integer : stack) {
                System.out.print(integer + " ");
            }

            System.out.println();
        }
    }
}
