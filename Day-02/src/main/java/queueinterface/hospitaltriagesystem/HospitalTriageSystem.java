package queueinterface.hospitaltriagesystem;

import java.util.PriorityQueue;
import java.util.Comparator;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class HospitalTriageSystem {

    // Method to create and return a comparator for prioritizing patients based on severity
    public static Comparator<Patient> createSeverityComparator() {
        return new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                // Higher severity means higher priority
                return Integer.compare(p2.severity, p1.severity);
            }
        };
    }

    // Method to simulate the triage system and treat patients in order of severity
    public static void triagePatients(Patient[] patients) {
        // Create a priority queue with the comparator
        PriorityQueue<Patient> queue = new PriorityQueue<>(createSeverityComparator());

        // Add patients to the queue
        for (Patient patient : patients) {
            queue.add(patient);
        }

        // Simulate treating patients based on severity
        System.out.println("Triage Order (Treating patients by severity):");
        while (!queue.isEmpty()) {
            Patient patient = queue.poll(); // Treat the patient with the highest severity
            System.out.println(patient);
        }
    }

    public static void main(String[] args) {
        // Create an array of patients with names and severity levels
        Patient[] patients = {
                new Patient("John", 3),
                new Patient("Alice", 5),
                new Patient("Bob", 2)
        };

        // Call the triage method to process and treat the patients
        triagePatients(patients);
    }
}

