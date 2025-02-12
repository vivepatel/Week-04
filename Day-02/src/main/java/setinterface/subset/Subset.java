package setinterface.subset;

import java.util.HashSet;
import java.util.Set;

public class Subset {

    public static void main(String[] args) {
        // Creating two sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Adding elements to Set1
        set1.add(2);
        set1.add(3);

        // Adding elements to Set2
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Check if set1 is a subset of set2
        boolean isSubset = isSubset(set1, set2);

        // Printing the result
        System.out.println("Set1 is a subset of Set2: " + isSubset);
    }

    // Method to check if one set is a subset of another
    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        return set2.containsAll(set1); // Returns true if set2 contains all elements of set1
    }
}
