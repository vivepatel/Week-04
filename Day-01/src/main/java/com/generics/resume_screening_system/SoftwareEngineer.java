package com.generics.resume_screening_system;

public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer(String name, String description) {
        super(name, description);
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Software Engineer: " + getName() + "\nDescription: " + getDescription());
    }
}
