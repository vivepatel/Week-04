package setinterface.Convertasettoasortedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperations {

    public static void main(String[] args) {
        // Creating a HashSet
        Set<Integer> set = new HashSet<>();

        // Adding elements to the set
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        // Convert HashSet to sorted list
        List<Integer> sortedList = convertToSortedList(set);

        // Printing the sorted list
        System.out.println("Sorted List: " + sortedList);
    }

    // Method to convert HashSet to a sorted List
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        // Convert the HashSet to a List
        List<Integer> list = new ArrayList<>(set);

        // Sort the list in ascending order
        Collections.sort(list);

        return list;
    }
}
