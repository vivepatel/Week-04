package annotations.exercise.exercise3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CreateAndPrintListTest {

    @Test
    public void testCreateAndPrintList() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        PrintStream originalSystemOut = System.out;

        System.setOut(printStream);

        CreateAndPrintList.createAndPrintList();


        System.setOut(originalSystemOut);

        String output = outputStream.toString().trim();
        assertEquals("String element: Hello", output.split("\n")[0]);
        assertEquals("Integer element: 123", output.split("\n")[1]);
    }
}
