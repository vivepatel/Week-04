package reflection.basicproblem;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("reflection.basicproblem.Student");
            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
            Object student = constructor.newInstance("Ankit", 20);
            System.out.println("Student object created dynamically.");
            Method method = clazz.getMethod("display");
            method.invoke(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
