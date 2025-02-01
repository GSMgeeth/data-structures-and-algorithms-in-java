import data_structures.stack.IStack;
import data_structures.stack.StackWithArray;
import data_structures.stack.StackWithList;

import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Data Structures and Algorithms!");

        System.out.println("Data Structure (d) / Algorithm (a): ");
        final String dsOrAlgo = scanner.nextLine();

        if (dsOrAlgo.equalsIgnoreCase("d")) {
            System.out.println("Stack (s) / Queue (q) / LinkedLists (ll) / Doubly LinkedLists (dll): ");
            final String sdType = scanner.nextLine();

            switch (sdType) {
                case "s" -> testStackDS();
                case "q" -> System.out.println("Queues are still coding away...");
                case "ll" -> System.out.println("LinkedLists are still coding away...");
                case "dll" -> System.out.println("Doubly LinkedLists are still coding away...");
                default -> System.out.println("Invalid Data Structure type");
            }
        } else if (dsOrAlgo.equalsIgnoreCase("a")) {
            System.out.println("Algorithms are still coding away...");
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

        final IStack stack = getStack(stackType);
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

    private static IStack getStack(final String type) {
        if (type.equalsIgnoreCase("a")) {
            return new StackWithArray(5);
        }

        return new StackWithList();
    }
}
