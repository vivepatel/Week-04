import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import piped_streams.*;
public class PipedStreamTesting {
    private PipedOutputStream pos;
    private PipedInputStream pis;

    @BeforeEach
    void setup() throws IOException {
        pos = new PipedOutputStream();
        pis = new PipedInputStream(pos);
    }

    @AfterEach
    void cleanup() throws IOException {
        pos.close();
        pis.close();
    }

    @Test
    void testInterThreadCommunication() throws IOException, InterruptedException {
        WriterThread writer = new WriterThread(pos);
        ReaderThread reader = new ReaderThread(pis);

        writer.start();
        reader.start();

        writer.join();
        reader.join();

        assertEquals("Hello from WriterThread!", reader);
    }
}
