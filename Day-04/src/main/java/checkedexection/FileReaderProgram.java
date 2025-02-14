package checkedexection;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderProgram {

    // Method to read and print file contents
    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    public static void main(String[] args) {
        String fileName = "C:\\Users\\Vivek Patel\\OneDrive\\Desktop\\Week-04\\Day-04\\src\\main\\java\\checkedexection\\data.txt";
        readFile(fileName);
    }
}
