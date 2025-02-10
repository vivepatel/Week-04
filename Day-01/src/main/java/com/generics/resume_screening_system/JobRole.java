package com.generics.resume_screening_system;

public abstract class JobRole {
    private String name;
    private String description;

    public JobRole(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Abstract method to be implemented by specific job roles
    public abstract void displayRoleDetails();
}
