package insurancepolicymanagementsystem2;
import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class InsurancePolicy {
    private String policyNumber;
    private String policyholderName;
    private LocalDate startDate;
    private LocalDate expiryDate;

    public InsurancePolicy(String policyNumber, String policyholderName, LocalDate startDate, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.startDate = startDate;
        this.expiryDate = expiryDate;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + ", Holder: " + policyholderName + ", Expiry Date: " + expiryDate;
    }
}

public class InsurancePolicyManagementSystem {

    // Maps to store policies
    private Map<String, InsurancePolicy> policyMap;       // HashMap for policy number -> policy details
    private Map<String, InsurancePolicy> orderedPolicyMap; // LinkedHashMap to maintain insertion order
    private Map<LocalDate, List<InsurancePolicy>> sortedByExpiryDateMap; // TreeMap to sort by expiry date

    public InsurancePolicyManagementSystem() {
        policyMap = new HashMap<>();
        orderedPolicyMap = new LinkedHashMap<>();
        sortedByExpiryDateMap = new TreeMap<>();
    }

    // Store a policy
    public void addPolicy(InsurancePolicy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        orderedPolicyMap.put(policy.getPolicyNumber(), policy);
        sortedByExpiryDateMap.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy);
    }

    // Retrieve a policy by policy number
    public InsurancePolicy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List all policies expiring within the next 30 days
    public List<InsurancePolicy> getPoliciesExpiringInNext30Days() {
        LocalDate currentDate = LocalDate.now();
        LocalDate next30Days = currentDate.plusDays(30);

        List<InsurancePolicy> expiringPolicies = new ArrayList<>();
        for (Map.Entry<LocalDate, List<InsurancePolicy>> entry : sortedByExpiryDateMap.entrySet()) {
            if (!entry.getKey().isAfter(next30Days)) {
                expiringPolicies.addAll(entry.getValue());
            }
        }
        return expiringPolicies;
    }

    // List all policies for a specific policyholder
    public List<InsurancePolicy> getPoliciesByPolicyholder(String policyholderName) {
        List<InsurancePolicy> policies = new ArrayList<>();
        for (InsurancePolicy policy : policyMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate currentDate = LocalDate.now();
        Iterator<Map.Entry<String, InsurancePolicy>> iterator = policyMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, InsurancePolicy> entry = iterator.next();
            if (entry.getValue().getExpiryDate().isBefore(currentDate)) {
                iterator.remove();
                // Also remove from ordered map and sorted by expiry map
                orderedPolicyMap.remove(entry.getKey());
                sortedByExpiryDateMap.get(entry.getValue().getExpiryDate()).remove(entry.getValue());
            }
        }
    }

    // Print all policies
    public void printAllPolicies() {
        System.out.println("All Policies: ");
        for (InsurancePolicy policy : policyMap.values()) {
            System.out.println(policy);
        }
    }

    // Print policies in insertion order (LinkedHashMap)
    public void printPoliciesInInsertionOrder() {
        System.out.println("Policies in Insertion Order: ");
        for (InsurancePolicy policy : orderedPolicyMap.values()) {
            System.out.println(policy);
        }
    }

    // Print policies sorted by expiry date (TreeMap)
    public void printPoliciesByExpiryDate() {
        System.out.println("Policies Sorted by Expiry Date: ");
        for (List<InsurancePolicy> policies : sortedByExpiryDateMap.values()) {
            for (InsurancePolicy policy : policies) {
                System.out.println(policy);
            }
        }
    }

    public static void main(String[] args) {
        InsurancePolicyManagementSystem system = new InsurancePolicyManagementSystem();

        // Adding some policies
        system.addPolicy(new InsurancePolicy("P001", "Alice", LocalDate.now().minusMonths(3), LocalDate.now().plusMonths(1)));
        system.addPolicy(new InsurancePolicy("P002", "Bob", LocalDate.now().minusMonths(6), LocalDate.now().plusMonths(2)));
        system.addPolicy(new InsurancePolicy("P003", "Alice", LocalDate.now().minusMonths(1), LocalDate.now().plusDays(20)));
        system.addPolicy(new InsurancePolicy("P004", "Charlie", LocalDate.now().minusMonths(2), LocalDate.now().plusMonths(3)));

        // Print all policies
        system.printAllPolicies();

        // List policies expiring in the next 30 days
        List<InsurancePolicy> expiringPolicies = system.getPoliciesExpiringInNext30Days();
        System.out.println("\nPolicies expiring in the next 30 days: ");
        for (InsurancePolicy policy : expiringPolicies) {
            System.out.println(policy);
        }

        // List policies for a specific policyholder (Alice)
        List<InsurancePolicy> alicePolicies = system.getPoliciesByPolicyholder("Alice");
        System.out.println("\nAlice's Policies: ");
        for (InsurancePolicy policy : alicePolicies) {
            System.out.println(policy);
        }

        // Remove expired policies
        system.removeExpiredPolicies();

        // Print policies after removing expired ones
        system.printAllPolicies();
    }
}
