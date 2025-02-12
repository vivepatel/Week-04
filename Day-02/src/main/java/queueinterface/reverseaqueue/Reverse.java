package queueinterface.reverseaqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse {

    // Method to reverse the queue
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        // Base case: if the queue is empty, return
        if (queue.isEmpty()) {
            return queue;
        }

        // Remove the front element from the queue
        int front = queue.remove();

        // Recursively reverse the rest of the queue
        reverseQueue(queue);

        // Add the removed element back to the queue
        queue.add(front);
        return queue;
    }

    public static void main(String[] args) {
        // Creating a queue with some elements
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Printing the original queue
        System.out.println("Original Queue: " + queue);

        // Reversing the queue
        reverseQueue(queue);

        // Printing the reversed queue
        System.out.println("Reversed Queue: " + queue);
    }
}
