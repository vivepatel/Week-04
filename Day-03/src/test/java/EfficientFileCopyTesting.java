import bufferedstreams.EfficientFileCopy;
import bufferedstreams.EfficientFileCopy.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class EfficientFileCopyTesting {
    private static final String TEST_SOURCE = "src/main/java/sourceFile";
    private static final String TEST_DEST = "src/test/java/DestFile";

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
    void testBufferedCopy() throws IOException {
        EfficientFileCopy.copyUsingBufferedStreams(TEST_SOURCE, TEST_DEST);
        assertTrue(Files.exists(Paths.get(TEST_DEST)));
        assertEquals(Files.readString(Paths.get(TEST_SOURCE)), Files.readString(Paths.get(TEST_DEST)));
    }
}