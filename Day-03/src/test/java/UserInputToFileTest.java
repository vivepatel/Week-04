import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;
import read_user_input_from_console.ReadUserInput;
class UserInputToFileTest {
    private static final String TEST_FILE = "src/main/java/source";

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testSaveUserInput() throws IOException {
        String simulatedInput = "Muskan\n21\nJava\n";
        InputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        assertTrue(Files.exists(Paths.get(TEST_FILE)));
        String content = Files.readString(Paths.get(TEST_FILE));
        assertTrue(content.contains("Name: Muskan"));
        assertTrue(content.contains("Age: 21"));
        assertTrue(content.contains("Favorite Language: Java"));
    }
}
