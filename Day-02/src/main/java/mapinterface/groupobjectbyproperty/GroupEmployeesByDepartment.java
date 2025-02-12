package mapinterface.groupobjectbyproperty;

import java.util.*;
import java.util.stream.Collectors;

// Enum for Department
enum Department {
    HR,
    IT,
    SALES,
    MARKETING
}

// Employee class with name and department
class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupEmployeesByDepartment {

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", Department.HR),
                new Employee("Bob", Department.IT),
                new Employee("Carol", Department.HR)
        );

        // Group employees by department and print the result
        Map<Department, List<Employee>> groupedEmployees = groupByDepartment(employees);
        groupedEmployees.forEach((department, employeeList) -> {
            System.out.println(department + ": " + employeeList);
        });
    }

    // Function to group employees by their department
    public static Map<Department, List<Employee>> groupByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }
}
