package read_large_file;

import java.io.*;

public class ReadLargeFile {
    public static void readLargeFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "src/main/java/sourceFile";
        readLargeFile(filePath);
    }
}
