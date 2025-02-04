import algorithms.searching.binary_search.BinarySearchFactory;
import algorithms.searching.binary_search.IBinarySearch;
import data_structures.linked_list.ILinkedList;
import data_structures.linked_list.LinkedListFactory;
import data_structures.queue.IQueue;
import data_structures.queue.QueueFactory;
import data_structures.stack.IStack;
import data_structures.stack.StackFactory;

import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Data Structures and Algorithms!");

        System.out.println("Data Structure (d) / Algorithm (a): ");
        final String dsOrAlgo = scanner.nextLine();

        if (dsOrAlgo.equalsIgnoreCase("d")) {
            System.out.println("Stack (s) / Queue (q) / LinkedList (l) / Tree (t): ");
            final String sdType = scanner.nextLine();

            switch (sdType) {
                case "s" -> testStackDS();
                case "q" -> testQueueDS();
                case "l" -> testLinkedListDS();
                case "t" -> System.out.println("Trees are still coding away...");
                default -> System.out.println("Invalid Data Structure type");
            }
        } else if (dsOrAlgo.equalsIgnoreCase("a")) {
            System.out.println("Binary Search Algorithm (bs) / Greedy Algorithm (g): ");
            final String algoType = scanner.nextLine();

            switch (algoType) {
                case "bs" -> testBinarySearchAlgorithm();
                case "g" -> System.out.println("Greedy Algorithm is still coding away...");
                default -> System.out.println("Invalid Algorithm type");
            }
        } else {
            System.out.println("Invalid choice");
        }
    }

    private static void testStackDS() {
        String stackType = "";
        while (stackType.isEmpty() || (!stackType.equalsIgnoreCase("a") && !stackType.equalsIgnoreCase("l"))) {
            System.out.print("Stack with Array (a) / List (l)): ");
            stackType = scanner.nextLine();
        }

        final IStack stack = StackFactory.createStack(stackType);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.display();

        stack.push(60);

        System.out.println("Popped : " + stack.pop());
        System.out.println("Popped : " + stack.pop());

        System.out.println("Peeked : " + stack.peek());

        stack.display();
    }

    private static void testQueueDS() {
        String queueType = "";
        while (queueType.isEmpty() || (!queueType.equalsIgnoreCase("a") && !queueType.equalsIgnoreCase("l"))) {
            System.out.print("Queue with Array (a) / List (l)): ");
            queueType = scanner.nextLine();
        }

        final IQueue queue = QueueFactory.createQueue(queueType);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        queue.enqueue(60);

        System.out.println("Dequeued : " + queue.dequeue());
        System.out.println("Dequeued : " + queue.dequeue());

        System.out.println("Peeked : " + queue.peek());

        queue.display();
    }

    private static void testLinkedListDS() {
        String linkedListType = "";
        while (linkedListType.isEmpty() || (!linkedListType.equalsIgnoreCase("s") && !linkedListType.equalsIgnoreCase("d")) && !linkedListType.equalsIgnoreCase("c")) {
            System.out.print("Singly LinkedList (s) / Doubly LinkedList (d) / Circular LinkedList (c)): ");
            linkedListType = scanner.nextLine();
        }

        final ILinkedList<Integer> linkedList = LinkedListFactory.createLinkedList(linkedListType);
        linkedList.insertAtBeginning(10);
        linkedList.insertAtBeginning(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtPosition(40, 1);
        linkedList.insertAtEnd(50);
        linkedList.insertAtEnd(60);

        linkedList.display();

        linkedList.deleteAtBeginning();
        linkedList.deleteAtEnd();
        linkedList.deleteAtPosition(2);

        linkedList.display();

        System.out.println("Value at position 1: " + linkedList.getValueAtPosition(1));

        linkedList.display();
    }

    private static void testBinarySearchAlgorithm() {
        String algoType = "";
        while (algoType.isEmpty() || (!algoType.equalsIgnoreCase("i") && !algoType.equalsIgnoreCase("r"))) {
            System.out.print("Iterative Binary Search (i) / Recursive Binary Search (r)): ");
            algoType = scanner.nextLine();
        }

        final IBinarySearch binarySearch = BinarySearchFactory.createBinarySearch(algoType);
        final int[] array = {10, 21, 32, 43, 54, 65, 76, 87, 98, 109};
        final int value = 87;

        int result;
        if (binarySearch != null) {
            result = binarySearch.search(array, value);
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Invalid Binary Search type");
        }
    }
}
