package reflection.intermediateproblem;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

public class Book {

    @Author(name = "Ankit Patel")
    public class BookClass {

        public void display() {
            System.out.println("This is a Book class.");
        }
    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = Book.class.getDeclaredClasses()[0];
            Author authorAnnotation = clazz.getAnnotation(Author.class);

            if (authorAnnotation != null) {
                System.out.println("Author: " + authorAnnotation.name());
            } else {
                System.out.println("No Author annotation found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
