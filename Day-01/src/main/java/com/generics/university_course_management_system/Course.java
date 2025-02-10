package com.generics.university_course_management_system;

import java.util.List;

public class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public void evaluateCourse() {
        courseType.evaluate();
    }

    public String getCourseName() {
        return courseType.getCourseName();
    }

    public T getCourseType() {
        return courseType;
    }
}