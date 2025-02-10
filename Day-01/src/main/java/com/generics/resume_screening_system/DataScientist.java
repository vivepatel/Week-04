package com.generics.resume_screening_system;

public class DataScientist extends JobRole {

    public DataScientist(String name, String description) {
        super(name, description);
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Data Scientist: " + getName() + "\nDescription: " + getDescription());
    }
}
