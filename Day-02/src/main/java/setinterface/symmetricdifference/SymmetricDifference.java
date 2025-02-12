package setinterface.symmetricdifference;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

    public static void main(String[] args) {
        // Creating two sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Adding elements to Set1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Adding elements to Set2
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Call the symmetric difference method
        Set<Integer> symmetricDifference = getSymmetricDifference(set1, set2);

        // Printing the result
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Symmetric Difference: " + symmetricDifference);
    }

    // Method to calculate the symmetric difference of two sets
    public static Set<Integer> getSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> symmetricDifference = new HashSet<>(set1); // Start with elements of set1
        symmetricDifference.addAll(set2); // Add all elements from set2

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // Get common elements between set1 and set2

        symmetricDifference.removeAll(intersection); // Remove common elements to get the symmetric difference
        return symmetricDifference;
    }
}
