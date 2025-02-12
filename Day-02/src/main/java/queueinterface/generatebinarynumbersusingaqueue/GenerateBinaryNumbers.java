package queueinterface.generatebinarynumbersusingaqueue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

    // Method to generate the first N binary numbers
    public static Queue<String> generateBinaryNumbers(int N) {
        Queue<String> result = new LinkedList<>();

        // Queue to store binary numbers as strings
        Queue<String> queue = new LinkedList<>();

        // Start with "1" as the first binary number
        queue.add("1");

        while (N > 0) {
            // Get the front binary number from the queue
            String binary = queue.poll();
            result.add(binary);

            // Generate the next binary numbers by appending "0" and "1"
            queue.add(binary + "0");
            queue.add(binary + "1");

            N--;
        }

        return result;
    }

    public static void main(String[] args) {
        // Specify the number of binary numbers to generate
        int N = 5;

        // Get the first N binary numbers
        Queue<String> binaryNumbers = generateBinaryNumbers(N);

        // Print the result
        System.out.println("First " + N + " Binary Numbers: " + binaryNumbers);
    }
}
