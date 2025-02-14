package filter_streams;
import java.io.*;

public class UppercaseToLowercase {
    public static void convertFile(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }
            System.out.println("Conversion completed successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String inputFile = "src/main/java/filter_streams/input_File";
        String outputFile = "src/main/java/filter_streams/output_File";

        convertFile(inputFile, outputFile);
    }
}

