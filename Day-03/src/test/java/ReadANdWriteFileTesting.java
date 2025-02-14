import org.junit.jupiter.api.*;

import java.io.IOException;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import filehandling.ReadAndWriteFile;

public class ReadANdWriteFileTesting {
    private static final String TEST_SOURCE = "src/main/java/source";
    private static final String TEST_DEST = "src/main/java/filehandling/destinationFile";

    @BeforeEach
    void setup() throws IOException {
        Files.write(Paths.get(TEST_SOURCE), "Hello, World!".getBytes());
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_SOURCE));
        Files.deleteIfExists(Paths.get(TEST_DEST));
    }

    @Test
    void testCopyFile() throws IOException {

        assertTrue(Files.exists(Paths.get(TEST_DEST)));
        assertEquals(Files.readString(Paths.get(TEST_SOURCE)), Files.readString(Paths.get(TEST_DEST)));
    }


}
