package count_words;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class CountWords {
    public static Map<String, Integer> countWords(String filePath) {
        Map<String, Integer> wordMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());

        }

        List<Map.Entry<String, Integer>> sortedWords = wordMap.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue())).limit(5).collect(Collectors.toList());

        System.out.println("Total Words: " + wordMap.values().stream().mapToInt(Integer::intValue).sum());
        System.out.println("Top 5 Most Frequent Words:");
        for (Map.Entry<String, Integer> entry : sortedWords) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        return wordMap;
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Vivek Patel\\OneDrive\\Desktop\\Week-04\\Day-03\\src\\main\\java\\count_words\\counter";
        countWords(filePath);
    }
}

