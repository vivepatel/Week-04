package reflection.intermediateproblem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    void testAuthorAnnotation() {
        try {
            Class<?> clazz = Book.class.getDeclaredClasses()[0];
            Author authorAnnotation = clazz.getAnnotation(Author.class);

            assertNotNull(authorAnnotation);
            assertEquals("Ankit Patel", authorAnnotation.name());
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception occurred while retrieving the annotation");
        }
    }

    @Test
    void testNoAuthorAnnotation() {
        try {
            Class<?> clazz = String.class;
            Author authorAnnotation = clazz.getAnnotation(Author.class);

            assertNull(authorAnnotation);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception occurred while checking for annotation");
        }
    }
}
