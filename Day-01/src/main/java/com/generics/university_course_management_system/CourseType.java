package com.generics.university_course_management_system;

public abstract class CourseType{
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract void evaluate();
}
