package data_structures.queue;

import java.util.ArrayList;
import java.util.List;

final class QueueWithList implements IQueue {
    private final List<Integer> queue = new ArrayList<>();

    @Override
    public void enqueue(int value) {
        queue.addLast(value);
    }

    @Override
    public int dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue.removeFirst();
    }

    @Override
    public int peek() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void display() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (Integer integer : queue) {
                System.out.print(integer + " ");
            }

            System.out.println();
        }
    }
}
