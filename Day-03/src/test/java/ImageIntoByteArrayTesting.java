import static org.junit.jupiter.api.Assertions.*;

import byte_array_stream.ImageIntoByteArray;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;
import byte_array_stream.ImageIntoByteArray.*;
class ImageIntoByteArrayTesting {
    private static final String TEST_IMAGE = "test_input.jpg";
    private static final String OUTPUT_IMAGE = "test_output.jpg";

    @BeforeEach
    void setup() throws IOException {
        byte[] sampleImage = new byte[]{(byte) 255, (byte) 216, (byte) 255, (byte) 224}; // Sample JPEG header
        Files.write(Paths.get(TEST_IMAGE), sampleImage);
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_IMAGE));
        Files.deleteIfExists(Paths.get(OUTPUT_IMAGE));
    }

    @Test
    void testImageToByteArrayAndBack() throws IOException {
        byte[] imageBytes = ImageIntoByteArray.imageToByteArray(TEST_IMAGE);
        assertNotNull(imageBytes);
        assertTrue(imageBytes.length > 0);

        ImageIntoByteArray.byteArrayToImage(imageBytes, OUTPUT_IMAGE);
        assertTrue(Files.exists(Paths.get(OUTPUT_IMAGE)));

        byte[] outputBytes = Files.readAllBytes(Paths.get(OUTPUT_IMAGE));
        assertArrayEquals(imageBytes, outputBytes);
    }
}

