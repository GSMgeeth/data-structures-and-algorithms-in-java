package data_structures.queue;

final class QueueWithArray implements IQueue {
    private final int[] queue;
    private int front = 0;
    private int rear = -1;
    private int size = 0;

    QueueWithArray(int capacity) {
        queue = new int[capacity];
    }

    @Override
    public void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue is full");
            return;
        }

        rear = rotatedPosition(rear);
        queue[rear] = value;
        size++;
    }

    @Override
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = queue[front];
        front = rotatedPosition(front);
        size--;

        return value;
    }

    private int rotatedPosition(int position) {
        return (position + 1) % queue.length;
    }

    @Override
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % queue.length] + " ");
            }

            System.out.println();
        }
    }
}
