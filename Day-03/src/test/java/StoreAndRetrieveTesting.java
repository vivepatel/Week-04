import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;
import data_streams.StoreAndRetrievePrimitiveData;
class StoreAndRetrieveTesting {
    private static final String TEST_FILE = "test_student_data.dat";

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testSaveAndRetrieveStudentData() throws IOException {
        StoreAndRetrievePrimitiveData.writeStudentData(101, "Muskan", 9.5);
        StoreAndRetrievePrimitiveData.writeStudentData(102, "Nancy", 9.1);

    }
}