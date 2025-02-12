package votingsystem;
import java.util.*;

public class VotingSystem {

    private Map<String, Integer> votesMap;       // HashMap to store candidate votes
    private Map<String, Integer> orderedVotesMap; // LinkedHashMap to maintain vote order
    private Map<Integer, List<String>> sortedVotesMap; // TreeMap to sort candidates by votes

    public VotingSystem() {
        votesMap = new HashMap<>();
        orderedVotesMap = new LinkedHashMap<>();
        sortedVotesMap = new TreeMap<>(Collections.reverseOrder()); // Sorted by vote count in descending order
    }

    // Cast a vote for a candidate
    public void castVote(String candidate) {
        votesMap.put(candidate, votesMap.getOrDefault(candidate, 0) + 1);
        orderedVotesMap.put(candidate, votesMap.get(candidate)); // Maintain order of votes
    }

    // Display vote counts in insertion order (LinkedHashMap)
    public void displayVotesInInsertionOrder() {
        System.out.println("Votes in Insertion Order: ");
        for (Map.Entry<String, Integer> entry : orderedVotesMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " vote(s)");
        }
    }

    // Display sorted results (TreeMap - sorted by vote count in descending order)
    public void displaySortedResults() {
        // First clear the TreeMap and sort based on vote counts
        sortedVotesMap.clear();

        // Group candidates by their votes
        for (Map.Entry<String, Integer> entry : votesMap.entrySet()) {
            sortedVotesMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        System.out.println("\nSorted Results (by votes, descending): ");
        for (Map.Entry<Integer, List<String>> entry : sortedVotesMap.entrySet()) {
            for (String candidate : entry.getValue()) {
                System.out.println(candidate + ": " + entry.getKey() + " vote(s)");
            }
        }
    }

    // Display total votes for a candidate
    public void displayVotesForCandidate(String candidate) {
        if (votesMap.containsKey(candidate)) {
            System.out.println(candidate + " has " + votesMap.get(candidate) + " vote(s).");
        } else {
            System.out.println(candidate + " has not received any votes.");
        }
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Cast votes for candidates
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        // Display votes in insertion order (LinkedHashMap)
        votingSystem.displayVotesInInsertionOrder();

        // Display sorted results by vote count (TreeMap)
        votingSystem.displaySortedResults();

        // Display votes for a specific candidate
        votingSystem.displayVotesForCandidate("Alice");
        votingSystem.displayVotesForCandidate("Bob");
        votingSystem.displayVotesForCandidate("Charlie");
        votingSystem.displayVotesForCandidate("David"); // Candidate with no votes
    }
}
