package annotations.exercise.execise5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class BugReportMain {

    public static void main(String[] args) throws Exception {
        TaskManager taskManager = new TaskManager();
        Method method = taskManager.getClass().getMethod("performTask");

        if (method.isAnnotationPresent(BugReports.class)) {
            BugReports bugReports = method.getAnnotation(BugReports.class);
            for (BugReport bugReport : bugReports.value()) {
                System.out.println("Bug Report: " + bugReport.description());
            }
        } else {
            System.out.println("No bug reports available.");
        }
    }
}
