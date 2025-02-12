package mapinterface.mergetwomaps;

import java.util.*;

public class MergeMaps {

    // Method to merge two maps and sum values for the same keys
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        // Create a new map to store the result
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        // Merge map2 into map1 (mergedMap)
        map2.forEach((key, value) ->
                mergedMap.merge(key, value, Integer::sum)
        );

        return mergedMap;
    }

    public static void main(String[] args) {
        // Example maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Merge the maps
        Map<String, Integer> result = mergeMaps(map1, map2);

        // Output the merged map
        System.out.println("Merged Map: " + result);
    }
}
