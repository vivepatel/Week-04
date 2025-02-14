package trywithresources;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    // Method to read the first line of a file using try-with-resources
    public static void readFirstLine(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String firstLine = reader.readLine();
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

    public static void main(String[] args) {
        String fileName = "C:\\Users\\Vivek Patel\\OneDrive\\Desktop\\Week-04\\Day-04\\src\\main\\java\\trywithresources\\info.txt";
        readFirstLine(fileName);
    }
}
