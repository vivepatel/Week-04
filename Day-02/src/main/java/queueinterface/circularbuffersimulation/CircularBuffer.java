package queueinterface.circularbuffersimulation;

public class CircularBuffer {

    private int[] buffer;  // Array to hold the elements of the buffer
    private int head;      // Points to the oldest element
    private int tail;      // Points to the next position for insertion
    private int size;      // Number of elements in the buffer
    private int capacity;  // Maximum capacity of the buffer

    // Constructor to initialize the buffer
    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    // Insert an element into the buffer
    public void insert(int value) {
        if (size == capacity) {
            // Buffer is full, overwrite the oldest element (head)
            head = (head + 1) % capacity;  // Move the head pointer forward
        } else {
            size++;
        }
        buffer[tail] = value;  // Insert the new element at the tail
        tail = (tail + 1) % capacity;  // Move the tail pointer forward (circular)
    }

    // Print the current buffer contents
    public void printBuffer() {
        System.out.print("Buffer: [");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(head + i) % capacity] + " ");
        }
        System.out.println("]");
    }

    // Main function to test the CircularBuffer class
    public static void main(String[] args) {
        // Create a circular buffer with capacity 3
        CircularBuffer buffer = new CircularBuffer(3);

        // Insert elements into the buffer
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);

        // Print the buffer after insertion
        buffer.printBuffer();  // Output: Buffer: [1 2 3]

        // Insert a new element, which will overwrite the oldest element
        buffer.insert(4);

        // Print the buffer after inserting the new element
        buffer.printBuffer();  // Output: Buffer: [2 3 4]
    }
}
