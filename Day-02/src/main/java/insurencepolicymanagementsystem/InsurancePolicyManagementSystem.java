package insurencepolicymanagementsystem;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

class InsurancePolicy {
    String policyNumber;
    String policyholderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + ", Policyholder: " + policyholderName + ", Expiry Date: " + expiryDate +
                ", Coverage Type: " + coverageType + ", Premium Amount: " + premiumAmount;
    }
}

public class InsurancePolicyManagementSystem {

    // HashSet for storing unique policies with quick lookups
    private static Set<InsurancePolicy> policyHashSet = new HashSet<>();

    // LinkedHashSet for storing policies while maintaining the insertion order
    private static Set<InsurancePolicy> policyLinkedHashSet = new LinkedHashSet<>();

    // TreeSet for storing policies sorted by expiry date
    private static Set<InsurancePolicy> policyTreeSet = new TreeSet<>(Comparator.comparing(InsurancePolicy::getExpiryDate));

    // Method to add a policy
    public static void addPolicy(InsurancePolicy policy) {
        policyHashSet.add(policy);
        policyLinkedHashSet.add(policy);
        policyTreeSet.add(policy);
    }

    // Method to retrieve all unique policies
    public static void displayAllPolicies() {
        System.out.println("HashSet (Quick Lookup):");
        policyHashSet.forEach(System.out::println);

        System.out.println("\nLinkedHashSet (Order of Insertion):");
        policyLinkedHashSet.forEach(System.out::println);

        System.out.println("\nTreeSet (Sorted by Expiry Date):");
        policyTreeSet.forEach(System.out::println);
    }

    // Method to retrieve policies expiring soon (within the next 30 days)
    public static void displayExpiringSoonPolicies() {
        LocalDate today = LocalDate.now();
        LocalDate soon = today.plusDays(30);

        System.out.println("\nPolicies Expiring Soon:");
        for (InsurancePolicy policy : policyHashSet) {
            if (!policy.getExpiryDate().isAfter(soon)) {
                System.out.println(policy);
            }
        }
    }

    // Method to retrieve policies by coverage type
    public static void displayPoliciesByCoverageType(String coverageType) {
        System.out.println("\nPolicies with Coverage Type: " + coverageType);
        for (InsurancePolicy policy : policyHashSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        }
    }

    // Method to check for duplicate policies based on policy numbers
    public static void checkDuplicatePolicies() {
        Set<String> seen = new HashSet<>();
        System.out.println("\nDuplicate Policies (Based on Policy Number):");
        for (InsurancePolicy policy : policyHashSet) {
            if (!seen.add(policy.getPolicyNumber())) {
                System.out.println("Duplicate Found: " + policy);
            }
        }
    }

    // Performance comparison method
    public static void comparePerformance() {
        long startTime, endTime;

        // Adding 10000 policies
        List<InsurancePolicy> policies = generatePolicies(10000);

        // HashSet Performance
        startTime = System.nanoTime();
        for (InsurancePolicy policy : policies) {
            policyHashSet.add(policy);
        }
        endTime = System.nanoTime();
        System.out.println("\nHashSet Add Time: " + (endTime - startTime) + " ns");

        // LinkedHashSet Performance
        startTime = System.nanoTime();
        for (InsurancePolicy policy : policies) {
            policyLinkedHashSet.add(policy);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (endTime - startTime) + " ns");

        // TreeSet Performance
        startTime = System.nanoTime();
        for (InsurancePolicy policy : policies) {
            policyTreeSet.add(policy);
        }
        endTime = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (endTime - startTime) + " ns");

        // Searching in HashSet (lookup)
        startTime = System.nanoTime();
        policyHashSet.contains(policies.get(5000)); // Lookup middle item
        endTime = System.nanoTime();
        System.out.println("HashSet Lookup Time: " + (endTime - startTime) + " ns");

        // Searching in LinkedHashSet (lookup)
        startTime = System.nanoTime();
        policyLinkedHashSet.contains(policies.get(5000)); // Lookup middle item
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet Lookup Time: " + (endTime - startTime) + " ns");

        // Searching in TreeSet (lookup)
        startTime = System.nanoTime();
        policyTreeSet.contains(policies.get(5000)); // Lookup middle item
        endTime = System.nanoTime();
        System.out.println("TreeSet Lookup Time: " + (endTime - startTime) + " ns");
    }

    // Method to generate dummy policies
    public static List<InsurancePolicy> generatePolicies(int count) {
        List<InsurancePolicy> policies = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            policies.add(new InsurancePolicy("P" + i, "Holder" + i, LocalDate.now().plusDays(i), "Health", 1000 + (i % 100)));
        }
        return policies;
    }

    public static void main(String[] args) {
        // Sample data
        addPolicy(new InsurancePolicy("P1", "John Doe", LocalDate.now().plusDays(10), "Health", 500));
        addPolicy(new InsurancePolicy("P2", "Jane Smith", LocalDate.now().plusDays(5), "Auto", 300));
        addPolicy(new InsurancePolicy("P3", "Sam Brown", LocalDate.now().plusDays(25), "Home", 700));
        addPolicy(new InsurancePolicy("P4", "Emily Davis", LocalDate.now().plusDays(15), "Health", 600));

        // Display all policies
        displayAllPolicies();

        // Display policies expiring soon
        displayExpiringSoonPolicies();

        // Display policies by coverage type
        displayPoliciesByCoverageType("Health");

        // Check for duplicate policies
        checkDuplicatePolicies();

        // Performance comparison
        comparePerformance();
    }
}
