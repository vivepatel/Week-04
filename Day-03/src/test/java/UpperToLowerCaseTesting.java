import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;
import filter_streams.UppercaseToLowercase;
class UpperToLowerCaseTesting {
    private static final String INPUT_FILE = "src/main/java/filter_streams/input_File";
    private static final String OUTPUT_FILE = "src/main/java/filter_streams/output_File";

    @BeforeEach
    void setup() throws IOException {
        Files.writeString(Paths.get(INPUT_FILE), "HELLO WORLD\nJAVA PROGRAMMING\nTESTING FILES\n");
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(INPUT_FILE));
        Files.deleteIfExists(Paths.get(OUTPUT_FILE));
    }

    @Test
    void testConvertFileToLowercase() throws IOException {
        UppercaseToLowercase.convertFile(INPUT_FILE, OUTPUT_FILE);
        assertTrue(Files.exists(Paths.get(OUTPUT_FILE)));

        String content = Files.readString(Paths.get(OUTPUT_FILE));
        assertEquals("hello world\njava programming\ntesting files\n", content);

    }
}
