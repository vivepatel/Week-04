package queueinterface.implementastackusingqueues;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {

    // Two queues to simulate the stack
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackUsingQueues() {
        // Initialize the two queues
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push operation
    public void push(int x) {
        // Add the new element to queue1
        queue1.add(x);
    }

    // Pop operation
    public int pop() {
        // If queue1 is empty, the stack is empty
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Transfer elements from queue1 to queue2, leaving the last element
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        // The last element in queue1 is the one to be popped
        int poppedElement = queue1.poll();

        // Swap the roles of the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return poppedElement;
    }

    // Top operation
    public int top() {
        // If queue1 is empty, the stack is empty
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Transfer elements from queue1 to queue2, leaving the last element
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        // The last element in queue1 is the top of the stack
        int topElement = queue1.peek();

        // Put the element back into queue1
        queue2.add(queue1.poll());

        // Swap the roles of the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        // Create a stack instance
        StackUsingQueues stack = new StackUsingQueues();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Perform pop and top operations
        System.out.println("Top element: " + stack.top());  // Output: 3
        System.out.println("Popped element: " + stack.pop());  // Output: 3
        System.out.println("Top element after pop: " + stack.top());  // Output: 2
    }
}
