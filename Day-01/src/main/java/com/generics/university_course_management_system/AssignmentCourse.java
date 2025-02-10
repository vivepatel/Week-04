package com.generics.university_course_management_system;

public class AssignmentCourse extends CourseType {

    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluating " + getCourseName() + " based on assignments.");
    }
}
