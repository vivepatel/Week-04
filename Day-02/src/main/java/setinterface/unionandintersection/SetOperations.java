package setinterface.unionandintersection;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {

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

        // Call the union and intersection methods
        Set<Integer> union = getUnion(set1, set2);
        Set<Integer> intersection = getIntersection(set1, set2);

        // Printing the results
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }

    // Method to calculate the union of two sets
    public static Set<Integer> getUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1); // Start with elements of set1
        union.addAll(set2); // Add all elements from set2
        return union;
    }

    // Method to calculate the intersection of two sets
    public static Set<Integer> getIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1); // Start with elements of set1
        intersection.retainAll(set2); // Retain only elements that are in both sets
        return intersection;
    }
}
