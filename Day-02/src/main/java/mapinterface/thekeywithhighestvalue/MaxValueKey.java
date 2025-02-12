package mapinterface.thekeywithhighestvalue;
import java.util.*;

public class MaxValueKey {

    // Method to find the key with the maximum value in the map
    public static String findKeyWithMaxValue(Map<String, Integer> map) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;  // Initialize to the smallest possible integer value

        // Iterate through the map entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {
        // Sample map with string keys and integer values
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        // Find the key with the maximum value
        String maxKey = findKeyWithMaxValue(map);

        // Output the result
        System.out.println("Key with the maximum value: " + maxKey);
    }
}
