import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.generics.university_course_management_system.*;
import java.util.List;

class CourseManagementTest {

    @Test
    void testExamCourse() {
        Course<ExamCourse> examCourse = new Course<>(new ExamCourse("Math 101"));
        assertEquals("Math 101", examCourse.getCourseName(), "Course name should be Math 101");
    }

    @Test
    void testAssignmentCourse() {
        Course<AssignmentCourse> assignmentCourse = new Course<>(new AssignmentCourse("History 202"));
        assertEquals("History 202", assignmentCourse.getCourseName(), "Course name should be History 202");
    }

    @Test
    void testResearchCourse() {
        Course<ResearchCourse> researchCourse = new Course<>(new ResearchCourse("Physics 303"));
        assertEquals("Physics 303", researchCourse.getCourseName(), "Course name should be Physics 303");
    }

    @Test
    void testEvaluateCoursesUsingWildcard() {
        Course<ExamCourse> examCourse = new Course<>(new ExamCourse("Math 101"));
        Course<AssignmentCourse> assignmentCourse = new Course<>(new AssignmentCourse("History 202"));
        Course<ResearchCourse> researchCourse = new Course<>(new ResearchCourse("Physics 303"));

        List<CourseType> courses = List.of(examCourse.getCourseType(), assignmentCourse.getCourseType(), researchCourse.getCourseType());

        assertTrue(courses.stream().anyMatch(course -> course instanceof ExamCourse));
        assertTrue(courses.stream().anyMatch(course -> course instanceof AssignmentCourse));
        assertTrue(courses.stream().anyMatch(course -> course instanceof ResearchCourse));

        CourseManagementMain.evaluateCourses(courses);
    }

    @Test
    void testCourseEvaluation() {
        Course<ExamCourse> examCourse = new Course<>(new ExamCourse("Math 101"));
        Course<AssignmentCourse> assignmentCourse = new Course<>(new AssignmentCourse("History 202"));

        assertDoesNotThrow(examCourse::evaluateCourse);
        assertDoesNotThrow(assignmentCourse::evaluateCourse);
    }
}
