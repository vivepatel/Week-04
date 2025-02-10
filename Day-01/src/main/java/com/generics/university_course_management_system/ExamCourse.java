package com.generics.university_course_management_system;

public class ExamCourse extends CourseType {

    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluating " + getCourseName() + " based on an exam.");
    }
}
