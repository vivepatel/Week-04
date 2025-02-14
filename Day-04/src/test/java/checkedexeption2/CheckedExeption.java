package checkedexeption2;
import checkedexection.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class FileReaderProgramTest {

    @Test
    void testReadFile(@TempDir Path tempDir) throws IOException {
        // Create a temporary file
        File tempFile = tempDir.resolve("C:\\Users\\Vivek Patel\\OneDrive\\Desktop\\Week-04\\Day-04\\src\\test\\java\\checkedexeption2\\data1.txt").toFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Hello, world!\nThis is a test file.");
        }

        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the method
        FileReaderProgram.readFile(tempFile.getAbsolutePath());

        // Restore console output
        System.setOut(originalOut);

        // Verify output
        String expectedOutput = "Hello, world!\nThis is a test file.\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void testReadFile_FileNotFound() {
        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call method with a non-existing file
        FileReaderProgram.readFile("non_existent_file.txt");

        // Restore console output
        System.setOut(originalOut);

        // Verify output
        assertEquals("File not found\n", outputStream.toString());
    }
}

