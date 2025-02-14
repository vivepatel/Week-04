import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.ArrayList;
import read_large_file.ReadLargeFile;
class ReadLargeFileTesting {
    private static final String TEST_FILE = "src/main/java/source";

    @BeforeEach
    void setup() throws IOException {
        List<String> lines = new ArrayList<>();
        lines.add("This is a normal line.");
        lines.add("An error occurred in the system.");
        lines.add("All systems are functional.");
        lines.add("Critical ERROR detected.");
        Files.write(Paths.get(TEST_FILE), lines);
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testReadLargeFile() throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        ReadLargeFile.readLargeFile(TEST_FILE);

        System.setOut(originalOut);
        String output = outputStream.toString().trim();

        assertTrue(output.contains("An error occurred in the system."));
        assertTrue(output.contains("Critical ERROR detected."));
        assertFalse(output.contains("This is a normal line."));
    }
}
