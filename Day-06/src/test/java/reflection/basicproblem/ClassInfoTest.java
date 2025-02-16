package reflection.basicproblem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClassInfoTest {

    @Test
    void testGetClassInformationWithValidClass() {
        String className = "java.lang.String";

        assertDoesNotThrow(() -> ClassInfo.getClassInformation(className));
    }

    @Test
    void testGetClassInformationWithInvalidClass() {
        String className = "nonexistent.ClassName"; // Invalid class
        assertDoesNotThrow(() -> ClassInfo.getClassInformation(className));
    }

    @Test
    void testEmptyClassName() {
        String className = "";
        assertDoesNotThrow(() -> ClassInfo.getClassInformation(className));
    }
}
