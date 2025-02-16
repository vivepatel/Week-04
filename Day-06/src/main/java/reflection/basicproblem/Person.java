package reflection.basicproblem;
import java.lang.reflect.Field;
public class Person {
    private int age;
    public Person(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person(25);

        System.out.println("Before reflection, age: " + person.getAge());

        try {

            Field field = Person.class.getDeclaredField("age");
            field.setAccessible(true);


            field.set(person, 30);
            System.out.println("After reflection, age: " + person.getAge());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
