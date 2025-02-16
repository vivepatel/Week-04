package reflection.advancedproblem.jsonconverter;
public class Person {
    private String name;
    private int age;
    private boolean isEmployed;

    public Person(String name, int age, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.isEmployed = isEmployed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }
}

