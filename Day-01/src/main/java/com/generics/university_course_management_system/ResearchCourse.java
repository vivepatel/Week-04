package com.generics.university_course_management_system;

public class ResearchCourse extends CourseType {

    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluating " + getCourseName() + " based on research.");
    }
}
