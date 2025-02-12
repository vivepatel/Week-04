package mapinterface.wordfrequencycounter;
import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Vivek Patel\\OneDrive\\Desktop\\week-4\\Day-04\\text.txt"; // Replace with the path to your file
        try {
            Map<String, Integer> wordCount = countWordFrequency(filePath);
            System.out.println(wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to count word frequency
    public static Map<String, Integer> countWordFrequency(String filePath) throws IOException {
        // Create a HashMap to store word frequencies
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Create a BufferedReader to read the file
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        // Read the file line by line
        while ((line = reader.readLine()) != null) {
            // Split the line into words using a regular expression that ignores punctuation
            String[] words = line.split("[^a-zA-Z]+");

            // Process each word in the line
            for (String word : words) {
                if (!word.isEmpty()) {
                    // Convert to lowercase to ignore case sensitivity
                    word = word.toLowerCase();

                    // Update the word count in the HashMap
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
        }
        reader.close(); // Close the file reader

        return wordCountMap;
    }
}
