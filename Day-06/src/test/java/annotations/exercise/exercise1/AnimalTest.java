package annotations.exercise.exercise1;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    @Test
    public void testMakeSound() {
        Animal animal = new Animal();

        animal.makeSound();
    }

    @Test
    public void testDogMakeSound() {
        Dog dog = new Dog();

        dog.makeSound();
    }
}
