import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import serialization.*;
class EmployeeSerializationTest {
    private static final String TEST_FILE = "src/main/java/serialization/employeeData";

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testSerializationAndDeserialization() throws IOException, ClassNotFoundException {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Muskan", "HR", 80000),
                new Employee(2, "Nancy", "IT", 60000)
        );

        EmployeeSerialization.serializeEmployees(employees);
        assertTrue(Files.exists(Paths.get(TEST_FILE)));

        List<Employee> deserializedEmployees = EmployeeSerialization.deserializeEmployees();
        assertNotNull(deserializedEmployees);
        assertEquals(2, deserializedEmployees.size());
        assertEquals("Muskan", deserializedEmployees.get(0).toString().split(",")[1].split("=")[1].replace("'", ""));
        assertEquals("Nancy", deserializedEmployees.get(1).toString().split(",")[1].split("=")[1].replace("'", ""));
    }
}
