package junit.basicproblems.filehandling;



import static org.junit.jupiter.api.Assertions.*;

import junit.basicproblem.filehandling.FileProcessor;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

public class FileProcessorTest {

    FileProcessor fileProcessor = new FileProcessor();
    String filename = "C:\\Users\\Vivek Patel\\OneDrive\\Desktop\\Week-04\\Day-05\\src\\main\\java\\junit\\basicproblem\\filehandling\\test.txt";

    @BeforeEach
    public void setUp() {
        File file = new File(filename);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    public void testWriteToFile() throws IOException {
        String content = "Hello, World!";
        fileProcessor.writeToFile(filename, content);
        String fileContent = fileProcessor.readFromFile(filename);
        assertEquals(content, fileContent);
    }

    @Test
    public void testFileExistsAfterWrite() throws IOException {
        fileProcessor.writeToFile(filename, "Test Content");
        assertTrue(Files.exists(Paths.get(filename)));
    }

    @Test
    public void testIOExceptionWhenFileNotExist() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("C:\\Users\\yugap\\OneDrive\\Desktop\\cap\\Week_04\\Day05\\src\\test\\java\\junitproblem\\basicproblem\\filehandling\\testfile.txt"));
    }

    @AfterEach
    public void tearDown() {
        File file = new File(filename);
        if (file.exists()) {
            file.delete();
        }
    }
}