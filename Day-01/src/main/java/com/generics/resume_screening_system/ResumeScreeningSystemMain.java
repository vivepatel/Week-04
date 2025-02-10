package com.generics.resume_screening_system;

import java.util.Arrays;
import java.util.List;

public class ResumeScreeningSystemMain {
    public static void main(String[] args) {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Muskan Gupta", "Responsible for writing code.");
        DataScientist dataScientist = new DataScientist("Nancy Mehra", "Responsible for analyzing data and building models.");
        ProductManager productManager = new ProductManager("Pragya Sable", "Responsible for overseeing product development.");
        Resume<SoftwareEngineer> resume1 = new Resume<>(softwareEngineer, "Muskan Gupta");
        Resume<DataScientist> resume2 = new Resume<>(dataScientist, "Nancy Mehra");
        Resume<ProductManager> resume3 = new Resume<>(productManager, "Pragya Sable");
        resume1.displayResumeDetails();
        resume2.displayResumeDetails();
        resume3.displayResumeDetails();
        List<JobRole> jobRoles = Arrays.asList(softwareEngineer, dataScientist, productManager);
        ResumeScreeningSystem.processResumes(jobRoles);
    }
}
