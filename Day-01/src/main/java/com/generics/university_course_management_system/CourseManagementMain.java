package com.generics.university_course_management_system;

import java.util.List;

public class CourseManagementMain {
    public static void evaluateCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Course Name: " + course.getCourseName());
            course.evaluate();
        }
    }
    public static void main(String[] args) {
        Course<ExamCourse> examCourse = new Course<>(new ExamCourse("Mathematics"));
        Course<ResearchCourse> researchCourse = new Course<>(new ResearchCourse("Physics "));
        Course<AssignmentCourse> assignmentCourse = new Course<>(new AssignmentCourse("Computer Science"));

        examCourse.getCourseType().evaluate();
        researchCourse.getCourseType().evaluate();
        assignmentCourse.getCourseType().evaluate();
        System.out.println("\nEvaluating all courses using wildcards:");
        List<CourseType> courses = List.of(examCourse.getCourseType(), assignmentCourse.getCourseType(), researchCourse.getCourseType());
        CourseManagementMain.evaluateCourses(courses);
    }
}
